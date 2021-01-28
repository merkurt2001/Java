package a_review.week3;

import java.util.Scanner;

public class ShippingCalculator {

	public static void main(String[] args) {
		
		
		// Create a program to calculate shipping for amazon shopping 
		
		//  ask user if they are prime member or not / expect yes or no answer 
		// if yes -->> shipping is free 
		// if no -->> 
				// ask user what the amount for your shopping as double 
				// if the number is more than 35 --->> free shipping 
		        //	 print your total is same number as user entered
		        // if the number is less than 35 -->> the add 5 dollar shipping 
		 
		//print your total is 5 dollar more than your number 
		
		
		
	     String primeMember ; 
	     double price ; 
	     
	     Scanner scan = new Scanner(System.in); 
	     
	     System.out.println("Are you a Prime member ? Say yes or no ");
	     primeMember = scan.next();  // expecting yes or no , and assuming user will only enter those 2
	     
	     System.out.println("What is the amount for your shopping ? ");
	     price =  scan.nextDouble() ; 
	      
	     
	     if( primeMember.equals("yes")  ) {
	    	 
	    	 System.out.println("HELLO DEAR PRIME MEMBER!! FREE SHIPPING !!!! " + price);
	    	 
	     } else if (  primeMember.equals("no")  ) {
	    	 
	    	  // check if their order is more than 35
	    	  if( price >35) {
	    		  System.out.println("LOTS OF SHOPPING !!! FREE SHIPPING !!!! ");
	    	  }else {
	    		  System.out.println("Including shipping , Your total is " +  (price+5)   );
	    		  System.out.println("Consider signing up for Prime to save shipping fee!!! ");
	    	  }
	    	     	 
	     }else {
	    	 System.out.println("SYSTEM CRASH!! YOU CAN ONLY SAY yes or no!!!!!");
	     }
	     
	     
		 

	}

}
