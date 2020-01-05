package com.bank.template;

public class MortgageDTO {
	
	private String issuedBy;
	
	private String type;
	
    private int term;
    
    private double loanAmount;
    
    private double totalRepayment;
    
    private double interestAmount;

	public MortgageDTO( String issuedBy,String type, int term, double loanAmount, double totalRepayment, double interestAmount) {
		this.issuedBy = issuedBy;
        this.type = type;
        this.term = term;
        this.loanAmount = loanAmount;
        this.totalRepayment = totalRepayment;
        this.interestAmount = interestAmount;		
	}

	public String getIssuedBy() {
		return issuedBy;
	}

	public String getType() {
		return type;
	}

	public int getTerm() {
		return term;
	}

	public double getLoanAmount() {
		return loanAmount;
	}

	public double getTotalRepayment() {
		return totalRepayment;
	}

	public double getInterestAmount() {
		return interestAmount;
	}

	public void setIssuedBy(String issuedBy) {
		this.issuedBy = issuedBy;
	}

	public void setType(String type) {
		this.type = type;
	}

	public void setTerm(int term) {
		this.term = term;
	}

	public void setLoanAmount(double loanAmount) {
		this.loanAmount = loanAmount;
	}

	public void setTotalRepayment(double totalRepayment) {
		this.totalRepayment = totalRepayment;
	}

	public void setInterestAmount(double interestAmount) {
		this.interestAmount = interestAmount;
	}
	
}
