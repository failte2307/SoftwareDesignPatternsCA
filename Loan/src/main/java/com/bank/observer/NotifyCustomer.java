package com.bank.observer;

import java.sql.Date;

public interface NotifyCustomer {
	
	public void sendNotification(String customerName, double amount, Date transactionDate, Date transactionTime);
}
