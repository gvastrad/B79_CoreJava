package com.mmbank.client;

import com.mmbank.application.MMBankFactory;
import com.mmbank.application.MMCurrentAcc;
import com.mmbank.application.MMSavingsAcc;

public class Client {

	public static void main(String[] args) {
		MMBankFactory mmf=new MMBankFactory();
        MMCurrentAcc obj=mmf.getNewCurrentAccount(1, "Gayatri", 10000);
        obj.withdraw(2000);
        System.out.println(obj.getAccBal());
        
        
        MMSavingsAcc obj1=mmf.getNewSavingAccount(obj.getAccNum(),obj.getAccName(),obj.getAccBal(), true);
        obj1.withdraw(4000);
	}

}
