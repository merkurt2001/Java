package assesment_solution.no5_for_loop;

public class Question9 {

	public static void main(String[] args) {
		/**
		 * Write a program for the following logic:
			Print all the odd numbers in comma-separated form 
			from 1 till the end (you may change it):
			if end = 10, OUTPUT = 1, 3, 5, 7, 9
			if end = 11, OUTPUT = 1, 3, 5, 7, 9, 11
		 */
		 
//		for(int i=1 ; i <=11 ; i += 2) {
//			
//			System.out.print(i);
//			
//			if(i != 11) {
//				System.out.print(",");
//			}
//		}
		int lastNumber = 10 ; 
		
		for (int i = 1; i <= lastNumber; i++) {
			
			if( i % 2 == 1) {
				System.out.print(i);
				
				if(lastNumber % 2==1 && i!=lastNumber) {
					
					System.out.print(",");
					
				}else if( lastNumber % 2==0 && i != lastNumber-1) {
					
					System.out.print(",");
					
				}
				
			}
			
		}
		
		System.out.println();
		// OR 
		for (int i = 1; i <= lastNumber; i += 2) {
			
			System.out.print(i);
			
			if( i!=lastNumber-1 && i!=lastNumber) {
				System.out.print(",");
			}
			
			
		}
		
		
		
		
		
	}

}
