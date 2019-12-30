package com.bank.decorator;

import com.bank.loan.Loan;

 public abstract class LoanDecorator implements LoanFixedCharges{

	 private LoanFixedCharges loanFixedCharges;

	public abstract double additionalExpenses() ;

	public abstract String getLoanFixedChargesDescription();


}
