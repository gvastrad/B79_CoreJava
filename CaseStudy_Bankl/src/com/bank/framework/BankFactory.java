package com.bank.framework;

public interface BankFactory {
	public SavingsAcc getNewSavingAccount(int accNo, String accNm, int accBal, boolean isSalaried);
	public CurrentAcc getNewCurrentAccount(int accNo, String accNm, int accBal);
}
