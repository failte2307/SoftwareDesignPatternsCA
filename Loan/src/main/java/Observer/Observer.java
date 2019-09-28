package Observer;

import java.sql.Date;
import java.sql.Timestamp;

public interface Observer {
	
    public void update(String customerName,double amount,Date transactionDate,Timestamp transactionTime, String transactionCountry);
    
}