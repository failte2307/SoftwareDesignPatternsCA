package com.bank.loan;

public class Main {
	public static void main (String args[]) {
		
		
		Loan mortgageLoan = new Mortgage("Jennifer", "Mortgage", 14, 20000);
		mortgageLoan.setLoanBehaviour(new LongTermLoanGoodCreditRating());
		double mortgageRateAmount  = mortgageLoan.calculateInterestOnLoanByTerm(mortgageLoan.getTerm(), mortgageLoan.getLoanAmount());
		System.out.println("Mortgage Interest : " + mortgageRateAmount);
		

		
		
		
		
		
		
	}

}
