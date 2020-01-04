package com.bank.loan;

/**
 * @author Mark
 *
 */
public abstract class Loan {
	
	protected String issuedBy;
	
	protected String type;
	
    protected int term;
    
    protected double loanAmount;
    
    protected double totalRepayment;
    
    protected double interestAmount;
    
	private LoanBehaviour loanBehaviour;
	
    public LoanBehaviour getLoanBehaviour() {
        return loanBehaviour;
    }

    public void setLoanBehaviour(LoanBehaviour loanBehaviour) {
        this.loanBehaviour = loanBehaviour;
    }
    
    public double calculateInterestOnLoanByTerm(int term, double loanAmount){
    	return loanBehaviour.calculateInterestOnLoanByTerm(term, loanAmount); 
    	}
    
	
	public int getTerm() {
		return term;
	}
	public void setTerm(int term) {
		this.term = term;
	}
	

	public String getIssuedBy() {
		return issuedBy;
	}

	public void setIssuedBy(String issuedBy) {
		this.issuedBy = issuedBy;
	}
	
	public Loan(String issuedBy) {
		this.issuedBy = issuedBy;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	public Loan(String issuedBy, String type, int term, double loanAmount, double interestAmount, double totalRepayment) {
		this.term = term;
		this.issuedBy = issuedBy;
		this.type = type;
		this.loanAmount = loanAmount;
		this.interestAmount = interestAmount;
		this.totalRepayment = totalRepayment;		
	}
	
	
	public Loan(String issuedBy, String type, int term, double loanAmount) {
		this.term = term;
		this.issuedBy = issuedBy;
		this.type = type;
		this.loanAmount = loanAmount;
	}
	
	public Loan(int term) {
		this.term = term;
	}
	
	public Loan() {
		
	}
	

	public double getLoanAmount() {
		return loanAmount;
	}

	public double getTotalRepayment() {
		return totalRepayment;
	}

	public void setLoanAmount(double loanAmount) {
		this.loanAmount = loanAmount;
	}

	public void setTotalRepayment(double totalRepayment) {
		this.totalRepayment = totalRepayment;
	}

	public double getInterestAmount() {
		return interestAmount;
	}

	public void setInterestAmount(double interestAmount) {
		this.interestAmount = interestAmount;
	}
	
	public String loanFixedChargesDescription = "no additional Charges";
	
	public abstract double additionalExpenses();		
	
	public String getLoanFixedChargesDescription() {
			return loanFixedChargesDescription;	
	}

} 