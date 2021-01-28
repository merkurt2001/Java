package a_review.week4;

public class CountingDown {

	public static void main(String[] args) {
		
		// count from 10 to 0 using 3 type of loops 
		
		// while loop 
		
		int x = 10 ; 
		
		while( x >= 0) {
			
			System.out.print( x + " ");
			x-- ; 
			
		}
		
		System.out.println();
		
		// do while loop 
		
		int y = 10 ; 
		
		do {
			
			System.out.print(y + " ");
			y-- ; 
			
		}while( y>= 0 ) ;
		
		System.out.println();
		
		// for loop 
		
		for(int k = 10 ;  k >=0 ; k-- ) {
			
			System.out.print(k + " ");
			
		}
		
		

	}

}
