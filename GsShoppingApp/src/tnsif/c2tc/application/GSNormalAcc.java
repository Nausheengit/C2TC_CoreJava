package tnsif.c2tc.application;

import tnsif.c2tc.framework.NormalAcc;

public class GSNormalAcc extends NormalAcc
{

	public GSNormalAcc(int accno, String accname, float charges) {
		super(accno, accname, charges);
		
	}

	@Override
	public void BookProducts(float charges) {
		System.out.println("The product you have purchased is of charges " +charges + "  including the deliveritycharges  "+ deliverycharges );
	}
}
