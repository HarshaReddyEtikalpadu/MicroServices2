package com.example.UserService.entity;

import java.util.ArrayList;
import java.util.List;

public class User {

	private Long userId;
	private String name;
	private String phone;

	List<Contacts> contacts = new ArrayList<>();

	public User(Long userId, String name, String phone, List<Contacts> contacts) {
		super();
		this.userId = userId;
		this.name = name;
		this.phone = phone;
		this.contacts = contacts;
	}

	public User(Long userId, String name, String phone) {
		super();
		this.userId = userId;
		this.name = name;
		this.phone = phone;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId)
	{
		this.userId = userId;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public String getPhone()
	{
		return phone;
	}

	public void setPhone(String phone)
	{
		this.phone = phone;
	}

	public List<Contacts> getContacts()
	{
		return contacts;
	}

	public void setContacts(List<Contacts> contacts)
	{
		this.contacts = contacts;
	}

}
