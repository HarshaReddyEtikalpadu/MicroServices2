package com.example.UserService.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.UserService.entity.User;
import com.example.UserService.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserService userService;

	@Autowired
	private RestTemplate restTemplate;

	@GetMapping("/{userId}")
	public User getUser(@PathVariable("userId") Long userId) {

		User user = this.userService.getUser(userId);

		List contacts = this.restTemplate.getForObject("http://CONTACTSSERVICE/contact/user/" + user.getUserId(),
				List.class);
									
		user.setContacts(contacts);
		return user;
	}

}
