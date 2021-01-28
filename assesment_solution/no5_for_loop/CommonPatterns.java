package assesment_solution.no5_for_loop;

public class CommonPatterns {

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

		for (int i = 4; i >= 1; i--) {
			
			for (int j = 1; j <= 4-i; j++) {
				System.out.print(" ");
			}
			
			for (int j = i; j >= 1; j--) {
				System.out.print(j+ " ");
			}
			System.out.println();

		}
		
		// AND BEYOND
		
		/*
		    4 3 2 1 
			3 2 1 
			2 1 
			1 
		 */
		
		System.out.println("--------");
		for(int i = 4; i >= 1; i--) {

			for (int j = i; j >= 1; j--) {
				System.out.print(j + " ");			
			}
			System.out.println();

		}
		/*
		    4 3 2 1 
			  3 2 1 
			    2 1 
			      1 
			
			// add 0 space in 1st iteration  (4-4) * 2 
			// add 2 space in 2nd iteration  (4-3) * 2 
			// add 4 space in 3rd iteration  (4-2) * 2
			// add 6 space in 4th iteration  (4-1) * 2
			 * 
			 * 
		 */
		System.out.println("--------");
		for (int i = 4; i >= 1; i--) {

			for(int j=1 ; j<= (4-i)*2 ;j++) {
				System.out.print(" ");
			}
			
			
			for (int j = i; j >= 1; j--) {
				System.out.print(j+ " ");
			}
			System.out.println();

		}
		
		System.out.println("--------");
		/*
		    1 
			1 2 
			1 2 3 
			1 2 3 4 
		 * */
		
		for (int i = 1; i <= 4; i++) {
		
			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
		
		System.out.println("----------");
		/*
		 *     
		       1 
			  1 2 
			 1 2 3 
			1 2 3 4 
		 * */
		for (int i = 1; i <= 4; i++) {
			
			for (int j = 4-i; j >= 1; j--) {
				System.out.print(" ");
			}
			
			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
		
		System.out.println("----------");
		/*
		  	  1 
		    1 2 
		  1 2 3 
		1 2 3 4 

		 * */
		for (int i = 1; i <= 4; i++) {
			
			for (int j = 1; j <= (4-i)*2 ; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print(j+ " ");
			}
			System.out.println();
		}
		
		System.out.println("----------");
		/*
		  		1
		  		2 2
		  		3 3 3
		  		4 4 4 4
		  		5 5 5 5 5
		 */
		
		for (int max = 1; max <=5; max++) {

			for (int i = 1; i <= max; i++) {
				System.out.print(max + " " );				
			}
			System.out.println();
		}
		
		System.out.println("----------");
		/*
		  		    1
		  		   2 2
		  		  3 3 3
		  		 4 4 4 4
		  		5 5 5 5 5
		 */
		
		for (int max = 1; max <=5; max++) {
			
			for (int i = 5-max; i >=0 ; i--) {
				System.out.print(" ");
			}
			for (int i = 1; i <= max; i++) {
				System.out.print(max + " " );				
			}
			System.out.println();
		}
		System.out.println("----------");
		/*
		             1 
			       2 2 
			     3 3 3 
			   4 4 4 4 
			 5 5 5 5 5 
		  
		 */
		
		for (int max = 1; max <=5; max++) {
			
			for (int i = (5-max)*2; i >=0 ; i--) {
				System.out.print(" ");
			}
			for (int i = 1; i <= max; i++) {
				System.out.print(max + " " );				
			}
			System.out.println();
		}

		System.out.println("----------");
		/*
			5 5 5 5 5 
			4 4 4 4 
			3 3 3 
			2 2 
			1 		  
		 */
		
		for (int max = 5; max >=1; max--) {

			for (int i = 1; i <= max; i++) {
				System.out.print(max + " " );				
			}
			System.out.println();
		}
		
		System.out.println("----------");
		/*
			5 5 5 5 5 
			 4 4 4 4 
			  3 3 3 
			   2 2 
			    1 		  
		 */
		
		for (int max = 5; max >=1; max--) {

			for (int row = 1; row <= 5-max; row++) {
				System.out.print(" ");				
			}
			
			for (int i = 1; i <= max; i++) {
				System.out.print(max + " " );				
			}
			System.out.println();
		}
		
		System.out.println("----------");
		/*
			5 5 5 5 5 
			  4 4 4 4 
			    3 3 3 
			      2 2 
			        1 		  
		 */
		
		for (int max = 5; max >=1; max--) {

			for (int row = 1; row <= (5-max)*2; row++) {
				System.out.print(" ");				
			}
			
			for (int i = 1; i <= max; i++) {
				System.out.print(max + " " );				
			}
			System.out.println();
		}
		
		System.out.println("----------");
		/*
		A 
		A B 
		A B C 
		A B C D 
		A B C D E  
		
		*/
		for(char endingLetter = 'A'; endingLetter<='E'; endingLetter++) {
			
			for(char letter = 'A'; letter<=endingLetter; letter++) {
				System.out.print(letter + " ");
			}
			System.out.println();
		}
		
		System.out.println("----------");
		/*
		    A 
		   A B 
		  A B C 
		 A B C D 
		A B C D E  
		
		*/
		for(char endingLetter = 'A'; endingLetter<='E'; endingLetter++) {
			
			for(int space = 'E'-endingLetter; space>0; space--) {
				System.out.print(" ");
			}
			
			for(char letter = 'A'; letter<=endingLetter; letter++) {
				System.out.print(letter + " ");
			}
			System.out.println();
		}

		System.out.println("----------");
		/*
		        A 
		      A B 
		    A B C 
		  A B C D 
		A B C D E  
		
		*/
		for(char endingLetter = 'A'; endingLetter<='E'; endingLetter++) {
			
			for(int space = ('E'-endingLetter)*2; space>0; space--) {
				System.out.print(" ");
			}
			
			for(char letter = 'A'; letter<=endingLetter; letter++) {
				System.out.print(letter + " ");
			}
			System.out.println();
		}
		
		System.out.println("----------");
		/*
		    A 
		   B B 
		  C C C 
		 D D D D 
		E E E E E  
		
		*/
		for(char endingLetter = 'A'; endingLetter<='E'; endingLetter++) {
			
			for(int space = 'E'-endingLetter; space>0; space--) {
				System.out.print(" ");
			}
			
			for(char letter = 'A'; letter<=endingLetter; letter++) {
				System.out.print(endingLetter + " ");
			}
			System.out.println();
		}
		
		System.out.println("--------");
		/*
		    1 
			2 5 
			3 6 8 
			4 7 9 10 
		 * */
		 
		/**
		 * 5 ROW , row count equals element count
		 * row 1 == 1   
		 * row 2 == 2 , 2+(5-1)
		 * row 3 == 3 , 3+(5-1) , 7+(5-2) 
		 * row 4 == 4 , 4+(5-1) , 8+(5-2) , 11+(5-3) 
		 * row 5 == 5 , 5+(5-1) , 9+(5-2) , 12+(5-3) , 14+(5-4) 
		 * 
		 */
		

		int rowCount = 5;
		for (int i = 1; i <= rowCount; i++) {
		    int value = i;
		    for (int j = 1; j <= i; j++) {
		        System.out.print(value +  " ");
		        value += rowCount -j;
		    }
		    System.out.println("");
		}
		
		
		System.out.println("--------");
		/*
			1111111
			1111122
			1111333
			1114444
			1155555
			1666666
			7777777
		 * */
		
		int rows = 7 ; 
		for (int i = 1; i <= rows; i++)
        {
            for (int j = 1; j <= rows-i; j++)
            {
                System.out.print(1);
            }
             
            for (int j = 1; j <= i; j++)
            {
                System.out.print(i);
            }
             
            System.out.println();
        }
		
		
	}

}
