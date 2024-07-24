package com.nt.factory;

import com.nt.comp.DiseslEngine;
import com.nt.comp.ElectricEngine;
import com.nt.comp.IVechile;
import com.nt.comp.PetrolEngine;
import com.nt.comp.Vechile;

public class VechileFactory 
{
      public static Vechile getInstance(String engineType)
      {
    	  IVechile vechile = null;
    	  if(engineType.equalsIgnoreCase("Petrol"))
    		  vechile = new PetrolEngine();
    	  else if(engineType.equalsIgnoreCase("Disel"))
    		  vechile = new DiseslEngine();
    	  else if(engineType.equalsIgnoreCase("Electric"))
    		  vechile = new ElectricEngine();
    	  else
    		  throw new IllegalArgumentException("Invalid Engine");
    	  
    	  Vechile vc = new Vechile();
    	  
    	  vc.setVechile(vechile);
    	  
    	  return vc;
      }
}
