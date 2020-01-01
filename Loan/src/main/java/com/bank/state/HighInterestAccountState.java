package com.bank.state;

public class HighInterestAccountState implements AccountState {
	
	 private Account account;
	 
	 public HighInterestAccountState(Account account) {
		 this.account = account;
	 }

	public boolean withdraw(double amount) {
		
		return true;

	}

	public boolean deposit(double amount) {

		return true;
	}

	public double viewBalance() {
		return account.getBalance();
		
	}
	@Override
	public String test() {
		return "HighInterestAccount";
	}

	@Override
	public String checkState() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public double addInterest() {
		// TODO Auto-generated method stub
		return 0;
	}

}
