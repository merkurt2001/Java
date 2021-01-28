package a_review.week2;

public class OperatorsPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/**
		 * Naming Convention 
		 * Class name : 
		 *   Always start with first letter upper case 
		 *   and if you have more word , user upper case for second word 
		 *   for example :  MyAweSomeClassNameHere 
		 *   
		 * Package name : 
		 * 	  always lower case , you may add _ to diffrientiate words 
		 * 
		 * Variable name : 
		 * 	  Always start with lower case , if you have more words : camelCase
		 * 
		 * Generally give meaningful names for readability 
		 * 
		 */
		
		 int myNumber = 10 ; 
		 
		 int myNumber2 = 100 ; 
		 
		 
		 // increase the value of myNumber2 by adding myNumber  100 + 10 = 110
		 			  // 100   + 10 
		 myNumber2 = myNumber2 + myNumber ;  // 110 
		 System.out.println(myNumber2);
		 
		 
		 // unary operator  + - !
		 
		 int num3 =  -15 ; 
		 int num4 =  +15 ;  // + is extra here , but can be used explicitly 
		 
		 // change the value of num4 to minus num3 if it was plus or minus if it was minus
		 
		 num4  = -num3 ; 
		 System.out.println(" current value of num4 is " + num4);
		 
		 // ! used to flip the value of boolean 
		 boolean lightOn = true ; 
		
		 System.out.println(   lightOn   );
		 System.out.println(   !lightOn   );
		 
		 
		 // short hand assignment operators 
		 //+=, -=, *=, \=, %=
		 
		 // we can use shorthand assignment operators 
		 // when variables showed up in both side of assignment operators
		 
		 int score = 100 ; 
		 // increase the value score by 10 ; 
		 
		 score += 10 ;  //score = score + 10 ; 
		 System.out.println("score is " +  score );
		 
		 // decrease by 100
		 score -= 100 ;  //score = score -100 ; 
		 System.out.println("score is " +  score );
		 
		 // multiply existing score by 3 ; 
		 
		 score *=  3 ;  //score = score * 3 ; 
		 System.out.println("score is " +  score );
		 
		 // divide existing result by 2 ;
		 score /= 2 ; // score = score /2 ; 
		 System.out.println("score is " +  score );
		 
		 // get the remaining part of dividing by 6 ; 
		 score %= 6 ;     //score = score % 6 ; 
		 System.out.println("score is " +  score );
		 
		

	}

}
