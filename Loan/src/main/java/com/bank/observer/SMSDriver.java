package com.bank.observer;


import java.io.IOException;

import com.nexmo.client.NexmoClient;
import com.nexmo.client.NexmoClientException;
import com.nexmo.client.sms.SmsSubmissionResponse;
import com.nexmo.client.sms.SmsSubmissionResponseMessage;
import com.nexmo.client.sms.messages.TextMessage;



public class SMSDriver {
	
	public static void main (String args[]) throws IOException, NexmoClientException{
	
	NexmoClient client = new NexmoClient.Builder()
			  .apiKey("e5c39a7d")
			  .apiSecret("iuvAHPV3dCJajV4v")
			  .build();

			String messageText = "Hello from Nexmo";
			TextMessage message = new TextMessage("Nexmo", "353838388104", messageText);

			SmsSubmissionResponse response = client.getSmsClient().submitMessage(message);

			for (SmsSubmissionResponseMessage responseMessage : response.getMessages()) {
			    System.out.println(responseMessage);
			}
	}
}

