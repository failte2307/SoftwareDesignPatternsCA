package com.bank.decorator;

public class AdditionalCharges {
	
	private double LoanAmount;
	private String description;
	
	public AdditionalCharges(double loanAmount, String description) {
		this.LoanAmount = loanAmount;
		this.description = description;
		
	}

	public double getLoanAmount() {
		return LoanAmount;
	}

	public String getDescription() {
		return description;
	}

	public void setLoanAmount(double loanAmount) {
		LoanAmount = loanAmount;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	
}
