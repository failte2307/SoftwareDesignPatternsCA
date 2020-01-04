package com.bank.decorator;

import com.bank.loan.Loan;

public class LoanInsuranceStandardPolicy extends LoanDecorator{

	 private Loan loanFixedCharges;
	 
	 public LoanInsuranceStandardPolicy(Loan loanFixedCharges) {
		 this.loanFixedCharges = loanFixedCharges;
	 }
     
	 @Override
	 public double additionalExpenses() {	
		return  300 + loanFixedCharges.additionalExpenses();
	   }

	@Override
	public String getLoanFixedChargesDescription() {
		return loanFixedCharges.getLoanFixedChargesDescription() +" Loan insurance standard policy,";
	}

}

 
	

	
	
