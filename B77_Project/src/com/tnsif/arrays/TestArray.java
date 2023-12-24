package com.tnsif.arrays;

import java.util.Scanner;

public class TestArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the array size ");
		int n=sc.nextInt();
		int[] x=new int[n];
		
		System.out.println("Enter the array elements ");
		for(int i=0;i<n;i++)
		{
		x[i]=sc.nextInt();
		}
		//x[1]=20;
		//x[2]=30;
		//x[3]=40;
		//x[4]=50;
		//[5]=60;
		System.out.println("The array elements are ");
		for(int i=0;i<x.length;i++)
			System.out.println(x[i]);

	}
}
