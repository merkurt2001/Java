package a_review.week2;

import java.util.Scanner;

public class ScannerIntro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// I want to ask this number from user 
		// when program run 
		// Scanner can be used to capture console input 
		
		Scanner scan = new Scanner(System.in); 
	
		System.out.println("ENTER SCORE : ");
		int score = scan.nextInt() ; // This will wait for user to enter number and assign that number to score ; 
		
		
		if (score > 70) {
			System.out.println("PASS");
		}else {
			System.out.println("FAIL");
		}
		

	}

}
