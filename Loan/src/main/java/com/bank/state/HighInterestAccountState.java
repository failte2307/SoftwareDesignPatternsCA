package com.bank.state;

public class HighInterestAccountState implements AccountState {
	
	 private Account account;
	 
	 public HighInterestAccountState(Account account) {
		 this.account = account;
	 }

	public double Withdraw(double Amount) {
		return 4;

	}

	public double Deposit(double Amount) {
		// TODO Auto-generated method stub
		return 0;
	}

	public double viewBalance() {
		// TODO Auto-generated method stub
		return 0;
	}

	public void checkState() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String test() {
		return "HighInterestAccount";
	}

}
