package com.bank.loan;

import com.bank.decorator.LoanFixedCharges;

public class STL extends Loan{
	
	public STL( String issuedBy,String type, int term, double loanAmount, double totalRepayment, double interestAmount) {
		super(issuedBy,type,term, loanAmount, totalRepayment, interestAmount);
	}
	
	public STL( String issuedBy,String type, int term, double loanAmount) {
		super(issuedBy,type,term, loanAmount);
	}


	public double additionalExpenses() {
		return 150;
	}
	
	public STL() {
		loanFixedChargesDescription = "Shortterm loan, additional addons :";		
	}



	
    }
