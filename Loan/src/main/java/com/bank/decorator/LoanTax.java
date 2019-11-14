package com.bank.decorator;

import com.bank.loan.Loan;

public class LoanTax extends LoanDecorator {
	
	private Loan loan;

	public LoanTax(Loan loan) {
		this.loan = loan;
	}

	
	public double totalExpenses() {
		double cost = 500;
		return cost;
	}

}
