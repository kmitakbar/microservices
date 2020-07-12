package com.amex.loans.personal.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.amex.loans.personal.model.Loan;
import com.amex.loans.personal.service.LoanService;

@RestController
@RequestMapping("/api/loans")
public class LoanController {

	@Autowired
	LoanService loanService;
	
	@GetMapping("all")
	public List<Loan> getAllLoans(){
		return loanService.getLoans();
	}
	
	@PostMapping("create")
	public Loan sava(@RequestBody Loan loan){
		return loanService.createNew(loan);
	}
}
