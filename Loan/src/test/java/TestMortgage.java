import static org.junit.Assert.assertEquals;

import org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


import com.loan.Mortgage;

public class TestMortgage {

	Mortgage mort = new Mortgage("John","Mortgage",14);
	Mortgage mort2 = new Mortgage("Mary","Mortgage",16);
	
	
	@Test
	public final void testCalculateInterestOnLoanByTermShort() {
		assertEquals(0.15,mort.CalculateInterestOnLoanByTerm(mort.getTerm()),0.15);
		
	}
	
    @Test 
    public final void TestCalculateInterestOnLoanByTermLong() {
    	assertEquals(0.25,mort2.CalculateInterestOnLoanByTerm(mort2.getTerm()),0.25);
    }
    
    


}
