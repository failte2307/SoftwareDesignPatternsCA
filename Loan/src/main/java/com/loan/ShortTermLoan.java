package com.loan;

public class ShortTermLoan extends Loan {
	
	private double fixedCharges;

	public double getFixedCharges() {
		return fixedCharges;
	}

	public void setFixedCharges(double fixedCharges) {
		this.fixedCharges = fixedCharges;
	}
	
	public ShortTermLoan( String issuedBy,String type, int term) {
		super(issuedBy,type,term);
	}

	

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
