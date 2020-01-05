package com.bank.loan;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.mockito.Mock;

public class LoanBehaviourTest {
	
	@Mock 
	private LoanBehaviour behaviour;
	
	@Test
	public final void testCalculateInterestlongTermLoanUnder() {
		behaviour = new LongTermLoan();
		assertEquals(90,behaviour.calculateInterestOnLoanByTerm(2, 1000),0);
	}

	@Test
	public final void testCalculateInterestLongTermLoanOver() {
		behaviour = new LongTermLoan();
		assertEquals(150,behaviour.calculateInterestOnLoanByTerm(16, 1000),0);
	}
	
	@Test
	public final void testCalculateInterestLongTermLoanUnder() {
		behaviour = new LongTermLoanGoodCreditRating();
		assertEquals(81,behaviour.calculateInterestOnLoanByTerm(2, 1000),0);
	}
	
	@Test
	public final void testCalculateInterestLongTermLoanGoodRatingOver() {
		behaviour = new LongTermLoanGoodCreditRating();
		assertEquals(135,behaviour.calculateInterestOnLoanByTerm(16, 1000),0);
	}
	
	@Test
	public final void testCalculateInterestShortTermLoanUnder() {
		behaviour = new ShortTermLoan();
		assertEquals(150,behaviour.calculateInterestOnLoanByTerm(4, 1000),0);
	}
	
	@Test
	public final void testCalculateInterestShortTermLoanMid() {
		behaviour = new ShortTermLoan();
		assertEquals(200,behaviour.calculateInterestOnLoanByTerm(5, 1000),0);
	}
	
	@Test
	public final void testCalculateInterestShortTermLoanOver() {
		behaviour = new ShortTermLoan();
		assertEquals(250,behaviour.calculateInterestOnLoanByTerm(15, 1000),0);
	}
	
	
	
}
