package com.bank.decorator;

import com.bank.loan.Loan;

public class MidTermCustomerDiscount extends LoanDecorator {
	
	private final double discount = 0.90;
	
	private Loan loanFixedCharges;

	public MidTermCustomerDiscount(Loan loanFixedCharges) {
		this.loanFixedCharges = loanFixedCharges;
	}

	public double additionalExpenses() {
		return (loanFixedCharges.additionalExpenses() * discount);
	}

	public String getLoanFixedChargesDescription() {
		return loanFixedCharges.getLoanFixedChargesDescription() +" Mid term Loan discount,";
	}
	
}
