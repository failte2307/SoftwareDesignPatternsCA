package com.bank.factory;

import com.bank.decorator.LoanFixedCharges;
import com.bank.decorator.LoanInsuranceStandardPolicy;
import com.bank.decorator.LoanTaxLocalCustomer;
import com.bank.decorator.MidTermCustomerDiscount;
import com.bank.loan.Loan;
import com.bank.loan.Mortgage;

public class FactoryDriver {
	
	public static void main (String args[]) {

	LoanBehaviourFactoryCreator loanBehaviourFactory = new LoanBehaviourFactory();
	Loan longTermLoan = new Mortgage("Jennifer", "ShortTermLoan", 14, 20000);
	longTermLoan.setLoanBehaviour(loanBehaviourFactory.getBehaviourType(LoanBehaviourType.LONG_TERM_LOAN));
	double sTLInterestAmount = longTermLoan.calculateInterestOnLoanByTerm(longTermLoan.getTerm(), 
			longTermLoan.getLoanAmount());
	System.out.println(sTLInterestAmount);   	
	}
        }


