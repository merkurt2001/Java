package a_review.week10;

import java.util.Arrays;

public class ArraysPractice3 {
	
	public static void main(String[] args) {
		String s1 = "ERFEEZOBMB".toLowerCase().replace(" ", "");
					//"Silent".toLowerCase();
		String s2 = "FreezeBomb".toLowerCase().replace(" ", "");
			// "Listen".toLowerCase();
		
		char[] ch1 = s1.toCharArray();  // [s, i, l, e, n, t]
		char[] ch2 = s2.toCharArray();  // [l, i, s, t, e, n]
		
		Arrays.sort(ch1); 
		Arrays.sort(ch2);
		
		//System.out.println("Ch1: "+ Arrays.toString(ch1));
		//System.out.println("Ch2: "+ Arrays.toString(ch2));
		
		boolean isAnagram = Arrays.equals(ch1, ch2);
		System.out.println(isAnagram);
		
	}
	

}
/*

Anagram
	s1 = "bac"   [b, a, c]
	s2 = "acb"   [a, c, b]

	sort: [a, b, c]
	sort: [a, b, c]

	true

*/