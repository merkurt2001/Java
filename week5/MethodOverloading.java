package a_review.week5;

public class MethodOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Method overloading , reusing the name of the method with different parameter list
		// name + parameter list =  method signature 
		// valid overloading : same name different parameters list (count or data type)
		// ORDER MATTER !!!!!
		// The rule for selection : 
			// It will always look for exact match first 
		    // when it can not find exact match , 
			// 	it will look for higher primitive data type
		
//		addNumbers(100);
		addNumbers(100,200);
		addNumbers(100d,200d);
//		addNumbers(100,200,300);
		
//		byte b = 100 ; 
//		addNumbers(b);
//		addNumbers( (byte)100 );
		/*
		 *  addNumbers(int num) the result is 110
			addNumbers(int num1, int num2) the result is 300
			addNumbers(double num1, double num2) the result is 300.0
			addNumbers(int num1, int num2, int num3) the result is 600
			addNumbers(byte num)  being called with 100
		 * */
		
	}
	
	public static void addNumbers(byte num) {
		System.out.println("addNumbers(byte num)  being called with " + num);
	}
		
	
	// addNumbers that has 1 int parameter : 
		// it will add 10 to the numbers provided and print 
	public static void addNumbers(int num) {
		
		System.out.println("addNumbers(int num) the result is " + (num + 10) );
		
	}
//	// addNumbers that has 2 int parameters: 
//			// it will add these two numbers and print 
	public static void addNumbers(int num1, int num2) {
		
		System.out.println("addNumbers(int num1, int num2) the result is " + (num1 + num2) );
		
	}
	// addNumbers that has 2 i double parameters: 
	// it will add these two numbers and print 
	public static void addNumbers(double num1, double num2) {
		
		System.out.println("addNumbers(double num1, double num2) the result is " + (num1 + num2) );
		
	}
		
	// addNumbers that has 3 parameter : 
			// it will add these three numbers and print 
	public static void addNumbers(int num1, int num2, int num3) {
		
		System.out.println("addNumbers(int num1, int num2, int num3) the result is " + (num1 + num2 + num3) );
		
	}	
		

}
