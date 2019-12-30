package com.bank.loan;

public class Main {
	public static void main (String args[]) {
		
		
		Loan mortgageLoan = new Mortgage("Jennifer", "Mortgage", 3, 10000);
		mortgageLoan.setLoanBehaviour(new ShortTermLoan());
		double mortgageRate  = mortgageLoan.CalculateInterestOnLoanByTerm(mortgageLoan.getTerm());
		double amountAdded = mortgageRate * mortgageLoan.getLoanAmount();
		System.out.println("Mortgage Rate : " + mortgageRate);
		
		Loan shortTermLoan = new Mortgage("Jennifer", "ShortTermLoan", 14, 20000);
		shortTermLoan.setLoanBehaviour(new LongTermLoan());
		double sTLRate = shortTermLoan.CalculateInterestOnLoanByTerm(shortTermLoan.getTerm());
		System.out.println("STL Rate :" + sTLRate);
		
		
		
		
		
		
	}

}
