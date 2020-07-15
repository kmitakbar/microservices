package soapproducer;

public class PersonalLaon {

	private Long loanNumber;
	private String customerName;
	private String email;
	private String phone;
	private Double amout;
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
	
	@Override
	public String toString() {
		return "Loan [loanNumber=" + loanNumber + ", customerName=" + customerName + ", email=" + email + ", phone="
				+ phone + ", amout=" + amout + "]";
	}
	public PersonalLaon(Long loanNumber, String customerName, String email, String phone, Double amt) {
		super();
		this.loanNumber = loanNumber;
		this.customerName = customerName;
		this.email = email;
		this.phone = phone;
		this.amout=amt;
	}
	
	public PersonalLaon() {
		
	}
}
