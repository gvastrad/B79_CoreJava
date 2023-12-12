package com.tnsif.multithreading;

public class ThreadDemo {
public static void main(String args[]) {
	
	ChildThread thread1=new ChildThread(10,"Thread1");
	ChildThread thread2=new ChildThread(5,"Thread2");
	ChildThread thread3=new ChildThread(8,"Thread3");
	ChildThread thread4=new ChildThread(7,"Thread4");
	
	thread1.start();
	thread2.start();
	thread3.start();
	thread4.start();
	
	try {
	thread1.join();
	thread2.join();
	thread3.join();
	thread4.join();
	}
	catch(InterruptedException ie) {
		System.out.println(ie);
	}
	
	System.out.println("....In main");
}
}
