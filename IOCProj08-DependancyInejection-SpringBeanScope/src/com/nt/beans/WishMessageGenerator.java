package com.nt.beans;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//@Component("wmg")
@Component
@Scope("prototype")
public class WishMessageGenerator 
{
   @Autowired
   private LocalDateTime dateTime;
   
   public String showWishMessage(String user)
   {
	   int hour = dateTime.getHour();
	   if(hour<12)
		   return "Good Morning : " + user;
	   else if(hour<16)
		   return "Good Afternoon : " + user;
	   else if(hour<20)
		   return "Good Evening : " + user;
	   else
		   return "Good Night : " + user;
   }
   
}
