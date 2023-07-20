package com.weekly.week2;

import java.util.Scanner;
import java.io.*;

public class Week2_Scanner
{

	public static void main (String[] args)
	{
    	Scanner scanner = new Scanner(System.in);

    	// EXAMPLE 1

//		System.out.println ( "Enter Name");
//		String name = scanner.nextLine ();
//		System.out.println ( "Enter Age");
//		int age = scanner.nextInt();
//		System.out.println ( "Enter Salary");
//		double salaryAmount = scanner.nextDouble();
//		String salary = String.format("$%.2f\n", salaryAmount);
//		
//		System.out.println ("name: " + name);
//		System.out.println ("Age: " + age);
//		System.out.println ("Salary: " + salary);


		// EXAMPLE 2

		double sum = 0, count = 0;

		System.out.println ("Calculate the mean");
		System.out.println("Enter values followed by a return, enter non-number when done");
        while (scanner.hasNextDouble())
        {
            double num = scanner.nextDouble();
            sum += num;
            count++;
            int foo = 4;
        }
  
       double mean = sum / count;
       System.out.println("Mean: " + mean);
       
       
       // close when done
       scanner.close();
      
    	 	
	}
		
}
