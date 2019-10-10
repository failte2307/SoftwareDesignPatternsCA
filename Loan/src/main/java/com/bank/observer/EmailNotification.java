package com.bank.observer;

import java.sql.Date;
import java.sql.Timestamp;

public class EmailNotification implements Observer {
	
	private SuspiciousTransactionData transactionData;
	
	EmailConfiguration emailConfig = new EmailConfiguration();
	
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
