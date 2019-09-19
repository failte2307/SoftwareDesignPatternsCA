package com.loan;

/**
 * @author Mark
 *
 */
public  class Loan {
	

	private String issuedBy;
	
	private String type;
	
    private int term;
	
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
	
	public Loan(String issuedBy, String type, int term) {
		this.term = term;
		this.issuedBy = issuedBy;
		this.type = type;
	}
	

} 