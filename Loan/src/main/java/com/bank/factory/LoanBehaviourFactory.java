package com.bank.factory;

import com.bank.decorator.LoanFixedCharges;
import com.bank.decorator.LoanInsuranceStandardPolicy;
import com.bank.decorator.LoanTaxLocalCustomer;
import com.bank.decorator.MidTermCustomerDiscount;
import com.bank.loan.LoanBehaviour;
import com.bank.loan.LongTermLoan;
import com.bank.loan.LongTermLoanGoodCreditRating;
import com.bank.loan.Mortgage;
import com.bank.loan.PersonalLoan;
import com.bank.loan.STL;
import com.bank.loan.ShortTermLoan;

	public class LoanBehaviourFactory implements LoanBehaviourFactoryCreator {				
		
		public LoanBehaviour getBehaviourType(LoanBehaviourType behaviourType) {
			switch (behaviourType) {
			
            case LONG_TERM_LOAN:
                return new LongTermLoan();
            case SHORT_TERM_LOAN:
            	return new ShortTermLoan();
            case LTL_GOOD_RATING:
                return new LongTermLoanGoodCreditRating();
            	
            	default:
            		return null;		
			}
		}			
 }


	

