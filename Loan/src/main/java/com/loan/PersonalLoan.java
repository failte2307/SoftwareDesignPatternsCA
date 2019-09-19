package com.loan;

public class PersonalLoan extends Loan {
	
	
	public PersonalLoan(String type, String issuedBy, int term) {
		super(type, issuedBy, term);
	}
	
	
	public double CalculateInterestOnLoanByTerm(int term) {
		double interestRate;
	    if(term <= 15) {
	    	  interestRate = 0.09;
	    	  return interestRate;
	    }  
	    else {
	    	 interestRate = 0.15;
	    	 return interestRate;
	    }
		
	}

}
