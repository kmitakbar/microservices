package com.amex.loans.telecaller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("/caller")
public class TelecallerApplication {

	public static void main(String[] args) {
		SpringApplication.run(TelecallerApplication.class, args);
	}

	@GetMapping("/issues")
	public String getIssues() {
		return "few issues from server2";
	}
}
