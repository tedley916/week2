package com.weekly.week2;

public class Week2_Order_of_Operations {

	public static void main(String[] args) {
		
		// Order or operations
		// */&
		// +-
		// L->R
		
		System.out.print("1. ");
		System.out.println(2 + 3 + 4);
		
		System.out.print("2. ");
		System.out.println(3 - 2 -1);
		
		System.out.print("3. ");
		System.out.println(1 - 2 - 3);
		
		System.out.print("4. ");
		System.out.println (2 * 3 * 4);
		
		System.out.print("5. ");
		System.out.println(2 * 3 + 4);
		
		System.out.print("6. ");
		System.out.println(2 + 3 * 4);
		
		System.out.print("7. ");
		System.out.println (2 * 3 + 4 * 4  / 2 + 6 - 5);
		 // L-R                 6   10  40   20  26  21
		//                 (2*3) + (4*4/2) + (6-5)
		//                   6   +   8     + 1  = 15
		
		System.out.println("Use parentheses");
		System.out.println(2 + 3 * 10 / 2);
		System.out.println( (2 + 3) * ( 10 / 2));
		
	}

}
