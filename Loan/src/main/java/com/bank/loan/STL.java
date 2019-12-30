package com.bank.loan;

import com.bank.decorator.LoanFixedCharges;

public class STL extends Loan implements LoanFixedCharges {
	
	private double fixedCharges;

	public double getFixedCharges() {
		return fixedCharges;
	}

	public void setFixedCharges(double fixedCharges) {
		this.fixedCharges = fixedCharges;
	}
	
	public STL( String issuedBy,String type, int term, double loanAmount) {
		super(issuedBy,type,term, loanAmount);
	}


	public double additionalExpenses() {
		return 150;
	}
	
	public STL() {
		
	}

	@Override
	public String getLoanFixedChargesDescription() {
    return "Shortterm loan, additional addons :";
	}



	
    }
