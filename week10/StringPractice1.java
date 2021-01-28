package a_review.week10;

import java.util.Scanner;

public class StringPractice1 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);  
		System.out.println("Enter your first name?");
	    String f = scan.next(); // joHN
	    
	    scan.nextLine(); // Enter
	    
	    System.out.println("Enter your last?");
	    String l = scan.nextLine();
	    scan.close();
	    
	    f = f.substring(0,1).toUpperCase() + f.substring(1).toLowerCase();
	    l = l.substring(0,1).toUpperCase() + l.substring(1).toLowerCase();
	    
	    System.out.println("First Name: "+f);
	    System.out.println("Last Name: "+l);
	    
	    String fullName = f +" "+l;
	    
	    System.out.println("Full Name: "+fullName);
	    
	   
	    
		
	}

}
/*
	ask user to enter first & last names
	format the first & last names
	
		joHN
		aArOn
		
		John Aaron
*/