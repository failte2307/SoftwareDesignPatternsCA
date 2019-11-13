package com.bank.loan;

public class Mortgage extends Loan {
	
	
	public Mortgage( String issuedBy,String type, int term) {
		super(issuedBy,type,term);
	}

	@Override
	public double total() {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
