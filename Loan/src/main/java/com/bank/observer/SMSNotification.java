package com.bank.observer;

import java.io.IOException;
import java.sql.Date;
import java.sql.Timestamp;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.nexmo.client.NexmoClient;
import com.nexmo.client.NexmoClientException;
import com.nexmo.client.sms.SmsSubmissionResponse;
import com.nexmo.client.sms.SmsSubmissionResponseMessage;
import com.nexmo.client.sms.messages.TextMessage;

public class SMSNotification implements Observer {
	
	private Subject transactionData;
	
	public SMSNotification(SuspiciousTransactionData transactionData) {
		this.transactionData = transactionData;
		transactionData.registerObserver(this);
		
	}

	@Override
	public void update(String customerName, double amount, String transactionDate, String transactionTime,
			String transactionCountry, String email, String mobileNo) {
		NexmoClient client = new NexmoClient.Builder()
				  .apiKey("e5c39a7d")
				  .apiSecret("iuvAHPV3dCJajV4v")
				  .build();
		
				String messageText = "Hi " + customerName + "A suspicious transaction has occured in " 
				+ transactionCountry +" on the " + transactionDate + " at "+ transactionTime + 
						"for the amount" + Double.toString(amount) +
						" your account has been locked please contact us via your online account you  "
						+ "have also been notified via email at " 
						+ email;
				TextMessage message = new TextMessage("Goliath", mobileNo , messageText);
				SmsSubmissionResponse response = null;
			    try {
					response = client.getSmsClient().submitMessage(message);
				} catch (IOException e) {
					e.printStackTrace();
				} catch (NexmoClientException e) {
					e.printStackTrace();
				}
				for (SmsSubmissionResponseMessage responseMessage : response.getMessages()) {
				    System.out.println(responseMessage);
				} 
					
		}

		
	}

