package com.nt.test;
import java.util.Scanner;

import com.nt.comp.Vechile;
import com.nt.factory.VechileFactory;

public class StrategyPatternTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Vechile vc = new Vechile();
		System.out.println("Enter your choose Engine car");
		System.out.println("Enter \t1.Pertol \t2.Disel \t3.Electric");
		switch(sc.nextInt())
		{
		  case 1:
			vc = VechileFactory.getInstance("Petrol"); 
			String Result = vc.engine1("Petrol");
			System.out.println(Result);
		    break;
		  case 2:
			  vc = VechileFactory.getInstance("Disel");
			  String Result1 = vc.engine1("Disel");
				System.out.println(Result1);
			  break;
		  case 3:
			  vc = VechileFactory.getInstance("Electric");
			  String Result2 = vc.engine1("Electric");
				System.out.println(Result2);
			  break;
		  default :
			  System.out.println("Invaild choose");
		}
    
		sc.close();
	}

}
