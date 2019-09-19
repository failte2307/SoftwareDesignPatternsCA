package com.loan;

public class Main {
	public static void main (String args[]) {
		
		
		Loan mortgageLoan = new Mortgage("Jennifer", "Mortgage", 14);
		mortgageLoan.setLoanBehaviour(new LongTermLoan());
		double mortgageRate  = mortgageLoan.CalculateInterestOnLoanByTerm(mortgageLoan.getTerm());
		System.out.println("Mortgage Rate : " + mortgageRate);
		
		Loan shortTermLoan = new Mortgage("Jennifer", "ShortTermLoan", 3);
		shortTermLoan.setLoanBehaviour(new ShortTermLoan());
		double sTLRate = shortTermLoan.CalculateInterestOnLoanByTerm(shortTermLoan.getTerm());
		System.out.println("STL Rate :" + sTLRate);
		
		
		
		
		
		
	}

}
