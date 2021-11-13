package com.thy.thymeleaf.service;

import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.thy.thymeleaf.domain.Contact;
import com.thy.thymeleaf.repository.ContactRepository;

@Service
public class ContactService {
	private ContactRepository contactRepo;
	
	@Autowired
	public void setContactRepo(ContactRepository contactRepo) {
		this.contactRepo = contactRepo;
	}
	
	public List<Contact> getContacts(){
		return contactRepo.findAll();
	}
	public Contact saveContact(Contact contact) {
		return contactRepo.save(contact);
	}
	
//	@PostConstruct
//	public void init() {
//		contactRepo.save(new Contact("Aileen Schatje","aileenschatje@gmail.nl","Hengelo"));
//		contactRepo.save(new Contact("John Boss","johnboss@gmail.nl","Hengelo"));
//		contactRepo.save(new Contact("Peter Csehowski","petercsehowski@gmail.nl","Deventer"));
//		contactRepo.save(new Contact("Poci Istvan","bistvanus@gmail.com","Gheorghenir"));
//	}

}
