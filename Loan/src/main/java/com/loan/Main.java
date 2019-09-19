package com.loan;

public class Main {
	public static void main (String args[]) {
		
		double TotalInterest;
		Customer Mark = new Customer("Mark O Donoghue", 12345, "Killarney", 1000, 10000 );
		double customerRate = Mark.CalculateInterestCreditRating(Mark.getCreditRating());
		System.out.println(customerRate);
		
		
		Mortgage mortgage = new Mortgage("Jennifer", "Mortgage", 14);
		double loanRate = mortgage.CalculateInterestOnLoanByTerm(14);
		System.out.println(loanRate);
		
		ShortTermLoan sTloan = new ShortTermLoan("Jennifer", "Short Term Loan", 14);
		
		
	}

}
