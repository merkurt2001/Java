package assesment_solution.no5_for_loop;

public class Question10 {

	public static void main(String[] args) {
		/**
		 * Print following output using nested for loops:
		1
		22
		333
		4444
		55555
		666666
		7777777
		*/
		
		for(int row = 1 ; row<=7 ; row++) {
		
			for(int i=1 ; i<=row ; i++) {
				
				System.out.print(row);
				
			}
			System.out.println();
		}
		

	}

}
