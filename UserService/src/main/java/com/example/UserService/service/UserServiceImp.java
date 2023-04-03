package com.example.UserService.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.UserService.entity.User;

@Service
public class UserServiceImp implements UserService {

	List<User> list = List.of(new User(1311L, "Harsha", "7829392309279"), new User(1321L, "Harry", "9264238926928"),
			new User(1234L, "Vardhan", "63289289230"));

	@Override
	public User getUser(Long id) {
		
		return this.list.stream().filter(user -> user.getUserId().equals(id)).findAny().orElse(null);
	}   
}
