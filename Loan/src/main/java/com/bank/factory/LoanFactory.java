package com.bank.factory;

import com.bank.decorator.LoanFixedCharges;
import com.bank.decorator.LoanInsuranceStandardPolicy;
import com.bank.decorator.LoanTaxLocalCustomer;
import com.bank.decorator.MidTermCustomerDiscount;
import com.bank.loan.Mortgage;

	public class LoanFactory {
		
		LoanFixedCharges mortgage = new Mortgage();
		
		
		public LoanFixedCharges getLoanFixedCharges(LoanFixedChargesType loanFixedChargesType) {
			

	        switch (loanFixedChargesType) {
	            case MORT_TAXLC_LONGTCD:
	            	mortgage = new LoanTaxLocalCustomer(mortgage);
		    		mortgage = new LoanInsuranceStandardPolicy(mortgage);
		    		mortgage = new MidTermCustomerDiscount(mortgage);
		    		return mortgage;

	            default:
	                return null;
			
		}
	        
		}
	        
	        
	      public LoanFixedCharges Calc() {
	        	mortgage = new LoanTaxLocalCustomer(mortgage);
	    		mortgage = new LoanInsuranceStandardPolicy(mortgage);
	    		mortgage = new MidTermCustomerDiscount(mortgage);
	    		return mortgage;
	        }
	        	
	        }


	

