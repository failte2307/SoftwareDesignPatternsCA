package com.bank.template;

import java.text.SimpleDateFormat;
import java.util.Date;

public abstract class Printer {
	
	private SimpleDateFormat simpleDate = new SimpleDateFormat("dd/MM/yyyy HH:mm"); 
	private Date date = new Date();
	
	public final String printBankDocument() {		
		
			StringBuilder bankDocument = new StringBuilder();
		
			bankDocument.append(getDocumentHeaderInformation());
			
			bankDocument.append(getDocumentTitle());
			
			bankDocument.append(getDocumentDetails());
			
			bankDocument.append(getDocumentFooter());
			
			return bankDocument.toString();
			
	}
	
	protected String getDocumentHeaderInformation() {
		return "GOLIATH NATIONAL BANK"
				+ "\n " + simpleDate.format(date);
	}
	
	protected abstract String getDocumentTitle();
	
	protected abstract String getDocumentDetails();
	
	protected String getDocumentFooter() {
		
		return "\n\n@Copyright Goliath National Bank";
	}	

}
