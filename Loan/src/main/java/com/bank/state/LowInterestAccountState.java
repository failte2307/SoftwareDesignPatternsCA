package com.bank.state;

public class LowInterestAccountState implements AccountState {
	
	
	 private Account account;
	 
	 public LowInterestAccountState(Account account) {
		 this.account = account;
	 }

	public double Withdraw(double Amount) {
		account.setAccountState(account.getHighInterestAccountState());
        return 2;
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
    
		return "LowInterest";
	}


}
