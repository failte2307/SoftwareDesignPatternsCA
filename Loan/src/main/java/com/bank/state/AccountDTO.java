package com.bank.state;

public class AccountDTO {
	
	private int accountId;
	private String accountHolder;
	private double balance;
	private String accountStateDetails;
	private double interestRate;
	
	public AccountDTO() {
		
	}
	public int getAccountId() {
		return accountId;
	}
	public String getAccountHolder() {
		return accountHolder;
	}
	public double getBalance() {
		return balance;
	}
	public String getAccountStateDetails() {
		return accountStateDetails;
	}
	public double getInterestRate() {
		return interestRate;
	}
	public void setAccountId(int accountId) {
		this.accountId = accountId;
	}
	public void setAccountHolder(String accountHolder) {
		this.accountHolder = accountHolder;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public void setAccountStateDetails(String accountStateDetails) {
		this.accountStateDetails = accountStateDetails;
	}
	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}
	
	public AccountDTO(int accountId, String accountHolder, double balance, String accountStateDetails,
			double interestRate) {
		this.accountId = accountId;
		this.accountHolder = accountHolder;
		this.balance = balance;
		this.accountStateDetails = accountStateDetails;
		this.interestRate = interestRate;
	}
	
	public AccountDTO(Account acc) {
		this.accountId = acc.getAccountId();
		this.accountHolder = acc.getAccountHolder();
		this.balance = acc.getBalance();
		this.accountStateDetails = acc.getAccountStateDetails();
		this.interestRate = acc.getInterestRate();
	}
	

}
