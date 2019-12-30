package com.bank.decorator;

public class LongTermCustomerDiscount extends LoanDecorator {
	
	private final double discount = 0.85;
	
	private LoanFixedCharges loanFixedCharges;


	public LongTermCustomerDiscount(LoanFixedCharges loanFixedCharges) {
		this.loanFixedCharges = loanFixedCharges;
	}

	public double additionalExpenses() {
		return loanFixedCharges.additionalExpenses() - (loanFixedCharges.additionalExpenses() * discount);
	}

	@Override
	public String getLoanFixedChargesDescription() {
		return loanFixedCharges.getLoanFixedChargesDescription() +" Loan term Loan discount,";
	}



}
