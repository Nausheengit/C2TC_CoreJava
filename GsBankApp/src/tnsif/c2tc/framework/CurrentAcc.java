package tnsif.c2tc.framework;

public class CurrentAcc extends BankAcc
{
	protected  final float Creditlimit=1000;
	
    public CurrentAcc(int accno, String accname, float accbal) 
    {
		super(accno, accname, accbal);
	}
}
