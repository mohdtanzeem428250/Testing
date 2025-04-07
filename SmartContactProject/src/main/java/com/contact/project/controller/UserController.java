package com.contact.project.controller;
import com.contact.project.entity.Contact;
import com.contact.project.entity.MyOrder;
import java.util.Optional;
import jakarta.servlet.http.HttpSession;
import java.util.List;
import java.util.Map;
import java.security.Principal;
import com.contact.project.helper.Message;
import org.json.JSONObject;
import com.razorpay.RazorpayClient;
import com.razorpay.RazorpayException;
import com.razorpay.Order;
import org.springframework.web.bind.annotation.RequestMethod;

import org.springframework.ui.Model;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.security.crypto.bcrypt.BCrypt;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

//import org.springframework.core.io.ClassPathResource;
//import java.io.File;
//import java.nio.file.Files;
//import java.nio.file.Paths;
//import java.nio.file.StandardCopyOption;
//import java.nio.file.Path;
import com.contact.project.UserRepository.UserRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
//import org.springframework.web.multipart.MultipartFile; 
import org.springframework.stereotype.Controller;
import com.contact.project.entity.User;
import com.contact.project.UserRepository.ContactRepository;
import com.contact.project.UserRepository.MyOrderRepoository;
import org.springframework.data.domain.Page;
@Controller
@RequestMapping("/user")
public class UserController 
{
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private ContactRepository contactRepository;
	
	@Autowired
	private BCryptPasswordEncoder bCryptPasswordEncoder;
	
	@Autowired
	private MyOrderRepoository myOrderRepository;
	
	@ModelAttribute
	public void addCommon(Model model,Principal principal)
	{
		String username=principal.getName();
		System.out.println("Username :- "+username);
		
		User user=userRepository.getUserByUserName(username);
		System.out.println("User :- "+user);
		model.addAttribute("user",user);	
	}
	
	@GetMapping("/index")
	public String User(Model model,Principal principal)
	{
		model.addAttribute("title","User Dashboard");
		return "normal/dashboard";
	}
	@GetMapping("/add_contact")
	public String openAddContactForm(Model model)
	{
		
		model.addAttribute("title","Add Contact");
		model.addAttribute("contact",new Contact());
		return "normal/add_contact_form";
	}
	@RequestMapping(value="/process_contact",method=RequestMethod.POST)
	public String saveContact(@ModelAttribute Contact contact,Principal principal,HttpSession session/*,@RequestParam("image") MultipartFile file*/)
	{
		try
		{
			String name=principal.getName();
			User user=this.userRepository.getUserByUserName(name);
			contact.setUser(user);
			user.getList().add(contact);
			this.userRepository.save(user);
			System.out.println("Added To Database");
			System.out.println("Date"+contact);
			session.setAttribute("message",new Message("Your Contact Is Added !! Add More...","success"));
		}
		catch(Exception exception)
		{
			System.out.println("Errors"+exception.getMessage());
			exception.printStackTrace();
			session.setAttribute("message",new Message("Some Thing Went Wrong !! Try Again","danger"));
		}
		return "normal/add_contact_form";
	}
	@GetMapping("/view_Contact/{pages}")
	public String viewContacts(@PathVariable("pages") Integer page,Model model,Principal principal)
	{
		model.addAttribute("title","Show Users Contacts");
		String userName=principal.getName();
		User user=this.userRepository.getUserByUserName(userName);
		Pageable pageable=PageRequest.of(page, 8);
		Page<Contact> contact=this.contactRepository.findContactsByUser(user.getId(),pageable);
		model.addAttribute("contact",contact);
		model.addAttribute("currentPage",page);
		model.addAttribute("totalPages",contact.getTotalPages());
		return "normal/all_contact";
	}
	@RequestMapping("/contact/{contactId}")
	public String showDetails(@PathVariable("contactId") Integer id,Model model,Principal principal)
	{
		System.out.println("Id"+id);
		Optional<Contact> contactoptional=this.contactRepository.findById(id);
		Contact contact=contactoptional.get();
		String username=principal.getName();
		User user=this.userRepository.getUserByUserName(username);
		if(user.getId()==contact.getUser().getId())
		{
			model.addAttribute("contact",contact);
			model.addAttribute("title",contact.getFirstname());
		}
		return "normal/show_details";
	}
	@RequestMapping("/delete/{contactId}")
	public String deleteContact(@PathVariable("contactId") Integer id,Model model,Principal principal,HttpSession session)
	{
		Optional<Contact> contactoptional=this.contactRepository.findById(id);
		Contact contact=contactoptional.get();
		String name=principal.getName();
		User user=this.userRepository.getUserByUserName(name);
		if(user.getId()==contact.getUser().getId())
		{
			user.getList().remove(contact);
			this.contactRepository.deleteById(id);
			session.setAttribute("message",new Message("Contact Deleted Successfully...","success"));
		}
			
			
		return  "redirect:/user/View_Contact/0";
	}
	@RequestMapping("/updateContact/{uid}")  
	public String updateContact(@PathVariable("uid") Integer id,Model model,Principal principal,HttpSession session)
	{
		model.addAttribute("title","Update Contact");
		Contact contact=this.contactRepository.findById(id).get();
		model.addAttribute("contact",contact);
		return "normal/update_Contact";
	}
	@RequestMapping(value="/process_update",method=RequestMethod.POST)
	public String updateHandler(@ModelAttribute Contact contact,Model model,Principal principal,HttpSession session)
	{
		try
		{
			User user=this.userRepository.getUserByUserName(principal.getName());
			contact.setUser(user);
			this.contactRepository.save(contact);
			session.setAttribute("message",new Message("Your Contact Is Updated...","success"));
		}
		catch(Exception exception)
		{
			exception.printStackTrace();
		}
		return "redirect:/user/contact/"+contact.getContactId();
	}
	@GetMapping("/your_profile")
	public String profile(Model model)
	{
		model.addAttribute("title","Your Profile Page");
		return "normal/profile";
	}
	@GetMapping("/settings")
	public String openSetting()
	{
		return "normal/setting";
	}
	@RequestMapping(value="/change_password",method=RequestMethod.POST)
	public String changePassword(@RequestParam("old") String oldPassword,@RequestParam("new") String newPassword,Principal principal,HttpSession session)
	{
		String username=principal.getName();
		User currentUser=this.userRepository.getUserByUserName(username);
		if(this.bCryptPasswordEncoder.matches(oldPassword,currentUser.getPassword()))
		{
			currentUser.setPassword(this.bCryptPasswordEncoder.encode(newPassword));
			this.userRepository.save(currentUser);
			session.setAttribute("message",new Message("Your Password Is Successfully Changed...","success"));
		}
		else
		{
			session.setAttribute("message",new Message("Please Enter Correct Old Password...","danger"));
			return "redirect:/user/setting";
		}
		return "redirect:/user/index";
	} 
	@PostMapping("/create_order")
	@ResponseBody
	public String createOrder(@RequestBody Map<String,Object> data,Principal principal) throws RazorpayException
	{
		System.out.println(data);
		int amt=Integer.parseInt(data.get("amount").toString());
		RazorpayClient client=new RazorpayClient("rzp_test_AD9TqbCPT4a9ul","VYQmm1ssa9oAuzf8ZhkYiyek");
			JSONObject object=new JSONObject();
			object.put("amount",amt*100); 
			object.put("currency","INR");
			object.put("receipt","txn_235425");
			Order order=client.Orders.create(object);
			System.out.println(order);
			MyOrder myOrder=new MyOrder(); 
			myOrder.setAmount(order.get("amount")+"");
			myOrder.setOrderId(order.get("id"));
			myOrder.setPaymentId(null);  
			myOrder.setStatus("created");
			myOrder.setUser(this.userRepository.getUserByUserName(principal.getName()));
			myOrder.setReceipt(order.get("receipt"));
			this.myOrderRepository.save(myOrder);
			return order.toString();
	}
	@PostMapping("/update_order")
	public ResponseEntity<?> updateOrder(@RequestBody Map<String ,Object> data)
	{
		MyOrder myOrder=this.myOrderRepository.findByorderId(data.get("id").toString());
		myOrder.setPaymentId(data.get("paymentId").toString());
		myOrder.setStatus(data.get("status").toString());
		this.myOrderRepository.save(myOrder);
		return ResponseEntity.ok(Map.of("message","Updated "));
	}
}
