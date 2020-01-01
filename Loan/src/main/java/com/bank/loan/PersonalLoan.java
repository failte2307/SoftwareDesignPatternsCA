package com.bank.loan;

import com.bank.decorator.LoanDecorator;
import com.bank.decorator.LoanFixedCharges;

public class PersonalLoan extends Loan implements LoanFixedCharges{
	
	
	public PersonalLoan( String issuedBy,String type, int term, double loanAmount, double totalRepayment, double interestAmount) {
		super(issuedBy,type,term, loanAmount, totalRepayment, interestAmount);
	}
	
	public PersonalLoan( String issuedBy,String type, int term, double loanAmount) {
		super(issuedBy,type,term, loanAmount);
	}

    public PersonalLoan() {
    	
    }
    
	public double additionalExpenses() {
		return 100;
	}

	@Override
	public String getLoanFixedChargesDescription() {
		 return "Personal Loan, additional addons : ";
	}


	
		
	}

