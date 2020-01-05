package com.bank.template;

import com.bank.state.AccountDTO;

public class PrintAccount extends Printer {
	
	AccountDTO account;
	
	
	public PrintAccount(AccountDTO account) {
		this.account = account;
	}
	
	public PrintAccount() {
		
	}
	
	@Override
	protected String getDocumentTitle() {
		return "\n\n **Customers Account Details**";
	}

	@Override
	protected String getDocumentDetails() {
		return "\n\n Account Holder : " + account.getAccountHolder() +
				"\n\n Account ID : " + account.getAccountId() +
				"\n\n Type of Account : " + account.getAccountStateDetails() +
				"\n\n Account Balance : " + account.getBalance() +
				"\n\n Account Interest Rate : " + account.getInterestRate() +
		        "\n\n ** Mortgages are subject to the rules laid out in EBC legigislation 2.4.2 **";
	}

}
