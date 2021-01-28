package a_review.week5;

public class MethodWithReturnType2 {

	public static void main(String[] args) {
		
		
		//1+2+3+....10
		
		int result = getTheSumOfNumnberFrom1to100() ; 
		System.out.println( result);
		
		
		System.out.println(   getTheSumOfNumnberFrom1to100()     );
		
		
		int result1 =  getTheSumOfNumnberFrom1toN (100) ;
		int result2 =  getTheSumOfNumnberFrom1toN (10) ;
		int result3 =  getTheSumOfNumnberFrom1toN (55) ;
						
		System.out.println("sum from 1 to 100 " + result1 );
		System.out.println("sum from 1 to 10 " + result2 );
		System.out.println("sum from 1 to 55 " + result3 );
		
		int result4 =  getTheSumOfNumnberFrom1toN (-1) ;
		System.out.println("sum from 1 to -1 " + result4 );
		
		
		

	}
	
	// create a method that get the sum of numbers from 1 to any number 
	// accept no parameter and return the sum 
	
	public static int getTheSumOfNumnberFrom1toN( int endingNumber ) {
		
		int sum = 0 ; 
		
		for (int i = 1; i <= endingNumber; i++) {
			
			sum = sum + i ;  //  sum += i ;
			
		}
		return sum ; 
		
		
	}
	
	
	
	// create a method that get the sum of numbers from 1 to 100 
	// accept no parameter and return the sum 
	
	public static int getTheSumOfNumnberFrom1to100() {
		
		int sum = 0 ; 
		
		for (int i = 1; i <= 100; i++) {
			
			sum = sum + i ;  //  sum += i ;
			
		}
		return sum ; 
		
	}
	
	

}
