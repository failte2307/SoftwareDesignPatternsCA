package com.bank.state;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.bank.decorator.AdditionalCharges;

@RestController
public class AccountController {
	
	@RequestMapping(method = RequestMethod.GET, produces="application/json", value="/create/account")
	@ResponseBody
	public Account getAccountStates(@RequestBody Account account) {
		try {
			
		}
