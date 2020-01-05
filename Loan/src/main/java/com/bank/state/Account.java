package com.bank.state;

public class Account {

    private int accountId;
	private String accountHolder;
	private double balance;
	private String accountStateDetails;
	private double interestRate;
		
	private AccountState highInterestAccountState;
	private  AccountState lowInterestAccountState;
	private AccountState overdrawnAccountState;
	private AccountState newInterestAccountState;
	 
	private AccountState state = newInterestAccountState;
	 
		
		public Account(int accountId, String accountHolder, double balance, 
				String accountState, double interestRate) {
			this.accountId = accountId;
			this.accountHolder = accountHolder;
			this.balance = balance;
			this.accountStateDetails = accountState;
			this.interestRate = interestRate;
			highInterestAccountState = new HighInterestAccountState(this);
			lowInterestAccountState = new LowInterestAccountState(this);
			newInterestAccountState = new NewInterestAccountState(this);
			overdrawnAccountState= new OverdrawnAccountState(this);
		}
		
        public void setAccountState(AccountState accountState) {
        	this.state = accountState;
        }
	 
		public boolean withdraw(double amount) {
			return state.withdraw(amount);

		}

		public boolean deposit(double amount) {
			return state.deposit(amount);
		}

		public double viewBalance() {
			return state.viewBalance();
		}
		

		public String checkState() {
			return state.checkState();
		}
		
		public double addInterest() {
			return state.addInterest();
			
		}
		
		public void setAccountDetails() {
			state.setAccountDetails();
		}
		
		public int getAccountId() {
			return accountId;
		}

		public String getAccountHolder() {
			return accountHolder;
		}

		public double getBalance() {
			return balance;
		}

		public AccountState getHighInterestAccountState() {
			return highInterestAccountState;
		}

		public AccountState getLowInterestAccountState() {
			return lowInterestAccountState;
		}

		public AccountState getOverDrawnAccountState() {
			return overdrawnAccountState;
		}

		public void setAccountId(int accountId) {
			this.accountId = accountId;
		}

		public void setAccountHolder(String accountHolder) {
			this.accountHolder = accountHolder;
		}

		public void setBalance(double balance) {
			this.balance = balance;
		}

		public void setHighInterestAccountState(AccountState highInterestAccountState) {
			this.highInterestAccountState =  highInterestAccountState;
		}

		public void setLowInterestAccountState(AccountState lowInterestAccountState) {
			this.lowInterestAccountState = lowInterestAccountState;
		}

		public void setOverDrawnAccountState(AccountState overDrawnAccountState) {
			overdrawnAccountState = overDrawnAccountState;
		}

		public String getAccountStateDetails() {
			return accountStateDetails;
		}

		public double getInterestRate() {
			return interestRate;
		}

		public AccountState getOverdrawnAccountState() {
			return overdrawnAccountState;
		}

		public void setAccountStateDetails(String accountStateDetails) {
			this.accountStateDetails = accountStateDetails;
		}

		public void setInterestRate(double interestRate) {
			this.interestRate = interestRate;
		}

		public Account(AccountDTO dto) {
			this.accountId = dto.getAccountId();
			this.accountHolder = dto.getAccountHolder();
			this.balance = dto.getBalance();
			this.accountStateDetails = dto.getAccountStateDetails();
			this.interestRate = dto.getInterestRate();
		}
		
	    public Account(){
			
		}

	
}
