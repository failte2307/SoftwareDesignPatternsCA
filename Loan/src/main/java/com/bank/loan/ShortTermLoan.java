package com.bank.loan;

public class ShortTermLoan implements LoanBehaviour {

		public double CalculateInterestOnLoanByTerm(int term) {
			double interestRate;
		    if(term <= 4 ) {
		    	  interestRate = 0.15;
		    	  return interestRate;
		    }  
		    else if (term >= 5 &&term <= 6) {
		    	
		    	interestRate = 0.20;
		    	return interestRate;
		    }
		    else {
		    	interestRate = 0.25;
		    	return interestRate;
		    }
	}

}
