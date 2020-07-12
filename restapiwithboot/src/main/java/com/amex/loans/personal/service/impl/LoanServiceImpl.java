package com.amex.loans.personal.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.amex.loans.personal.dao.LoanDao;
import com.amex.loans.personal.model.Loan;
import com.amex.loans.personal.service.LoanService;

@Service
public class LoanServiceImpl implements LoanService {

	@Autowired
	LoanDao loanDao;
	@Override
	public List<Loan> getLoans() {
		return loanDao.getAllLoans();
	}
	@Override
	public Integer createNewLoan(Loan loan) {
		// TODO Auto-generated method stub
		return loanDao.createNewLoan(loan);
	}

}
