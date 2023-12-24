package com.bank.framework;

public abstract class BankAcc {
	private int accNum;
	private String accName;
	private int accBal;
	
	
	public BankAcc(int accNum, String accName, int accBal) {
		this.accNum = accNum;
		this.accName = accName;
		this.accBal = accBal;
	}
	public int getAccNum() {
		return accNum;
	}
	public String getAccName() {
		return accName;
	}
	public void setAccName(String accName) {
		this.accName = accName;
	}
	public int getAccBal() {
		return accBal;
	}	
	public void setAccBal(int accBal) {
		this.accBal = accBal;
	}
	
	@Override
	public String toString() {
		return super.toString();
	}
	public abstract  void withdraw(float amt);
	public abstract void deposite(float amt);
		
}
