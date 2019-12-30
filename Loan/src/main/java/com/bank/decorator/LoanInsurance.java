package com.bank.decorator;

import com.bank.loan.Loan;

public class LoanInsurance extends LoanDecorator{

	 private LoanFixedCharges loanFixedCharges;
	 
	 public LoanInsurance(LoanFixedCharges loanFixedCharges) {
		 this.loanFixedCharges = loanFixedCharges;
	 }
	 	 
     
	 public double additionalExpenses() {	
		return  300 + loanFixedCharges.additionalExpenses();
	   }


	@Override
	public String getLoanFixedChargesDescription() {
		return loanFixedCharges.getLoanFixedChargesDescription() +" Loan insurance,";
	}





    }

 
	

	
	
