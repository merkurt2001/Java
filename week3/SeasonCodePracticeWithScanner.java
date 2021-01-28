package a_review.week3;

import java.util.Scanner;

public class SeasonCodePracticeWithScanner {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in); 
		
		System.out.println("ENTER SEASON CODE : 1,2,3 OR 4 :  ");
		
		int seasonCode = scan.nextInt() ; // 1,2,3,4
		// 1 : Spring   2: Summer  3 : Fall  4 : Winter 
		
		switch(seasonCode) {
		
			case 1 :
				System.out.println("Spring");
				break ; // this is or breaking out of the switch statement
			case 2 : 
				System.out.println("Summer");
				break ; 
			case 3 : 
				System.out.println("Fall");
				break; 
			case 4 : 
				System.out.println("Winter");
				break; 
			default :
				System.out.println("INVALID ENTRY");
				break; // This is optional here because this is the last line of switch anyway

		}
		

	}

}
