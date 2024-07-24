package com.nt.sbeans;

import org.springframework.stereotype.Component;

@Component("petrol")
public class PetrolEngine implements IVechile
{
	public void engine()
    {
   	   System.out.println("You choose car is PetrolEngine Car");
    }
}
