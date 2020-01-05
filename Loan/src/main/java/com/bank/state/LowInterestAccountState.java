package com.bank.state;

public class LowInterestAccountState implements AccountState {
	
	 private Account account;
     private final double overdrawnInterestCap = 0;
     private final double higherInterestCap = 10000;
     private final double LowerInterestRate = 0.04;
     private final String AccountStateDetails = "LowerInterestAccount";
	 
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
		updateState();
		return account.getBalance();
	}

	@Override
	public void updateState() {
		
		if(account.getBalance() < overdrawnInterestCap)
		{
			account.setAccountState(account.getOverDrawnAccountState());
		}
		else if(account.getBalance() >= higherInterestCap)
		{
			account.setAccountState(account.getHighInterestAccountState());
		}	
	}

	@Override
	public void setAccountDetails() {
		account.setAccountStateDetails(AccountStateDetails);
		account.setInterestRate(LowerInterestRate);	
	}


}
