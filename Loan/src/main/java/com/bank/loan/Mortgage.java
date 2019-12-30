package com.bank.loan;

import com.bank.decorator.LoanDecorator;
import com.bank.decorator.LoanFixedCharges;

public class Mortgage extends Loan implements LoanFixedCharges {
	
	
	public Mortgage() {
		
	}
	
	public Mortgage( String issuedBy,String type, int term, double loanAmount) {
		super(issuedBy,type,term, loanAmount);
	}


	public double additionalExpenses() {
		return 200;
	}

	@Override
	public String getLoanFixedChargesDescription() {
    return "Mortgage Loan, additional addons : ";
	}


}
