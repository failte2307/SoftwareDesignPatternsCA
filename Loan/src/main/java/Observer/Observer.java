package Observer;


public interface Observer {
	
    public void update(String customerName, double amount, String transactionDate, String transactionTime, String transactionCountry, String email, String mobileNo);
    
}