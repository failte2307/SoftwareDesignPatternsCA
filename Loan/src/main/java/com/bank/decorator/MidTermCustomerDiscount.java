package com.bank.decorator;

public class MidTermCustomerDiscount {
	
	private final double discount = 0.90;
	
	private LoanFixedCharges loanFixedCharges;


	public MidTermCustomerDiscount(LoanFixedCharges loanFixedCharges) {
		this.loanFixedCharges = loanFixedCharges;
	}

	public double additionalExpenses() {
		return loanFixedCharges.additionalExpenses() - (loanFixedCharges.additionalExpenses() * discount);
	}

	public String getLoanFixedChargesDescription() {
		return loanFixedCharges.getLoanFixedChargesDescription() +" Mid term Loan discount,";
	}


}
