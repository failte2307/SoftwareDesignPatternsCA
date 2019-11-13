package com.bank.observer;

import java.sql.Date;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Transaction")
public class Transaction {
	
	@Id
	@Column(name = "Transaction_Id")
	private int transactionId;
	
	@Column(name = "Customer_Id")
	private int customerId;
	
	@Column(name = "Transaction_Country")
	private String transactionCountry;
	
	@Column(name = "Amount")
	private double amount;
	
	@Column(name = "Time")
	private Timestamp transactionDateTime;
	
	@Column(name = "Is_Suspicious_Transaction")
	private boolean isSuspiciousTransaction;

	public int getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(int transactionId) {
		this.transactionId = transactionId;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getTransactionCountry() {
		return transactionCountry;
	}

	public void setTransactionCountry(String transactionCountry) {
		this.transactionCountry = transactionCountry;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public Timestamp getTransactionDateTime() {
		return transactionDateTime;
	}

	public void setTransactionDateTime(Timestamp transactionDateTime) {
		this.transactionDateTime = transactionDateTime;
	}

	public Transaction(int transactionId, int customerId, String transactionCountry, double amount, Timestamp transactionDateTime) {
		this.transactionId = transactionId;
		this.customerId = customerId;
		this.transactionCountry = transactionCountry;
		this.amount = amount;
        this.transactionDateTime = transactionDateTime;
	}
	
	public Transaction() {
		
		
	}
	
	public boolean checkForSuspiciousTransaction(String customerCountry, String transactionCountry, boolean suspiciousTransaction) {
		if (customerCountry == transactionCountry ) {
			 return suspiciousTransaction = false;
		}	
		else {
			return suspiciousTransaction = true;
		}
	}
	
	
	public boolean isSuspiciousTransaction() {
		return isSuspiciousTransaction;
	}

	public void setSuspiciousTransaction(boolean isSuspiciousTransaction) {
		this.isSuspiciousTransaction = isSuspiciousTransaction;
	}


}
