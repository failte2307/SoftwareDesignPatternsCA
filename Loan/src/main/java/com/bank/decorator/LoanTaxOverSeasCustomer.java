package com.bank.decorator;

public class LoanTaxOverSeasCustomer extends LoanDecorator {
	
	private LoanFixedCharges loanFixedCharges;


	public LoanTaxOverSeasCustomer(LoanFixedCharges loanFixedCharges) {
		this.loanFixedCharges = loanFixedCharges;
	}

	@Override
	public double additionalExpenses() {
		return 500 + loanFixedCharges.additionalExpenses();
	}

	@Override
	public String getLoanFixedChargesDescription() {
		return loanFixedCharges.getLoanFixedChargesDescription() +" Loan Tax over seas customer,";
	}



}
