package com.mmbank.application;

import com.bank.framework.CurrentAcc;

public class MMCurrentAcc extends CurrentAcc {

	public MMCurrentAcc(int accNum, String accName, int accBal) {
		super(accNum, accName, accBal);
	}

	@Override
	public void withdraw(float amt) {
		int accBal=(this.getAccBal());
		int newBal=(int) (accBal-amt);
		System.out.println("After withdrawal the accBal is"+newBal);
		this.setAccBal(newBal);
	}

	@Override
	public void deposite(float amt) {
		
	}

}
