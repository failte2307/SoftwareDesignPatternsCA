package com.bank.observer;

import java.io.UnsupportedEncodingException;

import java.sql.Timestamp;
import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.Message.RecipientType;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;

public class EmailNotification implements Observer {
	
	
	private Subject transactionData;
	
	private final static String SSL_FACTORY = "javax.net.ssl.SSLSocketFactory";
	private final static String username = "failte2307@gmail.com";
	private final static String password = "3f6k3etc";
	
	
	
	public EmailNotification(SuspiciousTransactionData transactionData) {
		this.transactionData = transactionData;
		transactionData.registerObserver(this);
		
	}

	@Override
	public void update(String customerName, double amount, String transactionDate, String transactionTime,
			String transactionCountry, String email, String mobileNo) {
		    sendEmail(customerName, amount, transactionDate, transactionTime, email, mobileNo, transactionCountry);	
	}
	
	public void sendEmail(String customerName, double amount, String transactionDate,
			String transactionTime, String email, String mobileNo, String transactionCountry) {
	Properties props = System.getProperties();
	props = configureProperties();	
    try {
        Session session = Session.getInstance(props, new javax.mail.Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {;
                return new PasswordAuthentication(username, password);
            }
        });
        Message msg = new MimeMessage(session);  
        configureMessage(msg,customerName,transactionDate, transactionTime, mobileNo, transactionCountry, amount);
        Transport.send(msg);
        System.out.println("Message sent.");
    } catch (MessagingException e) {
        System.out.println("Error, cause: " + e);
    }
}
	
	public Properties configureProperties() {
		  Properties props = System.getProperties();
		  props.setProperty("mail.smtp.host","smtp.gmail.com");
		  props.setProperty("mail.smtp.socketFactory.class", SSL_FACTORY);
		  props.setProperty("mail.smtp.socketFactory.fallback", "false");
		  props.setProperty("mail.smtp.port", "465");
		  props.setProperty("mail.smtp.ssl.enable", "true");
		  props.put("mail.smtp.auth", "true");
		  props.put("mail.debug", "true");
		  props.put("mail.store.protocol", "pop3");
		  props.put("mail.transport.protocol", "smtp");
		  return props;
	}	
	
	public void configureMessage(Message msg, String customerName, String transactionDate, String transactionTime,
			String mobileNo, String transactionCountry, double amount ) {
		try {
		InternetAddress sender = new InternetAddress("failte2307@gmail.com", "Goliath National Bank");
		msg.setFrom(sender);
        InternetAddress[] addresses = InternetAddress.parse("shaunalily9@gmail.com"); 
        msg.addRecipients(RecipientType.TO, addresses);
        msg.setSubject("Golaith National Bank - Unusal Activity"); 
        msg.setText("Hi, " + customerName + " We recently noticed some suspicious activity on your recent transactions. On the " + 
        transactionDate+ " at " + transactionTime + " for the amount of " + Double.toString(amount) + " a suspicious transaction "
        		+ "took place in " +  transactionCountry +" Please log in to you Goliath Mobile app to confirm this was your transaction" +
        		" or contact us directly you have also been contacted on your phone " + mobileNo + ". Thank you"); 
        msg.setSentDate(new Date()); 
		}
		catch (MessagingException e) {
	        System.out.println("Error, cause: " + e);
	    } catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
	}


}
