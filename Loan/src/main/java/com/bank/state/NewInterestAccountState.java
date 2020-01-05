package com.bank.state;

public class NewInterestAccountState implements AccountState {
	
	 private Account account;
	 
     private String AccountStateDetails = "NewInterestAccount";
     
     private double LowerInterestCap = 0;
     
     private double HigherInterestCap = 10000;
     
	 public NewInterestAccountState(Account account) {
		 this.account = account;
		 updateState();
	 }

	@Override
	public boolean withdraw(double Amount) {
		return false;
	}

	@Override
	public boolean deposit(double Amount) {
		 account.setBalance(account.getBalance() + Amount);
		 updateState();
		 return true;	 
	}
	
	@Override
	public double viewBalance() {
		return 0;
	}

	@Override
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
	
	@Override
	public String checkState() {
		return "Account State: new Interest Account";
		
	}

	@Override
	public double addInterest() {
		return 0;
	}

	@Override
	public void setAccountDetails() {
		account.setAccountStateDetails(AccountStateDetails);
	}


}
