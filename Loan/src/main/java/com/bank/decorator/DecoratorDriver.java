package com.bank.decorator;

import com.bank.loan.Loan;
import com.bank.loan.LongTermLoan;
import com.bank.loan.Mortgage;

public class DecoratorDriver {
	public static void main(String args[]) {
		LoanFixedCharges mortgagesLoan = new Mortgage();
		mortgagesLoan = new LoanTax(mortgagesLoan);
		mortgagesLoan = new LoanInsurance(mortgagesLoan);
		mortgagesLoan = new test(mortgagesLoan);
		mortgagesLoan = new MidTermCustomerDiscount(mortgagesLoan);
		System.out.println(mortgagesLoan.additionalExpenses());
		System.out.println(mortgagesLoan.getLoanFixedChargesDescription());
		

		
	}

}
