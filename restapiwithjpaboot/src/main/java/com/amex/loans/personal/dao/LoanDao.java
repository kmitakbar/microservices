package com.amex.loans.personal.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.amex.loans.personal.model.Loan;

@Repository
public interface LoanDao extends JpaRepository<Loan, Long> {

}
