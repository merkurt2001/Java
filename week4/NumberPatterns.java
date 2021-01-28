package a_review.week4;

public class NumberPatterns {

	public static void main(String[] args) {
		
	 /*
	    4 3 2 1 
		3 2 1 
		2 1 
		1 
	 */
		
//		for(int row = 4 ; row >= 1 ; row--) {
//		
//			for(int col = row ; col>= 1 ; col-- ) {	
//				System.out.print(col + " ");
//			}
//			System.out.println();
//			
//		}
	/*
	    4 3 2 1 
		 3 2 1 
		  2 1 
		   1 
	 */
		/**
		 * 
		 * #
		 * ##
		 * ###
		 */
//		for (int i = 1; i < 4; i++) {
//			System.out.print("#");
//		}
//		
//		System.out.println();
		
		
		for(int row = 4 ; row >= 1 ; row--) {
			
			// add 0 space in 1st iteration  4-4
			// add 1 space in 2nd iteration  4-3
			// add 2 space in 3rd iteration  4-2
			// add 3 space in 4th iteration  4-1
			
			// This is for generating space needed in front
			for (int i = 1; i <= 4-row; i++) {
				System.out.print(" ");
			}
			
			
			// this is for counting down in single row
			for(int col = row ; col>= 1 ; col-- ) {	
				System.out.print(col + " ");
			}
			System.out.println();
			
		}
		
		
		

	}

}
