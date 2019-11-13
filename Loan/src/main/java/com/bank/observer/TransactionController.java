package com.bank.observer;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@RestController
public class TransactionController {

	private final static Logger logger = LoggerFactory.getLogger(TransactionController.class);
	
	@Autowired
	CustomerDAO customerDao;

	@RequestMapping(method = RequestMethod.POST, produces="application/json", value="/transactioncheck")
	@ResponseBody
	public CustomerDTO checkForSuspiciousTransaction(@RequestBody Transaction transaction) {
		CustomerDTO customer = new CustomerDTO();
		customer = customerDao.getCustomerById(transaction.getCustomerId());
        transaction.setSuspiciousTransaction(transaction.checkForSuspiciousTransaction(customer.getCountry(), transaction.getTransactionCountry(),
        		transaction.isSuspiciousTransaction()));
        if(transaction.isSuspiciousTransaction()) {
        	logger.info("transaction with id " + transaction.getTransactionId() + " is suspicious");
        	SuspiciousTransactionData suspiciousTransaction = new SuspiciousTransactionData(); 
        	EmailNotification email = new EmailNotification(suspiciousTransaction);
        	SMSNotification sms = new SMSNotification(suspiciousTransaction);
        	String dateFormatted = suspiciousTransaction.convertTransactionTimeStamp(transaction.getTransactionDateTime());
        	suspiciousTransaction.setSuspiciousTransactionDetails(customer.getName(), transaction.getAmount(),
        		    dateFormatted.substring(0, 10),dateFormatted.substring(11, 19),transaction.getTransactionCountry(), 
        			customer.getEmail(), customer.getMobileNo());
        	return customer;	
        }
        else {
        	logger.info("transaction with id " + transaction.getTransactionId() + " isn't suspicious");
        	return customer;
        }
		
		
	}
}
