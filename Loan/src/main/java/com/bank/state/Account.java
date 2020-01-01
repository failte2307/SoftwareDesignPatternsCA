package com.bank.state;

public class Account {

    private int accountId;
	private String accountHolder;
	private double balance;
	private String accountState;
	private double InterestRate;
	
	
	 AccountState highInterestAccountState;
	 AccountState lowInterestAccountState;
	 AccountState overdrawnAccountState;
	 AccountState newInterestAccountState;
	 
	 AccountState state;
	 
		
		public Account(int accountId, String accountHolder, double balance, String accountState) {
			this.accountId = accountId;
			this.accountHolder = accountHolder;
			this.balance = balance;
			this.accountState = accountState;
			highInterestAccountState = new HighInterestAccountState(this);
			lowInterestAccountState = new LowInterestAccountState(this);
			overdrawnAccountState= new OverdrawnAccountState(this);
			newInterestAccountState = new NewInterestAccountState(this);
			state = newInterestAccountState;
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
		

		public void checkState() {
			state.checkState();
		}
		
		private double addInterest() {
			return state.addInterest();
			
		}
		
		public String Test() {
			return state.test();
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

		public AccountState getBlockedAccountState() {
			return newInterestAccountState;
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

		public void setBlockedAccountState(AccountState blockedAccountState) {
			newInterestAccountState = blockedAccountState;
		}
		
	
}
