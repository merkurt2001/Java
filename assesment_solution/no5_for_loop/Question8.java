package assesment_solution.no5_for_loop;

import java.util.Scanner;

public class Question8 {

	public static void main(String[] args) {
		/**
		 * 
		 * Question-8:

		Write a program to calculate the sum of the numbers from 1 till upper bound.
		If upper bound is 5, sum should be 1 + 2 + 3 + 4 + 5 = 15.
		If upper bound is 11, sum should be 1 + 2 + ... + 11 = 66.
		If upper bound is 100, sum should be 1 + 2 + ... + 100 = 5050.
		
		*/
		Scanner scan = new Scanner(System.in); 
		System.out.println("Enter the upper bound : ");
		int lastNumber = scan.nextInt(); 
		
		int sum = 0 ;  
		
		
		for (int i = 1; i <= lastNumber; i++) {
			sum += i ; 
		}
//		
//		sum += 1 ; 
//		sum += 2 ;
//		sum += 3 ;
//		sum += 4 ;
//		sum += 5 ;
		
		System.out.println(sum);
		
		
		

	}

}
