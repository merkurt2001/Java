package a_review.week1;

public class VariablePractice {

	public static void main(String[] args) {
		// use lowercase for package name 
		// use first letter uppercase for your classname 
			// if you have more than one word in your classname 
			// make the next word first letter uppercase 
			// just like in this class VariablePractice
		
		
		// declaring variable -- creating variable 
		// DataType variable name ; 
		
		// easy way to remember 8 primitive type by below sentence 
		// Be careful , Bear Shouldn't ingest large fluffy dog. 
		// boolean , char , byte , short  , int , long , float , double 
		
		byte score ;  // declaring variable  , creating a variable
			 score = 100 ;  // initializing variable , assigning a value , giving first value 
			 score = 101 ;  // re-assigning a value , changing the existing value 
			 
		short s1 = 4000; // declaring and initializing the value in one line   
		int num  = 100000000; 
		int num2 = 100_000_000;  // underscore can be used to make it more readable
		
		long count = 99_999_999_999L;  // L or l to indicate this is a long value
		// if you have any fractional number by itself 
		// like 3.14 -->> compiler automatically assume it's a double data type 
		// and we can not put double value into float variable directly 
		
		float radius  = 1.14f ; // put F or f to indicate this is a float variable 
		double pi = 3.143265426745236745236754d ; // add d or D to make it obvious that this is a double
		
		boolean lightOn  = true ; // it can only be true or false  
		char letter = 'A' ; // it must be within single quote and single character
		char letterWithNumber =  65 ; 
		
		System.out.println( score);
		System.out.println( s1);
		System.out.println(num);
		System.out.println(num2);
		System.out.println(count);
		System.out.println(radius);
		System.out.println(pi);
		System.out.println(lightOn);
		System.out.println(letter);
		System.out.println(letterWithNumber);

		
		
		
		
		
		

	}

}
