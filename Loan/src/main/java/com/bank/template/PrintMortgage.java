package com.bank.template;

import com.bank.state.AccountDTO;

public class PrintMortgage extends Printer {
	
	MortgageDTO mortgage ;
	
	public PrintMortgage(MortgageDTO mortgage) {
		this.mortgage = mortgage;
	}
	
	public PrintMortgage() {
		
	}

	@Override
	protected String getDocumentTitle() {
    return "\n\n **Mortgage Document** ";
	}

	@Override
	protected String getDocumentDetails() {
		return "\n\n Issued By : " + mortgage.getIssuedBy() +
			   "\n\n Length Of Loan : " + mortgage.getTerm() +
			   "\n\n Type Of Loan : " + mortgage.getType() +
			   "\n\n Loan amount : " + mortgage.getLoanAmount() + 
			   "\n\n Interest Amount : " + mortgage.getInterestAmount() +
			   "\n\n Total Repayment : " + mortgage.getTotalRepayment();
	}
	
	

}
