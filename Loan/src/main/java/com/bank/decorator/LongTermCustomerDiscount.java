package com.bank.decorator;

import com.bank.loan.Loan;

public class LongTermCustomerDiscount extends LoanDecorator {
	
	private final double discount = 0.85;
	
	private Loan loanFixedCharges;

	public LongTermCustomerDiscount(Loan loanFixedCharges) {
		this.loanFixedCharges = loanFixedCharges;
	}

	public double additionalExpenses() {
		return (loanFixedCharges.additionalExpenses()  * discount);
	}

	@Override
	public String getLoanFixedChargesDescription() {
		return loanFixedCharges.getLoanFixedChargesDescription() + " Loan term Loan discount,";
	}



}
