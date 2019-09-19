package com.loan;

public class STL extends Loan {
	
	private double fixedCharges;

	public double getFixedCharges() {
		return fixedCharges;
	}

	public void setFixedCharges(double fixedCharges) {
		this.fixedCharges = fixedCharges;
	}
	
	public STL( String issuedBy,String type, int term) {
		super(issuedBy,type,term);
	}

	
    }
