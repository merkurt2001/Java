package a_review.week9;

import java.util.ArrayList;

public class CamelCase {
	
	/*
	 * 
	 * * Create a method that will accept an ArrayList of words. Each element
	 *  may be multiple words (which will be separated by a space and if that's 
	 *  the case make sure the element is following camel case rules. The camel 
	 *  case words should be added to a new ArrayList. 
	Each character in your word should be lowercase except the first letter of 
	each new word after the first word.
	
		[ "java is fun", "lets go to the park" ]
			javaIsFun ,  letsGoToThePark
	 */
	
	public static void main(String[] args) {
		
		ArrayList<String> words = new ArrayList<>();
		words.add("java is fun");
		words.add("lets go to the park");
		words.add("IT IS NOVEMBER");
		words.add("tHiS iS A miX");
		
		System.out.println(makeCamelCase(words));
		
	}
	public static ArrayList<String> makeCamelCase (ArrayList<String> words) {
		
		ArrayList<String> camelCaseWords = new ArrayList<>();
		
		for(String word : words) {  // java is fun
			
			String [] eachWord = word.toLowerCase().split(" "); // [java, is, fun]
			
			String camelWord = eachWord[0]; // java
			
			for(int i = 1; i < eachWord.length; i++) {
				
				String firstLetter = eachWord[i].substring(0,1).toUpperCase(); // F
				camelWord += firstLetter + eachWord[i].substring(1); // Fun
				
			}
			
			camelCaseWords.add(camelWord);
		}
		
		return camelCaseWords;
		
	}
	

}
