package com.bank.decorator;

public class AdditionalCharges {
	
	private double loanAddedCharges;
	private String description;
	
	public AdditionalCharges(double loanAddedCharges, String description) {
		this.loanAddedCharges = loanAddedCharges;
		this.description = description;
		
	}

	public double getLoanAddedCharges() {
		return loanAddedCharges;
	}

	public String getDescription() {
		return description;
	}

	public void setLoanAddedCharges(double loanAddedCharges) {
		this.loanAddedCharges = loanAddedCharges;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	
}
