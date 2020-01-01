package com.bank.state;

public class Account {

    private int accountId;
	private String accountHolder;
	private double balance;
	
	
	 AccountState highInterestAccountState;
	 AccountState lowInterestAccountState;
	 AccountState OverDrawnAccountState;
	 AccountState BlockedAccountState;
	
}
