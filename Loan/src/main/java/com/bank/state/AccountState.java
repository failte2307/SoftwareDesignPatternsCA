package com.bank.state;

public interface AccountState {
	
	public double Withdraw(double Amount);
	
	public double Deposit(double Amount);
	
	public double viewBalance();
	
	public void checkState();
	
	public String test();

}
