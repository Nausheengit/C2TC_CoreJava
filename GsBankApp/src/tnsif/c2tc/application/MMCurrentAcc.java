package tnsif.c2tc.application;

import tnsif.c2tc.framework.CurrentAcc;

public class MMCurrentAcc extends CurrentAcc{

	public MMCurrentAcc(int accno, String accname, float accbal) {
		super(accno, accname, accbal);
	}

	@Override
	public void withdraw(float accbal)
	{
		if(accbal < Creditlimit) 
		
			System.out.println(" not having sufficient balance " );
		
		else 
			System.out.println("the amount  withdraw successfully , AVLBalance is "+ accbal + " the creditlimit is" + Creditlimit );
		
		
	}
}
	

	

