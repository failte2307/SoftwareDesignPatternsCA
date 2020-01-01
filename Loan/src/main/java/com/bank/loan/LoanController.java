package com.bank.loan;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.bank.decorator.AdditionalCharges;
import com.bank.decorator.LoanFixedCharges;
import com.bank.decorator.LoanInsuranceStandardPolicy;
import com.bank.decorator.LoanTaxLocalCustomer;
import com.bank.decorator.MidTermCustomerDiscount;
import com.bank.observer.CustomerDTO;
import com.bank.observer.Transaction;
import com.bank.singleton.Logging;

@RestController
public class LoanController {
	
	@RequestMapping(method = RequestMethod.GET, produces="application/json", value="/Loan/Cost/MtLtlcLispMTCD")
	@ResponseBody
	public AdditionalCharges getAdditionalCharges() {
		try {
	    String name = "Steven";
		LoanFixedCharges mortgageLoan = new Mortgage();
		mortgageLoan = new LoanTaxLocalCustomer(mortgageLoan);
		mortgageLoan = new LoanInsuranceStandardPolicy(mortgageLoan);
		mortgageLoan = new MidTermCustomerDiscount(mortgageLoan);
		
		Logging.getInstance().infoLog("Calculated additional charges for " + 
		mortgageLoan.getLoanFixedChargesDescription() + " Charges Cost " + 
	    mortgageLoan.additionalExpenses());	
		
		
		AdditionalCharges additionalCharges = new AdditionalCharges(mortgageLoan.additionalExpenses(), 
				mortgageLoan.getLoanFixedChargesDescription());
		return additionalCharges;
	}
		catch (Exception e) {
			Logging.getInstance().errorLog(e.getMessage());
			
		}
		return null;
	}
}