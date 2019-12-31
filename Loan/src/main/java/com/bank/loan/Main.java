package com.bank.loan;

public class Main {
	public static void main (String args[]) {
		
		
		Loan mortgageLoan = new Mortgage("Jennifer", "Mortgage", 3, 10000);
		mortgageLoan.setLoanBehaviour(new ShortTermLoan());
		double mortgageRateAmount  = mortgageLoan.CalculateInterestOnLoanByTerm(mortgageLoan.getTerm(), mortgageLoan.getLoanAmount());

		System.out.println("Mortgage Rate : " + mortgageRateAmount);
		
		Loan shortTermLoan = new Mortgage("Jennifer", "ShortTermLoan", 14, 20000);
		shortTermLoan.setLoanBehaviour(new LongTermLoan());
		double sTLInterestAmount = shortTermLoan.CalculateInterestOnLoanByTerm(shortTermLoan.getTerm(), shortTermLoan.getLoanAmount());
		System.out.println("STL Rate :" + sTLInterestAmount);
		
		
		
		
		
		
	}

}
