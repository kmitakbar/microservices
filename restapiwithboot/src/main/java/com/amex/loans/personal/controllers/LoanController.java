package com.amex.loans.personal.controllers;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.amex.loans.personal.model.Loan;
import com.amex.loans.personal.service.LoanService;

@RestController
@RequestMapping("/loan")
public class LoanController {

	@Autowired
	LoanService loanService;
	
	List<Loan> loans;
	@GetMapping("/ping")
	public String ping() {
		return "app is running!";
	}
	
	@GetMapping("/allloans")
	public List<Loan> getLoans(){
		return loanService.getLoans();
	}
	
	@PostMapping("/newloan")
	public String createNewLoan(@RequestBody Loan loan) {
		int status=loanService.createNewLoan(loan);
		if(status==1)
		return "loan created success";
		else 
			return "creation failed!";
	}
	
	@PostConstruct
	public void init() {
		loans=new ArrayList<>();
		loans.add(new Loan(100L, "Test", "test@gmail.com", "12345", 100000.0, 1000.0, 60));
		loans.add(new Loan(101L, "Demo", "demo@gmail.com", "123456", 200000.0, 2000.0, 60));
	}
}
