package com.weekly.week2;

import java.io.*;


public class Week2_Booleans
{

	public static void main (String[] args)
	{

		// logical operators
		// AND, OR, XOR, NOT 
		
//		System.out.println (false || true);
//		System.out.println (true && false);
		
		
//		System.out.println(true || true  && false);		
//		System.out.println((true || true ) && false);
		
		// short circuit examples
//		System.out.format("short circuit 1 = %s\n", false && true);
//		System.out.format("short circuit 2 = %s\n", true || true);
		
		boolean b = true && false || true && false || true;
		//               f        ||    t
		//                        t       &&   f
		//                                 f       || true
		//            
//		System.out.print("b = \n\n");
//		System.out.println (b);

	
	System.out.print ("Messy = ");                                // identicxal expression           
	System.out.println ( ((3<4) || (4>6) || (-2<=-3) ) &&  (('a'=='b') || (25 % 5 == 0))  );
		              //     (  T   ||  F    ||     F    ) &&  (     F 	   ||      T       )    
		              //     (       T       ||     F    ) &&  (         T                 )
                      //     (                T          ) &&  (         T                 )     		
		              //                                    T
		
		
		String fruit = "bananas";
//		System.out.println ("--- fruit ---");
//		System.out.println(fruit.equals("apples"));
//		System.out.println(fruit.equals("apples") || fruit.equals("bananas"));
//		System.out.println(fruit.equals("apples") && fruit.equals("bananas"));
	
		
		// NOT
//		System.out.println ("----- NOT -----");		
//		System.out.println (!true);
//		System.out.println ( !(100 <= 100));
//		System.out.println ( !(fruit.charAt(2) == 'n' && (fruit.charAt(3) != 'a')) );
//
//		System.out.print("numbers = ");
//		System.out.println( ( ( 1 > 100 || 100 < 1000) && ( 5 > 4 || ('a' < 'b')) ) );
				
		//                     (  false  ||    true  ) && ( false || true ) )
		//                     (         true        ) && (      true     )
		//                     (   true                && true)
		//                                  true
		
		
		// Simple true table	
////		System.out.println ("AND");
////		System.out.print("true AND true = ");
////		System.out.println ( true && true);
////		System.out.print("true AND false = ");
////		System.out.println (true && false);	
////		System.out.print("false AND true = ");
////		System.out.println (false && true);
////		System.out.print("false AND false = ");
////		System.out.println (false && false);
//
////		System.out.println ("OR");
////		System.out.print("true OR true = ");
////		System.out.println ( true || true);
////		System.out.print("true OR false = ");
////		System.out.println (true || false);	
////		System.out.print("false OR true = ");
////		System.out.println (false || true);
////		System.out.print("false OR false = ");
////		System.out.println (false || false);
//////
////		
////		System.out.println ("XOR");
		System.out.print("true XOR true = ");
		System.out.println ( true ^ true);
		System.out.print("true XOR false = ");
		System.out.println (true ^ false);	
		System.out.print("false XOR true = ");
		System.out.println (false ^ true);
		System.out.print("false XOR false = ");
		System.out.println (false ^ false);
		 
		
		
		
		
		/** 
		 * DeMorgan's Law
		 * not (A or B) = (not A) and (not B)
		 * not (A and B) = (not A) or (not B)
		 */	
		
//		boolean a = (1 == 1);
//		boolean b = (1 == 1);
//		System.out.println( !(a || b) == (!a && !b));
//		System.out.println( !(a && b) == (!a || !b));
//		
//		a = (1 == 1);
//		b = (1 == 0);
//		System.out.println( !(a || b) == (!a && !b));
//		System.out.println( !(a && b) == (!a || !b));
//		
//		a = (1 == 0);
//		b = (1 == 1);
//		System.out.println( !(a || b) == (!a && !b));
//		System.out.println( !(a && b) == (!a || !b));
//		
//		a = (1 == 0);
//		b = (1 == 0);
//		System.out.println( !(a || b) == (!a && !b));
//		System.out.println( !(a && b) == (!a || !b));
	
	}
	
}
