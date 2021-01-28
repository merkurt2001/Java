package a_review.week8;

import java.util.Arrays;

public class Anagram {

	
	/*
	 * - Create a method that will accept two Strings and determine if they are
	 *  Anagrams of each other (return boolean)

	 */
	
	// listen
	// silent
	
	// l ++ i ++ s ++
	// s-- i-- l--
	
	// 26 -> int [] to be 26 counters
	
	// a -> 0 
	// b -> 1
	// z -> 25
	
	public static void main(String[] args) {
        System.out.println(isAnagram("listen","silent"));

	}
	
	public static boolean isAnagram (String one, String two) {
		
		if(one.length() != two.length()) {
			return false;
		}
		
		int [] count = new int[26]; 
		
		for(int i=0; i < one.length(); i++) {
			
			char charOne = one.charAt(i); // 'a' -> 97 // 'b' -> 98
			char charTwo = two.charAt(i);
			
			//count[0]  = count[0] + 1;
			// count[0] = 0 + 1  -> 1
			// count[0] = 1 + 1 -> 2
			
			count[charOne - 97] = count[charOne - 97] + 1;
			count[charTwo - 97] = count[charTwo - 97] - 1;
			
		}
		//System.out.println(Arrays.toString(count));
		return Arrays.equals(count, new int[26]);
	}
	
	
}
