package com.amex.loans.personal.dao.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.amex.loans.personal.dao.LoanDao;
import com.amex.loans.personal.model.Loan;

@Repository
public class LoanDaoImpl implements LoanDao{

	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public List<Loan> getAllLoans() {
		List<Loan> loans=null;
		
		List<Map<String, Object>> records=jdbcTemplate.queryForList("select * from loans");
		if(records.size()>0) {
			loans=new ArrayList<Loan>();
			for(Map<String, Object> record:records) {
				loans.add(new Loan((Long)record.get("loan_id"), 
						(String)record.get("customer_name"), (String)record.get("email"),
						(String)record.get("phone"),
						(Double)record.get("total_amt"), 
						(Double)record.get("emi_amt"), 
						null));
			}
		}
		return loans;
	}

	@Override
	public Integer createNewLoan(Loan loan) {
		int status=jdbcTemplate.update("insert into loans(customer_name,email,phone,total_amt,emi_amt) values(?,?,?,?,?)", 
				loan.getCustomerName(),
				loan.getEmail(),
				loan.getPhone(),
				loan.getAmout(),
				loan.getEmi());
		return status;
	}

}
