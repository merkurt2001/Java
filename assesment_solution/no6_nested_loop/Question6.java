package assesment_solution.no6_nested_loop;

public class Question6 {

	public static void main(String[] args) {
		/**
		 * Print below pattern using loop
		    
			1
			2 6
			3 7 10
			4 8 11 13
			5 9 12 14 15
		 * 
		 */
		int rowCount = 5 ; 
//		int temp = 3; 
//		for (int i = 1; i <= 3; i++) {
//			System.out.print(temp + " ");
//			temp = temp+  (rowCount -i) ; 
//		}
		
		
		for (int row = 1 ; row <= rowCount; row++) {
			
			int value = row; 
			for (int col = 1; col <= row; col++) {
				System.out.print(value+ " ");
				value += rowCount-col;
				
			}
			System.out.println();
		}
		
		 

		

		

		

		 
			
		

		
		
		
		
		 

	}

}
