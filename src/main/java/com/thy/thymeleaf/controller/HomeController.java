package com.thy.thymeleaf.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.thy.thymeleaf.domain.Contact;
import com.thy.thymeleaf.service.ContactService;

@Controller
public class HomeController {
	private ContactService contactService;
	
	@Autowired
	public void setContactService(ContactService contactService) {
		this.contactService = contactService;
	}
	
	@RequestMapping("/list_contacts")
	public String listContacts(Model model) {
		model.addAttribute("contacts",contactService.getContacts());
		return "contact";
	}
	
	@RequestMapping("/form")
	public String inputForm(Model model) {
		model.addAttribute("contact", new Contact("","",""));
		return "form";
	}
	@PostMapping("/form")
	public String submitForm(@ModelAttribute("contact") Contact contact) {
		contactService.saveContact(contact);
		
	    return "add_success";
	}
}
