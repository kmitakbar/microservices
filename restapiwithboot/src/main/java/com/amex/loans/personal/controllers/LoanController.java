package com.amex.loans.personal.controllers;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.amex.loans.personal.model.Loan;

@RestController
@RequestMapping("/loan")
public class LoanController {

	List<Loan> loans;
	@GetMapping("/ping")
	public String ping() {
		return "app is running!";
	}
	
	@GetMapping("/allloans")
	public List<Loan> getLoans(){
		return loans;
	}
	
	@PostConstruct
	public void init() {
		loans=new ArrayList<>();
		loans.add(new Loan("100", "Test", "test@gmail.com", "12345", 100000L, 1000L, 60));
		loans.add(new Loan("101", "Demo", "demo@gmail.com", "123456", 200000L, 2000L, 60));
	}
}
