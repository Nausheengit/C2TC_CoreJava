package tnsif.c2tc;

import tnsif.c2tc.application.MMBankFactory;
import tnsif.c2tc.application.MMCurrentAcc;
import tnsif.c2tc.application.MMSavingAcc;
import tnsif.c2tc.framework.BankFactory;
import tnsif.c2tc.framework.CurrentAcc;
import tnsif.c2tc.framework.SavingAcc;

public class Customer {

	public static void main(String[] args) 
	{
		BankFactory bf=new MMBankFactory();
		SavingAcc sa=new MMSavingAcc(45321, "Nausheen" , 2000); 
		sa.withdraw(1000);
        CurrentAcc ca= new MMCurrentAcc(56472, "Afsa", 800);
        ca.withdraw(600);
	}

}
