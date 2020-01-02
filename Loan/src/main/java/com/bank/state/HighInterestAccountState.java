package com.bank.state;

public class HighInterestAccountState implements AccountState {
	
	 private Account account;
	 private final double OverdrawnInterestCap = 0;
     private final double HigherInterestCap = 10000;
     private final double HigherInterestRate = 0.05;
     private final String AccountStateDetails = "HighInterestAccount";
	 
	 public HighInterestAccountState(Account account) {
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
		return "HighInterestAccountState";
	}

	@Override
	public double addInterest() {
		double interest = (account.getBalance() * HigherInterestRate);
		account.setBalance(account.getBalance() + interest);
		updateState();
		return account.getBalance();
	}

	@Override
	public void updateState() {
		
		if(account.getBalance() < OverdrawnInterestCap)
		{
			account.setAccountState(account.getOverDrawnAccountState());
		}
		else if(account.getBalance() >= OverdrawnInterestCap && account.getBalance() < HigherInterestCap)
		{
			account.setAccountState(account.getLowInterestAccountState());
		}
		
		
	}

	@Override
	public void setAccountDetails() {
		account.setAccountStateDetails(AccountStateDetails);
		account.setInterestRate(HigherInterestRate);	
	}

}
