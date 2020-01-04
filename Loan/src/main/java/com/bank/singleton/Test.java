package com.bank.singleton;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.bank.decorator.LoanFixedCharges;
import com.bank.decorator.LoanInsuranceStandardPolicy;
import com.bank.decorator.LoanTaxLocalCustomer;
import com.bank.decorator.MidTermCustomerDiscount;
import com.bank.loan.Loan;
import com.bank.loan.Mortgage;

@RestController
public class Test {
	
	@RequestMapping(method = RequestMethod.GET, produces="application/json", value="/Loan/Cost/MtLtlcLispMTCa")
	@ResponseBody
	public double getAdditionalCharges() {
		try {
			Logging.getInstance().infoLog("test");
		Loan mortgageLoan = new Mortgage();
		mortgageLoan = new LoanTaxLocalCustomer(mortgageLoan);
		mortgageLoan = new LoanInsuranceStandardPolicy(mortgageLoan);
		mortgageLoan = new MidTermCustomerDiscount(mortgageLoan);	
		return mortgageLoan.additionalExpenses();	
	}
		catch (Exception e) {
			Logging.getInstance().errorLog(e.getMessage());
			
		}
		return 0.00;
	}
}
