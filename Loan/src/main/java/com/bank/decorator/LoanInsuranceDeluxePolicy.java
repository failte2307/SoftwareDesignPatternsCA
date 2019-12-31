package com.bank.decorator;

public class LoanInsuranceDeluxePolicy {

	 private LoanFixedCharges loanFixedCharges;
	 
	 public LoanInsuranceDeluxePolicy(LoanFixedCharges loanFixedCharges) {
		 this.loanFixedCharges = loanFixedCharges;
	 }
	 	 
    
	 public double additionalExpenses() {	
		return  400 + loanFixedCharges.additionalExpenses();
	   }


	public String getLoanFixedChargesDescription() {
		return loanFixedCharges.getLoanFixedChargesDescription() +" Loan insurance standard policy,";
	}
	
	



}
