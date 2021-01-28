package assesment_solution.no6_nested_loop;

public class Question5 {

	public static void main(String[] args) {
		/**
		 * Print below pattern using loop
		    
		    1111111     six   1 followed by one 1
			1111122     five  1 followed by two  2
			1111333     four  1 followed by three 3
			1114444     three 1 followed by four 4 
			1155555     two   1 followed by five 5
			1666666     one   1 followed by six 6 
			7777777     zero  1 followed by seven 7
		 * 
		 */
		 
		int totalRows = 7 ; 
		
		for (int row = 1; row <= totalRows; row++) {
			
			for (int i = 1; i <= totalRows-row; i++) {
				System.out.print(1);
			}

			for (int i = 1; i <= row ; i++) {
				System.out.print( row );
			}
			System.out.println();
		}
		

		

		

		 
			
		

		
		
		
		
		 

	}

}
