package com.training.spring.soap.consumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.training.spring.soap.consumer.client.UserRequest;
import com.training.spring.soap.consumer.client.UserResponse;

@SpringBootApplication
@RestController
public class SoapbootconsumerApplication {

	@Autowired
	UserService service;
	
	public static void main(String[] args) {
		SpringApplication.run(SoapbootconsumerApplication.class, args);
	}

	@PostMapping("/getuser")
	public UserResponse getUser(@RequestBody UserRequest request) {
		System.out.println("in ctrl::"+request);
		return service.getUser(request);
	}
}
