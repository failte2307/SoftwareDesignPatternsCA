package com.bank.decorator;

import com.bank.loan.Loan;

public class LoanTaxLocalCustomer extends LoanDecorator {
	
	private Loan loanFixedCharges;

	public LoanTaxLocalCustomer(Loan loanFixedCharges) {
		this.loanFixedCharges = loanFixedCharges;
	}

	@Override
	public double additionalExpenses() {
		return 400 + loanFixedCharges.additionalExpenses();
	}

	@Override
	public String getLoanFixedChargesDescription() {
		return loanFixedCharges.getLoanFixedChargesDescription() +" Loan Tax local Customer,";
	}
}
