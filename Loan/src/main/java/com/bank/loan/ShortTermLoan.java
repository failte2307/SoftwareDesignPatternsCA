package com.bank.loan;

public class ShortTermLoan implements LoanBehaviour {
	
	private static final double LOWER_INTERESTRATE = 0.15;
	private static final double MID_INTERESTRATE = 0.20;
	private static final double HIGH_INTERESTRATE = 0.25;
	

		public double calculateInterestOnLoanByTerm(int term, double loanAmount) {
		    if(term <= 4 ) {
		    	double interestAmount = (loanAmount * LOWER_INTERESTRATE);
		    	return interestAmount;
		    }  
		    else if (term == 5) {
		    	
		    	double interestAmount = (loanAmount * MID_INTERESTRATE);
		    	return interestAmount;
		    }
		    else {
		    	double interestAmount = (loanAmount * HIGH_INTERESTRATE);
		    	return interestAmount;

		    }
	    }

}
