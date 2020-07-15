package com.amex.loans.personal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@PropertySource("classpath:${env}/application.properties")
public class RestapiwithjpabootApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestapiwithjpabootApplication.class, args);
	}

}
