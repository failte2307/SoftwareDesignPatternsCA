package Observer;

import java.sql.Date;
import java.sql.Timestamp;

public class Transaction {
	
	private int paymentId;
	
	private int customerId;
	
	private String transactionCountry;
	
	private double amount;
	
	private Date transactionDate;
	
	private Timestamp transactionTime;
	
	private boolean suspiciousTransaction;

	public int getPaymentId() {
		return paymentId;
	}

	public void setPaymentId(int paymentId) {
		this.paymentId = paymentId;
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

	public Date getTransactionDate() {
		return transactionDate;
	}

	public void setTransactionDate(Date transactionDate) {
		this.transactionDate = transactionDate;
	}

	public Timestamp getTransactionTime() {
		return transactionTime;
	}

	public void setTransactionTime(Timestamp transactionTime) {
		this.transactionTime = transactionTime;
	}

	public Transaction(int paymentId, int customerId, String transactionCountry, double amount, Date transactionDate,
			Timestamp transactionTime) {
		this.paymentId = paymentId;
		this.customerId = customerId;
		this.transactionCountry = transactionCountry;
		this.amount = amount;
		this.transactionDate = transactionDate;
		this.transactionTime = transactionTime;
	}
	
	
	
	public boolean checkForSuspiciousTransaction(String customerCountry, String transactionCountry, boolean suspiciousTransaction) {
		if (customerCountry == transactionCountry ) {
			 return suspiciousTransaction = true;
		}	
		else {
			return suspiciousTransaction = false;
		}
	}


}
