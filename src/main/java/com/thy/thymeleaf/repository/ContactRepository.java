package com.thy.thymeleaf.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.thy.thymeleaf.domain.Contact;

public interface ContactRepository extends CrudRepository<Contact, Long> {
	
	List<Contact> findAll();

}
