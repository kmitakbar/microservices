package com.amex.loans.personal.model;

import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "loans")
public class Loan {

	@Id
	@GeneratedValue
	@Column(name="loan_id")
	private Long loanNumber;
	
	@Column(name="customer_name")
	private String customerName;
	private String email;
	private String phone;
	
	@Column(name="total_amt")
	private Double amout;
	
	@Column(name="emi_amt")
	private Double emi;
	public Long getLoanNumber() {
		return loanNumber;
	}
	public void setLoanNumber(Long loanNumber) {
		this.loanNumber = loanNumber;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public Double getAmout() {
		return amout;
	}
	public void setAmout(Double amout) {
		this.amout = amout;
	}
	public Double getEmi() {
		return emi;
	}
	public void setEmi(Double emi) {
		this.emi = emi;
	}
	@Override
	public String toString() {
		return "Loan [loanNumber=" + loanNumber + ", customerName=" + customerName + ", email=" + email + ", phone="
				+ phone + ", amout=" + amout + ", emi=" + emi + "]";
	}
	public Loan(Long loanNumber, String customerName, String email, String phone, Double amout, Double emi) {
		super();
		this.loanNumber = loanNumber;
		this.customerName = customerName;
		this.email = email;
		this.phone = phone;
		this.amout = amout;
		this.emi = emi;
	}
	
	public Loan() {
		
	}
}
