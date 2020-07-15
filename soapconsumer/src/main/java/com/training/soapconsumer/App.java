package com.training.soapconsumer;

import com.soap.ws.client.generated.Loan;
import com.soap.ws.client.generated.LoanService;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       LoanService loanService=new LoanService();
       
       Loan loan=loanService.getLoanPort();
       
       System.out.println(loan.getLoans().get(1).getCustomerName());
    }
}
