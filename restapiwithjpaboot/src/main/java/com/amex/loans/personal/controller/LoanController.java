package com.amex.loans.personal.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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

	Logger LOG=LoggerFactory.getLogger(LoanController.class);
	
	@Autowired
	LoanService loanService;
	
	@GetMapping("all")
	public List<Loan> getAllLoans(){
		LOG.debug("incontrller get loans debug");
		LOG.info("incontrller get loans info");
		LOG.trace("incontrller get loans trace");
		LOG.warn("incontrller get loans warn ");
		LOG.error("incontrller get loans error");
		return loanService.getLoans();
	}
	
	@PostMapping("create")
	public Loan sava(@RequestBody Loan loan){
		return loanService.createNew(loan);
	}
}
