package com.bank.factory;

import com.bank.decorator.LoanFixedCharges;
import com.bank.decorator.LoanInsuranceStandardPolicy;
import com.bank.decorator.LoanTaxLocalCustomer;
import com.bank.decorator.MidTermCustomerDiscount;
import com.bank.loan.Mortgage;

public class FactoryDriver {
	
	public static void main (String args[]) {

	LoanFactory additionalCharges = new LoanFactory();
	LoanFixedCharges bla = additionalCharges.getLoanFixedCharges(LoanFixedChargesType.MORT_TAXLC_LONGTCD);
	System.out.println(bla.additionalExpenses());
	System.out.println(bla.getLoanFixedChargesDescription());
	
	
        	
	}
        }


