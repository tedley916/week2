package com.weekly.week2;

import java.util.*;
import java.io.*;

public class Week2_Loops
{

	public static void main (String[] args)
	{
		

//  WHILE vs DO-WHILE
//		int x = 3, y = 10;
//		while (x <= 10 || y <= 20)
//		{
//			System.out.println ("x,y = " + x + "," + y);
//			x++;
//			y++;
//		}
////		
//		System.out.println ("**************");
//		x = 3; 
//		y = 10;
//		do {
//			System.out.println ("x,y = " + x + "," + y);
//			x++;
//			y++;
//		} while (x <= 10 && y <= 20);
//		
	
//		boolean loopy = false;
//		
//		// possible uses - checking password, check to see if an item is in stock...
//		do {
//			System.out.println ("do-while interates at least once");
//		} while (loopy);
//		
//		// posible uses - reading a file.  
//		while (loopy)
//		{
//			System.out.println ("while may not iterate at all");
//		}
		
		
////      FOR LOOPS		
// 		System.out.println ("break");
//		for (int x = 0; x <= 5; x++)
//		{
//			if (x == 2)
//			{
//				break;
//			}
//			System.out.println(x);
//		}
////
//		System.out.println ("continue");
//		for (int x = 0; x <= 5; x++)
//		{
//			if (x==2)
//			{
//				continue;
//			}
//			System.out.println(x);
//		}

//		System.out.println ("fancy");
//		for (int x = 0, y=10 ; ( x <= 10 && y <= 20); x++, y++)
//		{
//			System.out.println ("x,y = " + x + "," + y);
//		}

		
		// infinite loops, REMEMBER THE RED termination button!!!
//
//		int x = 41;
//		for (;;)
//		{
//			x++;
//			System.out.println (x);
//			if (x == 40)
//				break;
//		}
//		
			

		int x=10;
		while (true)
		{
			x--;
			System.out.println (x);
			if (x == 3)
				break;
		}

		
	}  // main
	
}
