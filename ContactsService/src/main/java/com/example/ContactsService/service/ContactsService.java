package com.example.ContactsService.service;

import java.util.List;

import com.example.ContactsService.entity.Contacts;

public interface ContactsService {
	
	public List<Contacts> getContactsOfUser(Long userId);

	
	

}
