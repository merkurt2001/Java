package a_review.week7;

public class Anagram {
	
	/*
	 * 
	 * 
* Create a method that will accept two Strings and determine if they
*  are Anagrams of each other (return boolean)

	-> listen 
		silent 
	 */
	
	public static void main(String[] args) {
		
		System.out.println(isAnagram("abc", "cab"));
		System.out.println(isAnagram("aaaaaa", "cab"));
		System.out.println(isAnagram("listen", "silent"));
		
	}
	
	
	public static boolean isAnagram(String one, String two) {
		
		if(one.length() != two.length()) {
			return false;
		}
		
		for(int i=0; i < one.length(); i++) {
			two = two.replaceFirst("" + one.charAt(i), "");
		}
		
		return two.isEmpty();
		
	}
	

}
