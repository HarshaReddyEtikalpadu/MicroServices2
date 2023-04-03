package com.example.ContactsService.service;

import java.util.List;
//import java.util.stream.Collectors;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.example.ContactsService.entity.Contacts;

@Service
public class ContactsServiceImp implements ContactsService {

	List<Contacts> list = List.of(new Contacts(1L, "Harhsa@gmail.com", "Harsha", 1311L),
			new Contacts(4L, "HVR@gmail.com", "HVR", 1311L), 
			new Contacts(2L, "vardhan@gmail.com", "vardhan", 1321L),
			new Contacts(3L, "Harry@gmail.com", "Harry", 1234L)

	);

	public List<Contacts> getContactsOfUser(Long userId) {
		return list.stream().filter(contacts -> contacts.getUserId().equals(userId)).collect(Collectors.toList());
	}

}
            