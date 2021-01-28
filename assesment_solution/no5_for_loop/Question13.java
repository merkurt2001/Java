package assesment_solution.no5_for_loop;

public class Question13 {

	public static void main(String[] args) {
		/*
		 * Question-13:

		Print following chess board using nested for loops.
		W B W B W B W B
		B W B W B W B W
		W B W B W B W B
		B W B W B W B W
		W B W B W B W B
		B W B W B W B W
		W B W B W B W B
		B W B W B W B W

		NOTE:
		1. Total 8 rows and 8 columns.
		2. "W" and "B" are in alternate positions 
		(row-wise or column-wise), you will not find consecutive W or B.
		 * 
		 * */
		
		for(int row=1 ; row<=8 ;row++) {
		
		// if the row number is odd do this 
		  if(row%2==1) {
			for (int col = 1; col <= 8; col ++) {
				
				if(col%2==1) {
					System.out.print("W");
				}else {
					System.out.print("B");
				}
				System.out.print(" ");
			}
		  }else {
			// if the row number is even do this 
			for (int col = 1; col <= 8; col ++) {
				
				if(col%2==1) {
					System.out.print("B");
				}else {
					System.out.print("W");
				}
				System.out.print(" ");
			}
		  }
		
		  System.out.println();
		}

		System.out.println("--------");
		
		
		
		

	}

}
