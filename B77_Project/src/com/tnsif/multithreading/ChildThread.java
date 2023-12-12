package com.tnsif.multithreading;

public class ChildThread extends Thread {
	private String msg;
	private int n;
	
	 public ChildThread(int n, String msg) {
	        this.n = n;
	        this.msg = msg;
	    }
	@Override
	public void run() {
		
		for(int i=1;i<=n;i++) {
			try {
				  Thread.sleep(3000);
				}
				catch(InterruptedException ie) {
					System.out.println(ie);
				}
			System.out.println(msg +" "+ i + " " );
		}	
	}
	

}
