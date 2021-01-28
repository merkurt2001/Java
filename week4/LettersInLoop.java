package a_review.week4;

public class LettersInLoop {

	public static void main(String[] args) {
		
		/**
		 *  ABCDEFG
		 * 
		 */
//		 char c1 = 'A' ; 
//		 ++c1 ;   // c1 =  65+1=66 -- (char)66-->> 'B'
//		 System.out.println(c1);
//		 ++c1 ; 
//		 System.out.println(c1);
//		 ++c1 ; 
//		 System.out.println(c1); //D
//		 
//		 --c1 ; 
//		 System.out.println(c1);
		 
		 // if you increment a char variable you will get next character 
		// if you  decrement a char variable you will get previous character 
		 
//		 for( char letter = 'A' ; letter <= 'Z' ; letter++ ) {
//			 System.out.print( letter + " ");
//		 }
//		 System.out.println();
		 
//		 // print from letter B till letter G 
//		 for( char letter = 'B' ; letter <= 'G' ; letter++ ) {
//			 System.out.print( letter + " ");
//		 }
//		 System.out.println();
		 
		
//		for(char endingChar = 'A' ; endingChar<= 'Z' ; endingChar++) {
//			
//			 for( char letter = 'A' ; letter <= endingChar ; letter++ ) {
//				 System.out.print( letter + " ");
//			 }
//			 System.out.println();
//		
//		}
		
		
		for(char endingChar='Z'; endingChar>='A'; endingChar--){
			
			for(char letter ='A'; letter <=endingChar; letter++) {
				System.out.print(letter + " ");
			}
			
			System.out.println();
		
		}
		 
		 
//		 for( char letter = 'A' ; letter <= 'B' ; letter++ ) {
//			 System.out.print( letter + " ");
//		 }
//		 System.out.println();
//		 
//		 
//		 for( char letter = 'A' ; letter <= 'C' ; letter++ ) {
//			 System.out.print( letter + " ");
//		 }
//		 System.out.println();
//		 
//		 
//		 for( char letter = 'A' ; letter <= 'D' ; letter++ ) {
//			 System.out.print( letter + " ");
//		 }
//		 System.out.println();
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		
		
	}

}
