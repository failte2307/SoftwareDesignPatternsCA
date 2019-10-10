package com.loan;

public class Main {
	public static void main (String args[]) {
		
		
		Loan mortgageLoan = new Mortgage("Jennifer", "Mortgage", 3);
		mortgageLoan.setLoanBehaviour(new ShortTermLoan());
		double mortgageRate  = mortgageLoan.CalculateInterestOnLoanByTerm(mortgageLoan.getTerm());
		System.out.println("Mortgage Rate : " + mortgageRate);
		
		Loan shortTermLoan = new Mortgage("Jennifer", "ShortTermLoan", 14);
		shortTermLoan.setLoanBehaviour(new LongTermLoan());
		double sTLRate = shortTermLoan.CalculateInterestOnLoanByTerm(shortTermLoan.getTerm());
		System.out.println("STL Rate :" + sTLRate);
		
		
		
		
		
		
	}

}
