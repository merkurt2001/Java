package a_review.week2;

public class Grader {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Welcome to the Grading system");
		
//		int score = 50 ; 
		
		// if the score is more than 70 print pass 
		
//		if( score >= 70 ) {
//			System.out.println("PASS");
//		}
		
//		if( score >= 70 ) {
//			System.out.println("PASS");
//		}else {
//			System.out.println("FAIL!!!!");
//		}
		

		
		
		// TELL ME A NUMBER THAT THAN 90  OR LESS THAN 100 
		// 95 , 98 , 1000000000 , -7888888  ALL OF THEM ARE TRUE 
		
		
		// CORRECT WAY OF CHECKING THE RANGE IS 
		// NUMBER MORE THAN SMALLER NUMBER AND (&&) LESS THAN BIGGER NUMBER
		

		// if the score is more than 100 or less than 0 -- invalid !!!
		// if the score 
			// 90--100 -- A 
			// 80--89  -- B 
			// 70--79  -- C
			// anything below , F 
		
		int score = 56 ; 
		
		if( score>100 || score < 0 ) {
		
			System.out.println("INVALID NUMBER!!!!");
		
		}else if( score>=90 ) {         //      && score<=100 ) { // BY THE TIME YOU COME HERE , IT MEANS THE NUMBER IS BETWEEN 0-100
			
			System.out.println("A");
			
		}else if ( score>=80 ) {       //     && score<90 ) { // BY THE TIME YOU COME HERE , IT MEANS THE NUMBER <90 
			
			System.out.println("B");
			
		}else if ( score>=70  ) {     //       && score<80 ) { // // BY THE TIME YOU COME HERE , IT MEANS THE NUMBER <80 
			
			System.out.println("C");
			
		}else {   /// BY THE TIME YOU COME HERE -->> it means the score is less than 70
			System.out.println("F") ;
			
			// if the score is is between 65 and 70 , we want to print encouraging word 
			// like almost got it try again harder next time~
			// this is a if statement inside another if statement -- nested if statement 
			if( score>=65  ) {
				System.out.println("almost got it try again harder next time~");
			}
			
			
		}
		
		// Each condition is build on top of each other 
		// there can be only one execution path run in a if statement 
		// so first condition is not true , it will check the next condition and next and next all the way till last 
		// so we can reuse the false condition from previous if( ...) to reduce duplicates 


				
		
		System.out.println("Thanks come back again soon!");
		
		

	}

}
