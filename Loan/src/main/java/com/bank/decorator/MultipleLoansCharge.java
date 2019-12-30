package com.bank.decorator;

public class MultipleLoansCharge {
	
	 private LoanFixedCharges loanFixedCharges;
	 
	 public MultipleLoansCharge(LoanFixedCharges loanFixedCharges) {
		 this.loanFixedCharges = loanFixedCharges;
	 }
	 	 
    
	 public double additionalExpenses() {	
		return  300 + loanFixedCharges.additionalExpenses();
	   }


	public String getLoanFixedChargesDescription() {
		return loanFixedCharges.getLoanFixedChargesDescription() +" Multiple Loans charges, ";
	}



}
