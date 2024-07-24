package com.nt.beans;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("sf")
public class SeasonFinder
{
	 @Autowired
     private LocalDateTime dateTime;
	 
	 public String showseason()
	 {
		 int month = dateTime.getMonthValue();
		 
		 if(month<=3)
			 return "Winter Season";
		 else if(month>3 && month<=6)
			 return "Spring Season";
		 else if(month>6 && month<=9)
			 return "Summer Season";
		 else
			 return "Rain Season";
		
	 }
}
