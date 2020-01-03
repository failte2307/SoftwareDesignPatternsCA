package com.bank.observer;

import java.sql.Date;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;


public class SuspiciousTransactionData implements Subject {
	
	private List<Observer> observers;
	
	private String customerName; 
	
	private double amount; 
	
	private String transactionDate;
	
	private String transactionTime;
	
	private String transactionCountry;
	
	private String email;
	
	private String mobileNo;
	
	public void setSuspiciousTransactionDetails(String customerName, double amount, String transactionDate, 
			String transactionTime, String transactionCountry,String mobileNo, String email ) {
		this.customerName = customerName;
		this.amount = amount;
		this.transactionDate = transactionDate;
		this.transactionTime = transactionTime;
		this.transactionCountry = transactionCountry; 
		this.mobileNo = mobileNo;
		this.email = email;
		notifyObservers();
	}
	
	public SuspiciousTransactionData() {	
		observers = new ArrayList<Observer>();
	}
	
	@Override
	public void registerObserver(Observer o) {
	 observers.add(o);	
	}
	
	@Override
	public void notifyObservers() {
			for (Observer observer: observers) {
				observer.update(customerName,amount,transactionDate,
						transactionTime,transactionCountry, mobileNo, email);
			}
		}

	
	public String getCustomerName() {
		return customerName;
	}

	public double getAmount() {
		return amount;
	}

	public String getTransactionDate() {
		return transactionDate;
	}

	public String TransactionTime() {
		return transactionTime;
	}

	public String getEmail() {
		return email;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
		
	public String convertTransactionTimeStamp(Timestamp timestamp) {
	    SimpleDateFormat sdf = new SimpleDateFormat("MM-dd-yyyy HH:mm:ss");
	    String formattedDate = sdf.format(timestamp.getTime());
	    return formattedDate;
	}


		
	}
	
	


