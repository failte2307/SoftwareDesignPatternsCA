package com.bank.loan;

import com.bank.decorator.LoanDecorator;
import com.bank.decorator.LoanFixedCharges;

public class PersonalLoan extends Loan implements LoanFixedCharges{
	
	
	public PersonalLoan(String type, String issuedBy, int term, double loanAmount) {
		super(type, issuedBy, term, loanAmount);
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

