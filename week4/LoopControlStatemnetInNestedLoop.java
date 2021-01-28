package a_review.week4;

public class LoopControlStatemnetInNestedLoop {

	
	public static void main(String[] args) {
		
		/*
		 *  1 2 3 4 5 
			1 2 3 4 5 
			1 2 3 4 5 
			1 2 3 4 5 
			1 2 3 4 5 
		 * 
		 * */
		
//		outer: // label for outer loop ,and we called outer
//		for(int row = 1 ; row <=5 ; row++) {
//			
//			for(int col = 1; col <= 5; col++) {
//				System.out.print(col + " ");
//				
//				if(col==3) {
//					break outer; 
//				}
//			}
//			
//			System.out.println();
//				
//		}
	

			outer: // label for outer loop ,and we called outer
			for(int row = 1 ; row <=5 ; row++) {
				
				for(int col = 1; col <= 5; col++) {
					
					// skip to next row if you see col 3
					if(col==3) {
						continue outer; 
					}
					System.out.print(col + " ");
				}
				
				System.out.println();
					
			}

	
	
		
		
		
	}
	
}
