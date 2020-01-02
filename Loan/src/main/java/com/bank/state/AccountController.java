package com.bank.state;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.bank.decorator.AdditionalCharges;
import com.bank.singleton.Logging;

@RestController
public class AccountController {
	
	@RequestMapping(method = RequestMethod.GET, produces="application/json", value="/create/account")
	@ResponseBody
	public Account getAccountStates(@RequestBody Account account) {
		try {
			 Logging.getInstance().infoLog("Current account state: " +account.checkState());
			 account.getInterestRate();
			 account.addInterest();	
			 Logging.getInstance().infoLog("Account Balance is: " + account.getBalance());
			 
			 account.withdraw(10499);
			 Logging.getInstance().infoLog("Current account state: " + account.checkState());
			 account.addInterest();	
			 Logging.getInstance().infoLog("Account Balance is: " + account.getBalance());
			 account.withdraw(10);
			 
			 Logging.getInstance().infoLog("Current account state: " + account.checkState());	 
			 account.deposit(10);
			 
			 Logging.getInstance().infoLog("Current account state: " + account.checkState()); 
			 account.deposit(10000);
			 
			 Logging.getInstance().infoLog("Current account state: " + account.checkState());
			 account.setAccountDetails();
			 
			 return account;
		}
		catch (Exception e) {
			Logging.getInstance().errorLog(e.getMessage());
		}
			return null;
	}
	
	
}
