package com.tnsif.exceptionhandling;

import java.util.Scanner;

public class UsingThrowDemo {

	public static void main(String[] args) {
	   Scanner sc= new Scanner(System.in);
       System.out.println("Enter the Voter info:  Age and name");
       int age=sc.nextInt();
       String name=sc.next();
       
       VoterInfo voter1=new VoterInfo();
       voter1.setName(name);
       voter1.setAge(age);
       
       System.out.println(voter1);
	}

}
