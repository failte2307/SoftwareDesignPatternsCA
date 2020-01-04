package com.bank.decorator;

import com.bank.loan.Loan;

public class MultipleLoansCharge extends LoanDecorator {
	
	 private Loan loanFixedCharges;
	 
	 public MultipleLoansCharge(Loan loanFixedCharges) {
		 this.loanFixedCharges = loanFixedCharges;
	 }
	 
	 @Override
	 public double additionalExpenses() {	
		return  300 + loanFixedCharges.additionalExpenses();
	 }

	 @Override
	 public String getLoanFixedChargesDescription() {
		return loanFixedCharges.getLoanFixedChargesDescription() +" Multiple Loans charges, ";
	 }

}
