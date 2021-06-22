package com.jangocs.bloodbank;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;

public class Date_and_time {

	public static void main(String[] args) {

		Calendar calendar = Calendar.getInstance();  
		   System.out.println("At present Calendar's Year: " + calendar.get(Calendar.YEAR));  
		   System.out.println("At present Calendar's Day: " + calendar.get(Calendar.DATE));  
		   System.out.println("At present Calendar's Month: " + (calendar.get(Calendar.MONTH))+1);
		   
		   Calendar calendar1 = Calendar.getInstance();  
		   System.out.println("At present Date And Time Is: " + String.valueOf(calendar1.getTime()));  
		   
		   LocalTime localTime = LocalTime.now();
		   DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("hh:mm a");
		   System.out.println(localTime.format(dateTimeFormatter));

		
		
	}

}
