package com.amex.loans.personal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("/aws")
public class RestapiwithawsApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestapiwithawsApplication.class, args);
	}
	
	@GetMapping("/hi")
	public String sayHello(@RequestParam String name) {
		return "Hello AWS::"+name;
	}

}
