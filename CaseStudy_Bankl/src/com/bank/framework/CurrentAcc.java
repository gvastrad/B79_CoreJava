package com.bank.framework;

public abstract class CurrentAcc extends BankAcc {
private final int creditLimit=200000;

public int getCreditLimit() {
	return creditLimit;
}


public CurrentAcc(int accNum,String accName,int accBal) {
	super( accNum, accName,accBal);
}


}
