package com.bank.decorator;

import com.bank.loan.Loan;

public class LoanTaxOverSeasCustomer extends LoanDecorator {
	
	private Loan loanFixedCharges;

	public LoanTaxOverSeasCustomer(Loan loanFixedCharges) {
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
