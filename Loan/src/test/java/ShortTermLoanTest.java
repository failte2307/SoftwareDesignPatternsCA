import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.loan.Mortgage;
import com.loan.ShortTermLoan;

public class ShortTermLoanTest {

	ShortTermLoan shortTermLoan = new ShortTermLoan("Shiela","Short Term Long", 4);
	ShortTermLoan shortTermLoan2 = new ShortTermLoan("Shiela","Short Term Long", 6);
	

	@Test
	public final void testCalculateInterestOnLoanByTermSTLShort() {
		assertEquals(0.15,shortTermLoan.CalculateInterestOnLoanByTerm(shortTermLoan.getTerm()),0.15);	
	}
	

	@Test
	public final void testCalculateInterestOnLoanByTermSTLLong() {
		assertEquals(0.25, shortTermLoan.CalculateInterestOnLoanByTerm(shortTermLoan2.getTerm()),0.25);
		
	}
	
	
	
	

}
