package a_review.week8;

public class LongestString {
	
	
	/*
	 * 
	 * - Create a method that will accept a String array and 
	 * return a String which is the biggest word in the whole array. 
	 * The words will all have different lengths 
		Ex: [ "Monday", "Apple", "Banana", "Strawberry", "Lion" ]	-> Strawberry

	 */
	
	public static void main(String[] args) {
		String [] words = {"a", "bc", "edf", "sdnadijiods", "jfdwe", "yzrewr"};
		System.out.println(findLongestString(words));
	}
	
	public static String findLongestString(String [] words) {
		
		String longestWord = "";
		
		for(String word : words) {
			
			if(word.length() > longestWord.length()) {
				longestWord = word;
			}
			// one more condtion to check if equal, concat
		}
		
		return longestWord;
		
	}
	

}
