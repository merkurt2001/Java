package a_review.week4;

public class NestedLoop {

	public static void main(String[] args) {
		
		
		 //  count from 1 to 5 
         // and repeat above action 5 times 
		 
//		for(int x = 1 ; x <=5 ; x++) {
//			
//			// put some action in here so we can repeat 5 times for you 
//			for (int i = 1; i <= 5; i++) {
//				System.out.print(i + " ");
//			}
//			System.out.println();
//			
//		}
		
		/*
		 *  1 2 3 4 5 
			1 2 3 4 5 
			1 2 3 4 5 
			1 2 3 4 5 
			1 2 3 4 5 
		 * 
		 * */
//		
//		for(int row = 1 ; row <=5 ; row++) {
//			
//			for(int col = 1; col <= 5; col++) {
//				System.out.print(col + " ");
//			}
//			
//			System.out.println();
//				
//		}
		
		/**
		 *  1 
			1 2 
			1 2 3 
			1 2 3 4 
			1 2 3 4 5 
		 * 
		 */
		
		for (int row = 1; row <= 5; row++) {
			
			for(int col = 1; col <= row; col++) {
				System.out.print(col + " ");
			}
			System.out.println();
			
		}
		

		
		
//		for(int col = 1; col <= 1; col++) {
//			System.out.print(col + " ");
//		}
//		System.out.println();
//		
//		for(int col = 1; col <= 2; col++) {
//			System.out.print(col + " ");
//		}
//		System.out.println();
//		
//		for(int col = 1; col <= 3; col++) {
//			System.out.print(col + " ");
//		}
//		System.out.println();
//		
//		for(int col = 1; col <= 4; col++) {
//			System.out.print(col + " ");
//		}
//		System.out.println();
//		
//		
//		for(int col = 1; col <= 5; col++) {
//			System.out.print(col + " ");
//		}
//		System.out.println();
		
		
		

		
		

	}

}
