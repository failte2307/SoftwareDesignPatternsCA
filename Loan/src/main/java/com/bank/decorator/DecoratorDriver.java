package com.bank.decorator;

import com.bank.loan.Loan;
import com.bank.loan.Mortgage;

public class DecoratorDriver {
	public static void main(String args[]) {
		Loan mortgageLoan = new Mortgage("Jennifer", "Mortgage", 3);
		mortgageLoan = new LoanTax(mortgageLoan);
		mortgageLoan = new LoanInsurance(mortgageLoan);
		System.out.println(mortgageLoan.totalExpenses());
		
		
	}

}
