package com.nt.bean;

import java.time.DayOfWeek;
import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("weow")
public class WeekEndOrWork 
{
	 @Autowired
     private LocalDate dateTime;
	 
	 public String dayofWeek() 
	 {
	     DayOfWeek week = dateTime.getDayOfWeek();
	     int dayNumber = week.getValue();
	     
	     if(dayNumber==6 && dayNumber==7)
	    	 return "Enjoy the WeekEnd";
	     else
	    	 return "Working Day.";
	 }
}
