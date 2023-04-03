package com.example.ContactsService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ContactsServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ContactsServiceApplication.class, args);
	}

}
