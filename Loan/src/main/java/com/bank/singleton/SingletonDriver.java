package com.bank.singleton;

public class SingletonDriver {
	public static int man = 2;
	public static void main(String args[]) {
		
		
     Logging.getInstance().log("Test");
     Logging.getInstance().log("Hi " + man);
		
		
		
	}

}
