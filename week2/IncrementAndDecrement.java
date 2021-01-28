package a_review.week2;

public class IncrementAndDecrement {

	public static void main(String[] args) {
		
		
		int score = 100 ; 
		
		// increase this by 1 
		//score += 1 ; 
		
		// increasing and decreasing by 1 is so common that we have even shorter way of doint this 
		++score ; 
		
		System.out.println(score);
		
		--score ;  // decrease by 1 
		System.out.println(score);
		
		// there are two types of increment and decrement operators 
		// pre and post 
		// pre increment/decrement will update the value right away and return the updated result
		// post increment/decrement will update the value and return the updated result next time the variable show up 
		
		System.out.println("score++ value now is "  +    score++ );
		System.out.println("next time is here  " +       score );
		
		System.out.println("++score value now is " +     ++score);
		System.out.println("-----------------\n");
		
		int appleCount = 8 ; 
		System.out.println("appleCount-- is : " +  appleCount--);
		System.out.println("next time is here " +  appleCount );
		System.out.println("--appleCount is : " +  --appleCount  ) ;
		
		// currently count value is 6 
						 // 6 
		//appleCount =  appleCount-- ;  // -->> appleCount = 6 
						// 6-1 =5 
		appleCount =  --appleCount ;   // appleCount = 5 ; 
		
		System.out.println( appleCount);
		System.out.println( appleCount);
		
		// currently there is 5 apple 
		int newCNT = --appleCount ; 
		System.out.println( appleCount );
		System.out.println( newCNT );

		// ++ -- will be heavily used when we come to the topic of Loops in Java -- stay tuned
		
		
		

	}

}
