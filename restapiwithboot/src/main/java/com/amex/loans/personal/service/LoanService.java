package com.amex.loans.personal.service;

import java.util.List;

import com.amex.loans.personal.model.Loan;

public interface LoanService {

	public List<Loan> getLoans();
	
	public Integer createNewLoan(Loan loan);
}
