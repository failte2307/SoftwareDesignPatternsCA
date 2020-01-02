package com.bank.loan;

public class LongTermLoanGoodCreditRating implements LoanBehaviour  {
	
	private static final double LOWER_INTERESTRATE = 0.09;
	private static final double HIGHER_INTERESTRATE = 0.15; 
	private static final double DISCOUNTRATE = 0.90;

	public double calculateInterestOnLoanByTerm(int term, double loanAmount) {
	    if(term <= 15) {
	    	double interestAmount = (loanAmount * LOWER_INTERESTRATE);
	    	double discountAmount = (interestAmount * DISCOUNTRATE);
	    	return discountAmount;
	    	 
	    }  
	    else {
	    	double interestAmount = (loanAmount * HIGHER_INTERESTRATE);
	    	double discountAmount = (interestAmount * DISCOUNTRATE);
	    	return discountAmount;
	    }

	}

}
