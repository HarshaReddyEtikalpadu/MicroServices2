package com.example.ApiGateway.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallBackController {
	
	@GetMapping("/userServiceFallBack")
	public String userServicefallBack() {
		return "User sevice is diwn at this time...!";
	}
	
	@GetMapping("/contactServiceFallBack")
	public String contactServicefallBack() {
		return "Contact sevice is diwn at this time...!";
	}
	
}
