package com.bank.framework;

public abstract class SavingsAcc extends BankAcc{
	private boolean isSalaried;
	private final static int MINBAL=5000;

	public SavingsAcc(int accNum,String accName,int accBal,boolean isSalaried) {
		super(accNum, accName,accBal);
		this.isSalaried = isSalaried;
	}
	public boolean isSalaried() {
		return isSalaried;
	}
	public static float getMINBAL() {
		return MINBAL;
	}
	@Override
	public String toString() {
		return "SavingsAcc [isSalaried=" + isSalaried + "]";
	}
			
}
