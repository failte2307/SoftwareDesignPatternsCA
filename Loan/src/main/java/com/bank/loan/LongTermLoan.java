package com.bank.loan;

public class LongTermLoan implements LoanBehaviour {
	
	final double lowerInterestRate = 0.09;
	final double higherInterestRate = 0.15; 
	

	public double CalculateInterestOnLoanByTerm(int term, double loanAmount) {
	    if(term <= 15) {
	    	double interestAmount = (loanAmount * lowerInterestRate);
	    	return interestAmount;
	    	 
	    }  
	    else {
	    	double interestAmount = (loanAmount * higherInterestRate);
	    	return interestAmount;
	    }
 }
}
