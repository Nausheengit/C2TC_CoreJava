package tnsif.c2tc;

import tnsif.c2tc.application.GSNormalAcc;
import tnsif.c2tc.application.GSPrimeAcc;
import tnsif.c2tc.application.GSShopFactory;
import tnsif.c2tc.framework.NormalAcc;
import tnsif.c2tc.framework.PrimeAcc;
import tnsif.c2tc.framework.ShopFactory;

public class Customer {

	public static void main(String[] args) {
		ShopFactory sf=new GSShopFactory();
		PrimeAcc pa= new GSPrimeAcc(23451,"Nausheen",2000);		
        pa.BookProducts(600);
        NormalAcc na= new GSNormalAcc(25428,"Aashna",1000);		
        na.BookProducts(600);
	}

}
