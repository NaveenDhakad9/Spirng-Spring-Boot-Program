package com.nt.sbeans;

import org.springframework.stereotype.Component;

@Component("electric")
public class ElectricEngine implements IVechile
{
	public void engine()
    {
   	   System.out.println("You choose car is ElectricEngine Car");
    }
}
