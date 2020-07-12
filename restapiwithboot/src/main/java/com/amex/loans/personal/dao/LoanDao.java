package com.amex.loans.personal.dao;

import java.util.List;

import com.amex.loans.personal.model.Loan;

public interface LoanDao {

	public List<Loan> getAllLoans();
	
	public Integer createNewLoan(Loan loan);
}
