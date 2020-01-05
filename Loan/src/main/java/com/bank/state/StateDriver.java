package com.bank.state;

public class StateDriver {
	
	public static void main (String args[]) {
		 Account account = new Account(1,"Mark",10000,"Created Account",0);
		 System.out.println(account.checkState());
		 account.getInterestRate();
		 System.out.println(account.addInterest());	 
		 	 
		 account.withdraw(10499);
		 System.out.println(account.checkState());
		 System.out.println(account.addInterest());
		 	 
		 account.withdraw(10);
		 System.out.println(account.checkState());
		 
		 account.deposit(10);
		 System.out.println(account.checkState());
		 
		 account.deposit(10000);
		 System.out.println(account.checkState());
		 account.setAccountDetails();
		 System.out.println(account.getInterestRate());
		 System.out.println(account.getAccountStateDetails());
		 	 
		}
}
