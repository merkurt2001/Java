package assesment_solution.no6_nested_loop;

public class Question3 {

	public static void main(String[] args) {
		/**
		 * Question-3

		Write a Java program to print the following pattern
		
		1 2 3 4 5 6 7
		 2 3 4 5 6 7
		  3 4 5 6 7
		   4 5 6 7
		    5 6 7
		     6 7
		      7
		 * 
		 */
		
		for (int row = 1; row <= 7; row++) {
		
//			
			for (int i = 1; i < row ; i++) {
				System.out.print(" ");
			}
			
			
			for (int col = row; col <= 7; col++) {
				System.out.print(col + " ");
			}
			System.out.println();
		
			
		}
		
		
		
		/*	      7
			     6 7
			    5 6 7
			   4 5 6 7
			  3 4 5 6 7
			 2 3 4 5 6 7
			1 2 3 4 5 6 7
		 * */
		
		for (int i = 6; i >= 1; i--) {
			
			for (int j = 1; j < i; j++) {
				System.out.print(" ");
			}
			

			for (int col = i; col <= 7; col++) {
				System.out.print(col + " ");
			}
			System.out.println();
		}
	
		
		
		
	}

}
