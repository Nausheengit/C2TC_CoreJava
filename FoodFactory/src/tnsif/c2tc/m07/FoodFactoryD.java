package tnsif.c2tc.m07;
import java.util.Scanner;
import java.util.*;
import java.security.*;

	interface Food 
	 {
		public String getType();
	 }
	
	class Pizza implements Food 
	 {
		public String getType() 
	      {
				return "Someone ordered a Fast Food!";
	      }
     }

     class Cake implements Food
     {
    	 public String getType() 
	       {
    		 return "Someone ordered a Dessert!";
	       }
}

class FoodFactory
{
	public Food getFood(String order) 
	{
        if(order == null )
        return null;
        	else if(order.equalsIgnoreCase("cake"))
        		return new Cake();
        	else if(order.equalsIgnoreCase("pizza"))
        		return new Pizza();
        else
        	return null;
	}
}

public class FoodFactoryD 
{
	public static void main(String[] args) 
	 {
		Scanner sc=new Scanner(System.in);
		FoodFactory ff= new FoodFactory();
		Food f=ff.getFood(sc.nextLine());
		System.out.println("The factory returned"+ f.getClass());
		System.out.println(f.getType());

	 }
}


