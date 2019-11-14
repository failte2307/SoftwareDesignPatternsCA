package com.bank.decorator;

import com.bank.loan.Loan;

public class LoanInsurance extends LoanDecorator{

	 Loan loan;

	public LoanInsurance(Loan loan) {
		this.loan = loan;
	}
	

	public double totalExpenses() {
		double cost = loan.totalExpenses();
		if(cost == 0) {
			return cost = 200;
		}
		else {
			int bla = loan.getTerm();
		cost += 200 * (loan.getTerm() - 1);
		return cost;
	   }
    }
}

 
	

	
	
