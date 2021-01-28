package a_review.week4;

public class FizzBuzzTest {

	public static void main(String[] args) {
		/**
		 * from 1- 100 
		 * 
		 * if the number can be divisible by 3 , print Fizz
		 * if the number can be divisible by 5 , print Buzz
		 * if the number can be divisible by both 3 and 5 , print FizzBuzz
		 * 
		 */
		 
		 for (int i = 1; i <= 100; i++) {
		
			 if( i%3==0  && i%5==0    ) {  // i%15
				 
				 System.out.println( i + " FizzBuzz!!!");
				 
			 }else if( i%3==0) {
				 
				 System.out.println( i + " Fizz!!!");
			
		 	 }else if(i%5==0) {
		 		 
		 		System.out.println( i + " Buzz!!!");
				 
		 	 }
			 
		 }
		
		
		

	}

}
