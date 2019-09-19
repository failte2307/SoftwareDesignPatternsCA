package com.loan;

public class Customer {
	

	private String name;
	
	private int accNo;
	
	private String address;
	
	private int creditRating;
	
	private double amount;
	
	private boolean employed;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public int getAccNo() {
		return accNo;
	}
	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getCreditRating() {
		return creditRating;
	}
	public void setCreditRating(int creditRating) {
		this.creditRating = creditRating;
	}
	
	public Customer(String name, int accNo, String address, int creditRating,double amount) {
		this.name = name;
		this.accNo = accNo;
		this.address = address;
		this.creditRating = creditRating;
		this.amount = amount;
	}
	
	public Customer() {
		
	}
	
	public double CalculateInterestCreditRating(int creditRating) {
		double interestRate;
		if(creditRating <= 999) {
			interestRate = 0.05;
			return interestRate;
		}
		else {
			interestRate = 0.02;
			return interestRate;
		}
	}
	
	

}
