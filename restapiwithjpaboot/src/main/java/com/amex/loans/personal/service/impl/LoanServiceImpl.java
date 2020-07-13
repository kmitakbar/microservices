package com.amex.loans.personal.service.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.amex.loans.personal.controller.LoanController;
import com.amex.loans.personal.dao.LoanDao;
import com.amex.loans.personal.model.Loan;
import com.amex.loans.personal.service.LoanService;

@Service
public class LoanServiceImpl implements LoanService {

	Logger LOG=LoggerFactory.getLogger(LoanServiceImpl.class);
	
	@Autowired
	LoanDao loanDao;
	
	
	@Override
	public List<Loan> getLoans() {
		return loanDao.findAll();
	}
	@Override
	public Loan createNew(Loan loan) {
		
		return loanDao.save(loan);
	}

}
