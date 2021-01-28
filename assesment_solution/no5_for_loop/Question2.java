package assesment_solution.no5_for_loop;

public class Question2 {

	public static void main(String[] args) {
		/**
		 * Question-2:

		Write a program that 
		displays all odd numbers between 3-130 
		in the same line
		*/
		
//		for(int i=3 ; i<130 ; i++) {
//			
//			if(i % 2 ==1) {
//				System.out.print(i + " ");
//			}
//		}
		for(int i=3 ; i<130 ; i += 2 ) {
			
			System.out.print(i + " ");
			
		}
		
		

	}

}
