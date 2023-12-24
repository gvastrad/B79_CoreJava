package com.mmbank.application;

import com.bank.framework.SavingsAcc;

public class MMSavingsAcc extends SavingsAcc {

	public MMSavingsAcc(int accNum, String accName, int accBal, boolean isSalaried) {
		super(accNum, accName, accBal, isSalaried);
	}

	@Override
	public void withdraw(float amt) {
		int accBal=(this.getAccBal());
		if((accBal-amt)>this.getMINBAL())
		{
		int newBal=(int) (accBal-amt);
		
		System.out.println("After withdrawal the accBal is"+newBal);
		this.setAccBal(newBal);
		}
		else
			System.out.println("Insufficient Bal");
	}

	@Override
	public void deposite(float amt) {
	}

}
