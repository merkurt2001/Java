package a_review.week4;

public class LoopIntro {

	public static void main(String[] args) {
		
		
		// below is the infinite loop situation because 10 is forever more than 0 
		
//		int x = 10 ; 
//		
//		while(x>0) {
//			System.out.println("do something here");
//			
//		}
		
		// count from 0 to 10 in 3 type of loops we learned
		int x = 0 ; 
		
		while( x<= 10 ) {
			
			System.out.print(x + " ");
			x++ ; 
			
		}
		
		System.out.println();
		
		// do while loop : 
		
		int y = 0 ; 
		
		do {
			// some stuff here
			System.out.print(y + " ");
			y++ ; 
			
		}while( y <=10 ) ; 
		
		
		System.out.println();
		
				// k++ here get executed after each iteration 
		for(int k = 0 ; k <= 10 ; k++ ) {
			
			System.out.print(k + " ");
			
		}
		
		
		
		
		

	}

}
