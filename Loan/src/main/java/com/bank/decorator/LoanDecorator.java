package com.bank.decorator;

import com.bank.loan.Loan;

 public abstract class LoanDecorator extends Loan{
	 
	public abstract String getLoanFixedChargesDescription();

}
