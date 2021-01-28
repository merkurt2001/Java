package a_review.week5;

public class UsingTheReturnKeywordToControlMethodExecution {

	public static void main(String[] args) {
		/**
		 * 
		 * 
		 */
		// voter can vote if they are more than 18 else they can't
		
		// create a void method that accept age as argument 
		// to print you are eligible if age is more than 18
			// not eligible if less that or equal to 18 
		
		printVotingEligibility(19);
		printVotingEligibility(-1);
		printVotingEligibility(200);
		
		
			
	}
	
	// return keyword has 2 usage : 
		// return a value from a non-void method 
		// exit from the method when the line is reached 
	
	// we can not use break keyword to break out of method 
	// break is only for switch and loop 
	// return is only for method 
	
	public static void printVotingEligibility(int age) {
		
		// if the age is less than 0 or more than 100 
		// print INVALID NUMBER ! and exit out of the method
		if(age<0 || age>100) {
			System.out.println("INVALID NUMBER!!!");
			return ; // EXIT FROM THE METHOD!!
		}
		
		
		if(age>18) {
			System.out.println("you are eligible to vote!!!");
		}else {
			System.out.println("you are not eligible to vote!!!");
		}
		
		System.out.println("This is the end of the message!!");
		
	}

}






