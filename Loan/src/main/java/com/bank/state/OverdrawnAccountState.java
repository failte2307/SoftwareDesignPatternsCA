package com.bank.state;

public class OverdrawnAccountState implements AccountState {
	
	
	 private Account account;

     private String AccountState = "overDrawnAccount";
     private double LowerInterestCap = 0;
     private double HigherInterestCap = 10000;
	 
	 public OverdrawnAccountState(Account account) {
		 this.account = account;
	 }

	public boolean withdraw(double amount) {
		return false;
	}

	public boolean deposit(double amount) {
		 account.setBalance(account.getBalance() + amount);
		 updateState();
		 return true;
		 
	}

	public double viewBalance() {
		return account.getBalance();
	}

	public void updateState() {
		if(account.getBalance() > LowerInterestCap && account.getBalance() < HigherInterestCap)
		{
			account.setAccountState(account.getLowInterestAccountState());
		}
		else if(account.getBalance() >= HigherInterestCap)
		{
			account.setAccountState(account.getHighInterestAccountState());
		}
		
 	
	}

	public String checkState() {
		return "Overdrawn Account";
		
	}

	@Override
	public double addInterest() {
		return 0;
	}



}
