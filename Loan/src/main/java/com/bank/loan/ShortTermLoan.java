package com.bank.loan;

public class ShortTermLoan implements LoanBehaviour {
	
	final double lowerInterestRate = 0.15;
	final double midInterestRate = 0.20;
	final double highInterestRate = 0.25;
	

		public double CalculateInterestOnLoanByTerm(int term, double loanAmount) {
			double interestRate;
		    if(term <= 4 ) {
		    	double interestAmount = (loanAmount * lowerInterestRate);
		    	return interestAmount;
		    }  
		    else if (term >= 5 &&term <= 6) {
		    	
		    	double interestAmount = (loanAmount * midInterestRate);
		    	return interestAmount;
		    }
		    else {
		    	double interestAmount = (loanAmount * highInterestRate);
		    	return interestAmount;

		    }
	}

}
