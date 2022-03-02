package tnsif.c2tc.framework;

public class SavingAcc extends BankAcc
{
	private boolean isSalary=true;
	
	public SavingAcc(int accno, String accname, float accbal) 
	{
		super(accno, accname, accbal);
    }
  //  private static final float minbal=500;
    
	//public float getMinbal() {
		//return minbal;
	//}

	public boolean isSalary() 
	{
		return isSalary;
	}

	public void setSalary(boolean isSalary) 
	{
		this.isSalary = isSalary;
	}
	@Override
	public String toString() 
	{
		return "SavingAcc [isSalary=" + isSalary + ", getAccno()=" + getAccno() + ", getAccname()=" + getAccname()
				+ ", getAccbal()=" + getAccbal() + "]";
	}

	
	
}
