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
	    if(term <= 5 ) {
	    	  interestRate = 0.15;
	    	  return interestRate;
	    }  
	    else {
	    	interestRate = 0.25;
	    	return interestRate;
	    }
		
	}
			

}
