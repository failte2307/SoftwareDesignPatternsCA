package com.bank.factory;

import com.bank.loan.LoanBehaviour;

public interface LoanBehaviourFactoryCreator {
	
	public LoanBehaviour getBehaviourType(LoanBehaviourType behaviourType);

}
