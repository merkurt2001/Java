package a_review.week3;

import java.util.Scanner;

public class SwitchWithString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		String equality
		
//		String str1 = "Adam" ; 
//		String str2 = "Adam" ; 
//		
//		// checking the content of str1 and str2 equals or not 
//		// we use equals method 
//		boolean isSame =  str1.equals(str2) ; 
//		
//		System.out.println( isSame );
		
		 Scanner blabla = new Scanner(System.in) ; 
		 System.out.println("What is the season ? ");
		 
		 String season = blabla.next();    //"Summer" ;
		
		 switch(season) {
		 	
		 	case "Spring" : 
		 		System.out.println("picnic!!");
		 		break; 
		 		
		 	case "Summer" : 
		 		System.out.println("Swimming!!");
		 		break; 
		 	
		 	// if you want to take same action for both cases , this is how you can do it
		 	case "Fall" :   
//		 		System.out.println("Hiking!!");
//		 		break; 
		 	case "Autumn" : 
		 		System.out.println("Hiking!!");
		 		break; 
		 		
		 	case "Winter" : 
		 		System.out.println("Snowboarding!!");
		 		break; 
		 		
		 	default : 
		 		System.out.println("KEEP CODING!!!!");

		 }
		
		
		
		
		/*
		 * String season = "Summer" ;
		 * 
		 * if( season.equals("Spring") ) {
		 * 
		 * System.out.println("picnic!!");
		 * 
		 * } else if ( season.equals("Summer") ) {
		 * 
		 * System.out.println("Swimming!!");
		 * 
		 * } else if ( season.equals("Fall") ) {
		 * 
		 * System.out.println("HIKING");
		 * 
		 * } else if ( season.equals("Winter") ) {
		 * 
		 * System.out.println("Skiing ");
		 * 
		 * } else {
		 * 
		 * System.out.println("INVALID SEASON!!!!");
		 * 
		 * }
		 */
		
		

	}

}
