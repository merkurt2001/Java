package a_review.week10;

import java.util.Scanner;

public class StringPractice2 {
	
	public static void main(String[] args) {
		
		String str = new Scanner(System.in).next();   // madaM
				//	"Cybertek";
					//01234567
		
		String reversedStr = "";   // "ketrebyC"
		
		for(int i = str.length()-1; i>=0  ; i-- ) {  // i: index numbers of the string
			reversedStr += str.charAt(i);
		}
		
		System.out.println(reversedStr);
		
		boolean isPalindrome = str.equalsIgnoreCase(reversedStr);
		
		System.out.println(isPalindrome);
		
		
	}

}

/*
 Palindrome task
 */
