package assesment_solution.no5_for_loop;

import java.util.Scanner;

public class Question7 {

	public static void main(String[] args) {
		/**
		 * 
		 * Question-6:

		 Write a program to print 
		 Fibonacci series of n terms 
		 where n is declared by user :  
		 0, 1, 1, 2, 3, 5, 8, 13, 21, 34,......
		
		This is a example of Fibonacci series of 6 terms 
		
		term number		0	1	2	3	4	5	6
		Actual value	0, 	1, 	1, 	2, 	3, 	5, 	8
		
				 		  num1	  num2	   sum 
		iteration 1 		0 	+	1	=	1
		iteration 2			1   +   1	=	2 
		iteration 3			1   +   2	=	3 
		iteration 4			2   +   3	=	5 
		iteration 5			3	+	5	=	8
		.........		 		
		*/
		Scanner scan = new Scanner(System.in); 
		System.out.println("What is the term number ? ");
		int n = scan.nextInt(); 
		
		int num1=0 , num2=1 ; 
		int sum ; 
		
		for (int i = 2; i <=n ; i++) {
			
			sum = num1 + num2 ; 
			num1 = num2 ; 
			num2 = sum ; 
			
		}
		System.out.println("The final number in sequence is " + num2);
		
//		  sum = num1 + num2 ;   // 0+1 = 1 
//		  num1 = num2 ; 			// 1 
//		  num2 = sum ; 				// 1 
//		  
//		  sum = num1 + num2 ;  // 2
//		  num1 = num2 ;  //  1
//		  num2 = sum ;   //  2 
//		  
//		  sum = num1 + num2 ;  // 3
//		  num1 = num2 ;  //  2
//		  num2 = sum ;   //  3 
		  
		  
		  
		  
		  
		  
		
		
		
		

	}

}
