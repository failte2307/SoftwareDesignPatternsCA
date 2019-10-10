package com.bank.loan;

public class LongTermLoan implements LoanBehaviour {
	

	public double CalculateInterestOnLoanByTerm(int term) {
		double interestRate;
	    if(term <= 15) {
	    	 return interestRate = 0.09;
	    }  
	    else {
	    	return interestRate = 0.15;	
	    }
 }
}
