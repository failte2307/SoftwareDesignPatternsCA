package com.bank.decorator;

import com.bank.loan.Loan;

public class test extends LoanDecorator{

	
	private LoanFixedCharges loanFixedCharges;


	public test(LoanFixedCharges loanFixedCharges) {
		this.loanFixedCharges = loanFixedCharges;
	}

	@Override
	public double additionalExpenses() {
		return 300 + loanFixedCharges.additionalExpenses();
	}

	@Override
	public String getLoanFixedChargesDescription() {
		return loanFixedCharges.getLoanFixedChargesDescription() +" Loan test,";
	}

    }


 
	

	