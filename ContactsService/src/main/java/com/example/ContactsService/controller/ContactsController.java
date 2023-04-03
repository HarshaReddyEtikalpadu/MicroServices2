package com.example.ContactsService.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.ContactsService.entity.Contacts;
import com.example.ContactsService.service.ContactsService;

@RestController
@RequestMapping("/contact")
public class ContactsController {
	
	@Autowired
	private ContactsService contactsService;
	
	@GetMapping("/user/{userId}")
	public List<Contacts> getContacts(@PathVariable("userId") Long userId){
		
		return this.contactsService.getContactsOfUser(userId);
		
	}

}
