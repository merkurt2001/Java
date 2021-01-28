package assesment_solution.no5_for_loop;

public class Question3 {

	public static void main(String[] args) {
		
		/*
		 * Question-3:

			Write a program that displays 
			the number of even numbers between 5 and 50 (included)

		 */
		int countOfEven = 0 ; 
		
		for( int i = 5 ; i<=50 ; i++) {
			
			if( i % 2 ==0) {
				//System.out.print(i + " ");
				++ countOfEven ; 
				
			}
			
		}
		System.out.println("Count of even numbers between 5 to 50 is " + countOfEven);
		
		
	}

}
