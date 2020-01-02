package com.bank.state;

public class LowInterestAccountState implements AccountState {
	
	
	 private Account account;
     private double LowerInterestCap = 0;
     private double HigherInterestCap = 10000;
     private double LowerInterestRate = 0.04;
	 
	 public LowInterestAccountState(Account account) {
		 this.account = account;
	 }

	public boolean withdraw(double amount) {
		account.setBalance(account.getBalance() - amount);
		updateState();
        return true;
	}

	public boolean deposit(double amount) {
		account.setBalance(account.getBalance() + amount);
		updateState();
		return true;
	}

	public double viewBalance() {
		return account.getBalance();
	}


	@Override
	public String checkState() {
		return "LowInterestAccountState";
	}

	@Override
	public double addInterest() {
		double interest = (account.getBalance() * LowerInterestRate);
		account.setBalance(account.getBalance() + interest);
		return account.getBalance();
	}

	@Override
	public void updateState() {
		
		if(account.getBalance() < LowerInterestCap)
		{
			account.setAccountState(account.getOverDrawnAccountState());
		}
		else if(account.getBalance() > HigherInterestCap)
		{
			account.setAccountState(account.getHighInterestAccountState());
		}
		
		
	}


}
