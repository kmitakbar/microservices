package soapproducer;

import java.util.ArrayList;
import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public class Loan {

	List<PersonalLaon> loans=new ArrayList<PersonalLaon>();
	
	
	@WebMethod
	public List<PersonalLaon> getLoans(){
		loans.add(new PersonalLaon(10000L, "akbar", "tsete@gmail.com", "11222",6776.9));
		loans.add(new PersonalLaon(10001L, "Vamsi", "tsete@gmail.com", "77777",7566565.0));
		return loans;
	}
}
