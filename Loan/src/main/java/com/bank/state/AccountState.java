package com.bank.state;

public interface AccountState {
	
	public boolean withdraw(double amount);
	
	public boolean deposit(double amount);
	
	public double viewBalance();
	
	public String checkState();
	
	public double addInterest();
	
	public void updateState();
	
	public void setAccountDetails();
	
}
