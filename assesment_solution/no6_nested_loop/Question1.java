package assesment_solution.no6_nested_loop;

public class Question1 {

	public static void main(String[] args) {
		/**
		 * 
		 * Question-1

		Write a Java program to print the following pattern
		
		1
		1 2
		1 2 3
		1 2 3 4
		1 2 3 4 5
		1 2 3 4 5 6
		1 2 3 4 5 6 7
		1 2 3 4 5 6
		1 2 3 4 5
		1 2 3 4
		1 2 3
		1 2
		1
		
		 
		 */
		for (int row = 1; row <= 7; row++) {
			
			for (int col = 1; col <= row; col++) {
				System.out.print(col+ " ");
			}
			System.out.println();
			
		}
		
		for (int row=6 ; row>=1 ; row--) {
			
			for (int col = 1; col <= row ; col++) {
				System.out.print(col+ " ");
			}
			System.out.println();
			
		}
		

		
		
		
		
		
		
	}

}
