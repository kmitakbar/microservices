package com.amex.loans.personal.model;

public class Loan {

	private Long loanNumber;
	private String customerName;
	private String email;
	private String phone;
	private Double amout;
	private Double emi;
	private Integer numberofEmis;
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
	public Integer getNumberofEmis() {
		return numberofEmis;
	}
	public void setNumberofEmis(Integer numberofEmis) {
		this.numberofEmis = numberofEmis;
	}
	@Override
	public String toString() {
		return "Loan [loanNumber=" + loanNumber + ", customerName=" + customerName + ", email=" + email + ", phone="
				+ phone + ", amout=" + amout + ", emi=" + emi + ", numberofEmis=" + numberofEmis + "]";
	}
	public Loan(Long loanNumber, String customerName, String email, String phone, Double amout, Double emi,
			Integer numberofEmis) {
		super();
		this.loanNumber = loanNumber;
		this.customerName = customerName;
		this.email = email;
		this.phone = phone;
		this.amout = amout;
		this.emi = emi;
		this.numberofEmis = numberofEmis;
	}
	
	public Loan() {
		
	}
}
