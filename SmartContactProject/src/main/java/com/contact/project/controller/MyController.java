package com.contact.project.controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import jakarta.servlet.http.HttpSession;
import com.contact.project.UserRepository.*;
import java.security.Principal;
import java.util.Random;
import com.contact.service.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.contact.project.entity.User;
import com.contact.project.entity.Query;
import com.contact.project.helper.Message;
import javax.validation.Valid;
import org.springframework.validation.BindingResult;
@Controller
public class MyController 
{
	@Autowired
	private UserRepository userRepository;
	@Autowired
	private BCryptPasswordEncoder passwordEncoder;
	@Autowired
	private QueryRepository queryRepository;
	@Autowired
	private EmailService emailService;
	@GetMapping("/")
	public String homeHandler(Model model)
	{
		model.addAttribute("title","Home Smart Contact Manager");
		return "home";
	}
	@GetMapping("/about")
	public String aboutHandler()
	{
//		model.addAttribute("title","About Smart Contact Manager");
		return "about";
	}
	@GetMapping("/contact")
	public String contact()
	{
		return "contact";
	}
	@GetMapping("/signup")
	public String signupHandler(Model model)
	{
		model.addAttribute("title","Sign-Up Smart Contact Manager");
		model.addAttribute("user",new User());
 		return "signup";
	}					
	@GetMapping("/signin")
	public String login(Model model)
	{
		model.addAttribute("title","Login Smart Contact Manager");
		return "login";
	}
//	@RequestMapping(value="/register",method=RequestMethod.POST)
	@GetMapping("/register")
	public String registerHandler(@Valid @ModelAttribute("user") User user1,BindingResult result,@RequestParam(value="agreement",defaultValue="false")boolean agreement1,Model model,HttpSession session)
	{
		try
		{
			if(!agreement1)
			{
				throw new Exception("You Have Not Agreed The Terms And Conditions");
			}
			if(result.hasErrors())
			{
				System.out.println("Error "+result.toString());
				model.addAttribute("user",user1);
				return "signup";
			}
			user1.setRole("ROLE_USER");
			user1.setEnabled(true);
			user1.setImage("default.png");
			user1.setPassword(passwordEncoder.encode(user1.getPassword()));
			System.out.println("Agreement "+agreement1);
			System.out.println("User "+user1);
			
			User result1=this.userRepository.save(user1);
			model.addAttribute("user",new User());
			session.setAttribute("message",new Message("Successfully Registered !!","alert-success"));
			return "signup";
		}
		catch(Exception exception)
		{
			exception.printStackTrace();
			model.addAttribute("user",user1);
			session.setAttribute("message",new Message("Something Went Wrong !!"+exception.getMessage(),"alert-danger"));
			return "signup";
		}
	}
	@RequestMapping(value="/submitcontact",method=RequestMethod.POST)
	public String contactUs(@ModelAttribute("query") Query query,Principal principal)
	{
		
		query.setName(query.getName()); 
		
		query.setEmail(query.getEmail());
		query.setMessage(query.getMessage());
		this.queryRepository.save(query);
		return "/contact";
	}
	@GetMapping("/forget_password")
	public String forgetPassword()
	{
		return "forget_password_form";
	}
	@RequestMapping(value="/sendOTP",method=RequestMethod.POST)
	public String sendOtp(@RequestParam("email") String email,HttpSession session,Model model)
	{
		model.addAttribute("title","Verify OPT");
		Random random=new Random(100000);
		System.out.println(email);
		int otp=random.nextInt(999999);
		System.out.println("OPT "+otp);
		String from="mtanzeem115@gmail.com";
		String subject="OTP Form SCM"; 
		String message="<h1>OTP = "+otp+"</h1>";
		String to=email;
		boolean flag=this.emailService.sendEmail(message,subject,to,from);
		if(flag)
		{
			session.setAttribute("myotp",otp);
			session.setAttribute("email",email);
			session.setAttribute("message",new Message("OTP has been se nd successfully...","alert-success"));
			model.addAttribute("title","Verify OTP");
			return "varify_OTP";
		}
		else
		{	
			session.setAttribute("message",new Message("Email Id is Incorrent...","alert-danger"));
			model.addAttribute("title","Forget Password");
			return "forget_pasword_form";
		}
	}
}
