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
import com.bank.loan.ShortTermLoan;

@RestController
public class Test {
	
	@RequestMapping(method = RequestMethod.GET, produces="application/json", value="/Loan/Cost/MtLtlcLispMTCa")
	@ResponseBody
	public Mortgage getAdditionalCharges() {
		try {
			Loan shortTermLoan = new Mortgage("Jennifer", "ShortTermLoan", 14, 20000);
			return (Mortgage) shortTermLoan;
	}
		catch (Exception e) {
			Logging.getInstance().errorLog(e.getMessage());
			
		}
		return null;
	}
}
