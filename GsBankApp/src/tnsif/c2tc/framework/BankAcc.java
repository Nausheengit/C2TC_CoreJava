package tnsif.c2tc.framework;

public class BankAcc {
	private int accno;
	private String accname;
	private float accbal;
	
	
	public BankAcc(int accno, String accname, float accbal) {
		super();
		this.accno = accno;
		this.accname = accname;
		this.accbal = accbal;
	}
	public int getAccno() {
		return accno;
	}
	public void setAccno(int accno) {
		this.accno = accno;
	}
	public String getAccname() {
		return accname;
	}
	public void setAccname(String accname) {
		this.accname = accname;
	}
	public float getAccbal() {
		return accbal;
	}
	public void setAccbal(float accbal) {
		this.accbal = accbal;
	}
    public void withdraw(float accbal) 
    {
    	//System.out.println("The amount to withdraw :-"+accbal);
    }
    public void deposit(float accbal)
    {
    	//System.out.println("The deposit amount :- "+accbal);
    }
	@Override
	public String toString() {
		return "BankAcc [accno=" + accno + ", accname=" + accname + ", accbal=" + accbal + "]";
	}
	
    
}
