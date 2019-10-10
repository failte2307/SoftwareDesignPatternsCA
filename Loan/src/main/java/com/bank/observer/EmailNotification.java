package com.bank.observer;

import java.sql.Date;
import java.sql.Timestamp;

import org.springframework.beans.factory.annotation.Autowired;

public class EmailNotification implements Observer {
	
	@Autowired
	EmailConfiguration emailConfig;
	
	private SuspiciousTransactionData transactionData;
	
	
	
	public EmailNotification(SuspiciousTransactionData transactionData) {
		this.transactionData = transactionData;
		transactionData.registerObserver(this);
		
	}

	@Override
	public void update(String customerName, double amount, String transactionDate, String transactionTime,
			String transactionCountry, String email, String mobileNo) {
		    emailConfig.sendEmail(customerName, amount, transactionDate, transactionTime, transactionCountry,email, mobileNo);	
	}
	

}
