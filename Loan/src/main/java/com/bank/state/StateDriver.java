package com.bank.state;

public class StateDriver {
	
	public static void main (String args[]) {
		 Account account = new Account(1,"Mark",10001,"Created Account");
		 System.out.println(account.Withdraw(10));
		 
		}
}
