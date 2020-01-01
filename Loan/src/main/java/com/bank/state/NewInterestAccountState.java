package com.bank.state;

public class NewInterestAccountState implements AccountState {
	
	
	
	 private Account account;
     
     private double LowerInterestCap = 0;
     private double HigherInterestCap = 10000;
	 
	 public NewInterestAccountState(Account account) {
		 this.account = account;
		 updateState();
	 }

	public boolean withdraw(double Amount) {
		return false;
	}

	public boolean deposit(double Amount) {
		 account.setBalance(account.getBalance() + Amount);
		 updateState();
		 return true;
		 
	}

	public double viewBalance() {
		return 0;
	}

	public void updateState() {
		if(account.getBalance() > LowerInterestCap && account.getBalance() <= HigherInterestCap)
		{
			account.setAccountState(account.getLowInterestAccountState());
		}
		else if(account.getBalance() > HigherInterestCap)
		{
			account.setAccountState(account.getHighInterestAccountState());
		}
		
 	
	}

	@Override
	public void checkState() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String test() {

		return "NewAccount";
	}


}
