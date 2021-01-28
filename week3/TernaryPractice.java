package a_review.week3;

public class TernaryPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// anything that ternary operator can do, if else statement can do it !!! 
		// THE ONLY TIME YOU CAN USE TERNARY OPERATOR IS : 
			// WHEN YOU WANT TO ASSIGN VARIABLE VALUE ACCORDING TO CERTAIN CONDITION!!!
		
//		String amORpm =  "" ; 
		int hour = 11 ; 
		
//		if(hour>12) {
//			amORpm = "PM" ; 
//		}else {
//			amORpm = "AM" ; 
//		}
		
		// systax for ternary operator
		// DataType variableName = (condition here ) ? IfTrueAssignThis : IfFalseAssignThis ;  
		     //String	  amORpm     = 	(hour>12)        ? "PM"	            : "AM" ; 
		     
		     // ADDING LESS THAN 24 FOR CONDITION
		String amORpm = 	(hour>12 && hour<24)  ? "PM" : "AM" ; 
	    
		System.out.println("IT IS " + amORpm);
		
		
		int num1 = 100 ; 
		int num2 = 20 ; 
		// if the num1 is more than num2 assign bigger number to num1 
		// else assign bigger number to num2
		int biggerNumber = 0 ;
		
//		if(num1 > num2 ) {
//			
//			biggerNumber = num1 ; 
//			
//		}else {
//			
//			biggerNumber = num2 ; 
//			
//		}
		
		biggerNumber = (num1 > num2 ) ? num1  : num2 ; 
		
		System.out.println("BIGGER NUMBER IS " + biggerNumber);
		
		
		

	}

}
