package com.bank.factory;

import com.bank.decorator.LoanFixedCharges;
import com.bank.decorator.LoanInsuranceStandardPolicy;
import com.bank.decorator.LoanTaxLocalCustomer;
import com.bank.decorator.MidTermCustomerDiscount;
import com.bank.loan.Loan;
import com.bank.loan.Mortgage;

public class FactoryDriver {
	
	public static void main (String args[]) {

	LoanBehaviourFactory loanBehaviour = new LoanBehaviourFactory();
	Loan shortTermLoan = new Mortgage("Jennifer", "ShortTermLoan", 14, 20000);
	shortTermLoan.setLoanBehaviour(loanBehaviour.getBehaviourType(LoanBehaviourType.LONG_TERM_LOAN));
	double sTLInterestAmount = shortTermLoan.CalculateInterestOnLoanByTerm(shortTermLoan.getTerm(), shortTermLoan.getLoanAmount());
	System.out.println(sTLInterestAmount);
	

	
        	
	}
        }


