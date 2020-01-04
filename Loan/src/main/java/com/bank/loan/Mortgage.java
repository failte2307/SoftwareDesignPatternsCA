package com.bank.loan;

import com.bank.decorator.LoanDecorator;
import com.bank.decorator.LoanFixedCharges;

public class Mortgage extends Loan  {
	
	public Mortgage( String issuedBy,String type, int term, double loanAmount, double totalRepayment, double interestAmount) {
		super(issuedBy,type,term, loanAmount, totalRepayment, interestAmount);
	}

	public Mortgage( String issuedBy,String type, int term, double loanAmount) {
		super(issuedBy,type,term, loanAmount);
	}
		
	public Mortgage() {
		loanFixedChargesDescription = "Mortgage Loan, additional addons : " ;	
	}

	public double additionalExpenses() {
		return 200;
	}

}
