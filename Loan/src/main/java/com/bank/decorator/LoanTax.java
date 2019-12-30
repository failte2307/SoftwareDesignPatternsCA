package com.bank.decorator;

import com.bank.loan.Loan;

public class LoanTax extends LoanDecorator {
	
	private LoanFixedCharges loanFixedCharges;


	public LoanTax(LoanFixedCharges loanFixedCharges) {
		this.loanFixedCharges = loanFixedCharges;
	}

	@Override
	public double additionalExpenses() {
		return 500 + loanFixedCharges.additionalExpenses();
	}

	@Override
	public String getLoanFixedChargesDescription() {
		return loanFixedCharges.getLoanFixedChargesDescription() +" Loan Tax,";
	}



}
