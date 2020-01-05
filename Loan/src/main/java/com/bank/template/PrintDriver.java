package com.bank.template;

import com.bank.state.AccountDTO;

public class PrintDriver {
	public static void main (String args[]) {
			
			AccountDTO account = new AccountDTO(1,"Mark",10000,"Created Account",5);
			Printer printer = new PrintAccount(account);
			System.out.println(printer.printBankDocument());

	}
}
