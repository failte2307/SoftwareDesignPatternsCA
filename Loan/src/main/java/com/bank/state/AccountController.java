package com.bank.state;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.bank.decorator.AdditionalCharges;
import com.bank.singleton.Logging;

@RestController
public class AccountController {
	
	@RequestMapping(method = RequestMethod.GET, produces="application/json", value="/account/withdraw/{amount}")
	@ResponseBody
	public AccountDTO getAccountStates(@PathVariable("amount") int amount ) {
		try {
			Account account = new Account(1,"Mark",10000,"Created Account",0);
			account.withdraw(amount);
			account.setAccountDetails();
			AccountDTO accountdto = new AccountDTO(account);
			return accountdto;
		}
		catch (Exception e) {
			Logging.getInstance().errorLog(e.getMessage());
		}
			return null;
	}
	
	
}
