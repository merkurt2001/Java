package assesment_solution.no5_for_loop;

public class Question11 {

	public static void main(String[] args) {
		/**
		 * Question-11:
		 * 
		 * Print the following output using nested for loops.
		 * 
		 * 4 3 2 1
		 *  3 2 1
		 *   2 1
		 *    1
		 * 
		 */
		 
		for (int start = 4; start >= 1; start--) {
			
			 for(int space = 0 ; space < 4-start ; space++) {
				 System.out.print(" ");
			 }
		
			 for (int i = start; i >= 1; i--) {
				 System.out.print(i + " ");
			 }
			 System.out.println();
		 
		} 
		
		
		
		
		
		
		
	}

}
