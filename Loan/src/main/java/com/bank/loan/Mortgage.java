package com.bank.loan;

public class Mortgage extends Loan {
	
	
	public Mortgage( String issuedBy,String type, int term) {
		super(issuedBy,type,term);
	}

	@Override
	public double totalExpenses() {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
