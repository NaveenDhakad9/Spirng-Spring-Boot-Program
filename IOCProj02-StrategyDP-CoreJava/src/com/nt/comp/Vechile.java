package com.nt.comp;

public  final class Vechile 
{
     private IVechile vechile;
     
     public void setVechile(IVechile vechile)
     {
    	 //System.out.println("Vechile.setVechile()");
    	 this.vechile = vechile;
     }
     
     public String engine1(String engineType)
     {
    	 String msg = vechile.engine(engineType);
    	 return msg;
     }
     
}
