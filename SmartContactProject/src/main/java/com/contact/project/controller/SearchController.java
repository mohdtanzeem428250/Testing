//package com.contact.project.controller;
//import com.contact.project.UserRepository.*;
//import org.springframework.web.bind.annotation.RestController;
//import java.security.Principal;
//import com.contact.project.entity.User;
//import java.util.List;
//import com.contact.project.entity.Contact;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.beans.factory.annotation.Autowired;
//import com.contact.project.UserRepository.ContactRepository;
//@RestController
//public class SearchController 
//{
//	@Autowired
//	private UserRepository userRepository;
//	@Autowired
//	private ContactRepository contactRepository;
//	
//	@GetMapping("/search/{query}")
//	public ResponseEntity<?> search(@PathVariable("query") String query,Principal principal)
//	{
//		System.out.println(query);
//		User user=this.userRepository.getUserByUserName(principal.getName());
//		List<Contact> contact=this.contactRepository.findByNameContainingAndUser(query,user);
//		return ResponseEntity.ok(contact);
//	}
//}
