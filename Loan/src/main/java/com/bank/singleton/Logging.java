package com.bank.singleton;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

import org.apache.commons.logging.impl.SimpleLog;

public class Logging {
	
	private volatile static Logging instance;

	private String logname = "bankLog";
    private String userEnvironment = ("C:\\Users\\Mark\\eclipse-workspace\\masterLoanApp\\Loan\\banklog.txt");
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
		System.out.println(userEnvironment);
		File logsFolder = new File(userEnvironment  + '/' + "Log");
		
		if(!logsFolder.exists()){
			System.err.println("INFO: Creating new logs directory in " + userEnvironment);
			logsFolder.mkdir();
			
		}
		DateFormat date = new SimpleDateFormat("dd-MM-yyyy");
	   	Calendar calender = Calendar.getInstance();

		logname =  logname + '-' +  date.format(calender.getTime()) + ".log";
		Logging.logFile = new File(userEnvironment);
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
			String loggingMessage = "";
			Date today = new Date();
			SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
			simpleDateFormat.setTimeZone(TimeZone.getTimeZone("Europe/London"));


			loggingMessage += "\nINFO:  " + simpleDateFormat.format(today) + "  " + message;
			FileWriter fileWrither = new FileWriter(Logging.logFile, true);
			fileWrither.write(loggingMessage.toCharArray());
			fileWrither.close();
		}
		catch(IOException e){
			System.err.println("ERROR: Could not write to log file");
		}
	}
		
		
		public void errorLog(String message){
			try{
				String loggingMessage = "";
				Date today = new Date();
				SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
				simpleDateFormat.setTimeZone(TimeZone.getTimeZone("Europe/London"));
				
				loggingMessage += "\nError:  " + simpleDateFormat.format(today) + "  " + message;
				FileWriter fileWrither = new FileWriter(Logging.logFile, true);
				fileWrither.write( loggingMessage.toCharArray());
				fileWrither.close();
			}
			catch(IOException e){
				System.err.println("ERROR: Could not write to log file");
			}
	}



}

