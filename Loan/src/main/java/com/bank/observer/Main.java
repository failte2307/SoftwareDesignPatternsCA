//package com.bank.observer;
//
//import java.util.ArrayList;
//import java.util.List;
//
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//
//public class Main {
//	
//	private final static Logger logger = LoggerFactory.getLogger(Main.class);
//	
//
//	
//	public static void main(String args[]) {
//		Transaction transaction = new Transaction(1, 0, null, 0, null, false);
//		Transaction transaction2 = new Transaction(1, 0, null, 0, null, false);
//		ArrayList <Transaction> transactionList = new ArrayList<>();
//		transactionList.add(transaction);
//		transactionList.add(transaction2);
//		ArrayList <Transaction> suspiciousTransactions = new ArrayList<Transaction>();
//		
//
//		
//			for(int i = 0; i < transactionList.size(); i++) {
//			//	transactionList.get(i).checkForSuspiciousTransaction(customer.getCountry(), transaction.getTransactionCountry(), transaction.isSuspiciousTransaction());
//				if(transactionList.get(i).isSuspiciousTransaction()) {
//				   suspiciousTransactions.add(transactionList.get(i));
//				   logger.info("Transaction " + transactionList.get(i) + " has been added to suspicious transactions");
//				   }		
//			}
//			
//			logger.info("A total of " + suspiciousTransactions.size() + " Were logged for customer with id " + customer.getCustomerId());
//			if(suspiciousTransactions.size() > 0) {
//				SuspiciousTransactionData suspiciousData = new SuspiciousTransactionData();
//			}
//			
//			
//		try {
//		transaction.checkForSuspiciousTransaction(customer.getCountry(), transaction.getTransactionCountry(), transaction.isSuspiciousTransaction());
//		logger.info("suspicious transaction status is " + transaction.isSuspiciousTransaction() );
//		if (transaction.isSuspiciousTransaction()) {
//			SuspiciousTransactionData suspiciousData = new SuspiciousTransactionData();
//			
//			logger.info("Possible fraudlant transaction notifying customer with id " + customer.getCustomerId());
//		}
//		else {
//			logger.info("Transaction" + transaction.getPaymentId() + " apppears to be legitmate");
//		}
//	}
//		catch(Exception e) {
//			logger.error("Problem occured checking transaction info on error is as follows" + e.getMessage());
//		}
//		
//    }
//	
//}
