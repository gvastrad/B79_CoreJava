package com.tnsif.exceptionhandling;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		try {
	   Scanner sc=new Scanner(System.in);
	   int a,b,c;
	   System.out.println("Enter the value of a");
	   a=sc.nextInt();
	   System.out.println("Enter the value of b");
	   b=sc.nextInt();
	   System.out.println("Hello");
	 
	   c=a/b;
	   System.out.println("Remainder is: "+ c);
	   c=a+b;
	   System.out.println("Sum is c: "+ c);
		}
		catch(ArithmeticException ae)
		{
			System.out.println(ae);
		}
	}
}
