//Program to demonstrate method overriding - Runtime Polymorphism
package com.tnsif.polymorphism.overriding;

public class OverridingDemo {

	public static void main(String[] args) {
		RBI rbi;

//		Dynamic binding assigning child class object to parent class reference variable.
		rbi = new SBI();
		System.out.println(rbi.getRateOfInterest());
		System.out.println(rbi.getClass());
		System.out.println(rbi.hashCode());

		rbi = new ICICI();
		System.out.println(rbi.getRateOfInterest());
		System.out.println(rbi.getClass());
		System.out.println(rbi.hashCode());
		
		rbi = new HDFC();
		System.out.println(rbi.getRateOfInterest());

	}

}
