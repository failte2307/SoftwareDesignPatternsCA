package com.bank.loan;

public class LongTermLoan implements LoanBehaviour {
	
	final double lowerInterestRate = 0.09;
	final double higherInterestRate = 0.15; 
	

	public double CalculateInterestOnLoanByTerm(int term) {
	    if(term <= 15) {
	    	 return lowerInterestRate;
	    }  
	    else {
	    	return higherInterestRate;	
	    }
 }
}
