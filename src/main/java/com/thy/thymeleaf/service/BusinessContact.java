package com.thy.thymeleaf.service;

import java.util.ArrayList;
import java.util.List;

import com.thy.thymeleaf.domain.Contact;

public class BusinessContact {
	public List<Contact> business = new ArrayList<Contact>();
	public List<Contact> listContact(){
		business.add(new Contact("Alin Schatje","alinschatje@gmail.nl","Hengelo"));
		business.add(new Contact("John Boss","johnboss@gmail.nl","Hengelo"));
		business.add(new Contact("Peter Csehowski","petercsehowski@gmail.nl","Deventer"));
		business.add(new Contact("Poci Istvan","bistvanus@gmail.com","Gheorghenir"));
		return business;
	}

}
