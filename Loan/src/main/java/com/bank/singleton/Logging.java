package com.bank.singleton;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import org.apache.commons.logging.impl.SimpleLog;

public class Logging {
	
	private volatile static Logging instance;

	private String logname = "bankLog";
    private String userEnvironment = System.getProperty ("user.dir");
	private static File logFile;
	
	public static Logging getInstance() {
		 if (instance == null) {		 
			 synchronized (Logging.class) {
				 if (instance == null) {
					 instance = new Logging();
				 }
			 }
		}
		 return instance;		 
	}
	
	private Logging(){
		if (instance != null){
			throw new IllegalStateException("Cannot instantiate a new singleton instance of Logging this is to stop reflection");
		}
		this.createLogFile();
	}
	
	
	private void createLogFile(){
		File logsFolder = new File(userEnvironment + '/' + "logs");
		if(!logsFolder.exists()){
			//Create the directory 
			System.err.println("INFO: Creating new logs directory in " + userEnvironment);
			logsFolder.mkdir();
			
		}
		DateFormat date = new SimpleDateFormat("yyyy-MM-dd");
	   	Calendar calender = Calendar.getInstance();

		logname =  logname + '-' +  date.format(calender.getTime()) + ".log";
		Logging.logFile = new File(logsFolder.getName(),logname);
		try{
			if(logFile.createNewFile()){
				System.err.println("INFO: Creating new log file");	
			}
		}catch(IOException e){
			System.err.println("ERROR: Error creating LogFile");
		}
	}


	public void infoLog(String message){
		try{
			DateFormat date = new SimpleDateFormat("yyyy-MM-dd");
		   	Calendar calender = Calendar.getInstance();
			message += "\n INFO:  " + date.format(calender.getTime()) + "  ";
			FileWriter fileWrither = new FileWriter(Logging.logFile, true);
			fileWrither.write( message.toCharArray());
			fileWrither.close();
		}catch(IOException e){
			System.err.println("ERROR: Could not write to log file");
		}
		public void errorLog(String message){
			try{
				DateFormat date = new SimpleDateFormat("yyyy-MM-dd");
			   	Calendar calender = Calendar.getInstance();
				message += "\n INFO:  " + date.format(calender.getTime()) + "  ";
				FileWriter fileWrither = new FileWriter(Logging.logFile, true);
				fileWrither.write( message.toCharArray());
				fileWrither.close();
			}catch(IOException e){
				System.err.println("ERROR: Could not write to log file");
			}
	}



}

