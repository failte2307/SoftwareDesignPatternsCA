package com.bank.decorator;

import com.bank.loan.Loan;

public class LoanInsuranceDeluxePolicy extends LoanDecorator {

	 private Loan loanFixedCharges;
	 
	 public LoanInsuranceDeluxePolicy(Loan loanFixedCharges) {
		 this.loanFixedCharges = loanFixedCharges;
	 }
	 
    @Override
	public String getLoanFixedChargesDescription() {
		return loanFixedCharges.getLoanFixedChargesDescription() +" Loan insurance Deluxe policy,";
	}

	@Override
	public double additionalExpenses() {
		return  400 + loanFixedCharges.additionalExpenses();
	}
	
}
