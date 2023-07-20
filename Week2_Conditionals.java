package com.weekly.week2;

import java.util.*;
import java.io.*;

public class Week2_Conditionals
{

	public static void main (String[] args)
	{

//		int one = 1;
//		int ten = 10;
//	
//		System.out.println ("before the if");
//		if ( ten < one) {
//			System.out.println ("10 is grreater than one");
//		}
//		System.out.println ("after the if");
//
		String dinner = "pizza";
//
//		if ( !dinner.equals("pizza"))
//			System.out.println ("YUM!! Pass me a slice!!");
//		else
//			System.out.println ("Leftovers again!?!?");
		

	
//		boolean a = true;
//		boolean b = false;
//		
//		if (!a)
//			if (b) {
//				System.out.println("a=true, b=true");
//			}
//		System.out.println ("22");

				
//		
//		String restaurant = "hamburger";
//		if ( dinner.equals("pizza")) 
//		{
//			if (restaurant.equals("Round Table")) {
//				System.out.println ("Let's order a Maui Zaui!");
//			} else {
//				System.out.println ("A large combination works for me!");
//			}
//		} else {
//			System.out.println ("I want extra cheese on my burger!");
//		}
	
//	
		final String Sunday = "Sunday";
		final String Monday = "Monday";
		final String Tuesday = "Tuesday";
		final String Wednesday = "Wednesday";
		final String Thursday = "Thursday";
		final String Friday = "Friday";
		final String Saturday = "Saturday";
		final String Weekday = "Weekday";
		
		String weekday = Friday;
	
		String month = "June";
		
		switch (weekday) {
			case Sunday: 
				System.out.println ("A day of rest");
				break;
			case Monday:
				System.out.println ("Buck up for another week!");		
				break;
			case Tuesday:
				System.out.println ("Geez, one down, four to go...");	
				break;
			case Wednesday:
				System.out.println ("Hump Day, I can do this!");	
				break;
			case Thursday:
				System.out.println ("YAY!!  It's little Friday!");	
				break;
			case Friday:
			{
				System.out.println ("I'm outta here!!!");		
				if (month.equals("June")) {
					System.out.println ("Weekend Warrior!!!");
				}
				//break;
			}
			case Saturday:
				System.out.println ("Heading for the beach!");	
				// break;
			default:
				System.out.println ("What Day is it?");		
		}
	

	}
	
}
