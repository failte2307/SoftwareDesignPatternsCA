package com.bank.singleton;

public class SingletonDriver {

	public static void main(String args[]) {
		
    Logging.getInstance().infoLog("test");
    System.out.println(Logging.getInstance().equals(Logging.getInstance()));
    System.out.println("Hi");
     
	}


}
