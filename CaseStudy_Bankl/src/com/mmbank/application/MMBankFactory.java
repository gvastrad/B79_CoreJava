package com.mmbank.application;

import com.bank.framework.BankFactory;
import com.bank.framework.CurrentAcc;
import com.bank.framework.SavingsAcc;

public class MMBankFactory implements BankFactory{

	@Override
	public MMSavingsAcc getNewSavingAccount(int accNo, String accNm, int accBal, boolean isSalaried) {
		return new MMSavingsAcc(accNo,accNm,accBal,isSalaried);
	}

	@Override
	public MMCurrentAcc getNewCurrentAccount(int accNo, String accNm, int accBal) {
		return new MMCurrentAcc(accNo,accNm,accBal);
	}

}
