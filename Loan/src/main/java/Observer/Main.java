package Observer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {
	
	private final static Logger logger = LoggerFactory.getLogger(Main.class);
	
	public static void main(String args[]) {
		Transaction transaction = new Transaction(0, 0, null, 0, null, null,false);
		Customer customer = new Customer(0, null, null, null, null, 0, false, false, false);
		
		try {
		transaction.checkForSuspiciousTransaction(customer.getCountry(), transaction.getTransactionCountry(), transaction.isSuspiciousTransaction());
		logger.info("suspicious transaction status is " + transaction.isSuspiciousTransaction() );
		if (transaction.isSuspiciousTransaction()) {
			logger.info("Possible fraudlant transaction notifying customer with id " + customer.getCustomerId());
		}
		else {
			logger.info("Transaction" + transaction.getPaymentId() + " apppears to be legitmate");
		}
	}
		catch(Exception e) {
			logger.error("Problem occured checking transaction info on error is as follows" + e.getMessage());
		}
		
    }
	
}
