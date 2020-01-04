package com.bank.decorator;

import com.bank.loan.Loan;
import com.bank.loan.LongTermLoan;
import com.bank.loan.Mortgage;
import com.bank.singleton.Logging;

public class DecoratorDriver {
	public static void main(String args[]) {
		Loan mortgagesLoan = new Mortgage();
		mortgagesLoan = new LoanTaxLocalCustomer(mortgagesLoan);
		mortgagesLoan = new LoanInsuranceStandardPolicy(mortgagesLoan);
		mortgagesLoan = new MidTermCustomerDiscount(mortgagesLoan);
		System.out.println(mortgagesLoan.additionalExpenses());
		System.out.println(mortgagesLoan.getLoanFixedChargesDescription());
		
		

		
	}

}
