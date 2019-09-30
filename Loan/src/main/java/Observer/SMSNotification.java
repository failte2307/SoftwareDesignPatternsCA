package Observer;

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
	
	private final static Logger logger = LoggerFactory.getLogger(SMSNotification.class);
	
	private TransactionData transactionData;
	
	public SMSNotification(TransactionData transactionData) {
		this.transactionData = transactionData;
		transactionData.registerObserver(this);
		
	}
	
	@Override
	public void update(String customerName, double amount, Date transactionDate, Timestamp transactionTime,
			String transactionCountry)  {
	NexmoClient client = new NexmoClient.Builder()
			  .apiKey("e5c39a7d")
			  .apiSecret("iuvAHPV3dCJajV4v")
			  .build();

			String messageText = "A suspicious transaction has occured and your account has been locked please contact us via your online account";
			TextMessage message = new TextMessage("Goliath National Bank", "353838388104", messageText);
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

