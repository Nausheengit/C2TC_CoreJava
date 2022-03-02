package tnsif.c2tc.application;

import tnsif.c2tc.framework.PrimeAcc;

public class GSPrimeAcc extends PrimeAcc
{

	public GSPrimeAcc(int accno, String accname, float charges) {
		super(accno, accname, charges);
		
	}

	@Override
	public void BookProducts(float charges)
	{
		System.out.println("The product you have purchased is of charges : "+charges);
	}

	@Override
	public String toString() {
		return "GSPrimeAcc [isIsprime()=" + isIsprime() + ", toString()=" + super.toString() + ", getAccno()="
				+ getAccno() + ", getAccname()=" + getAccname() + ", getCharges()=" + getCharges() + "]";
	}
	
}
