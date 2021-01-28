package a_review.week8;

public class ReverseEachWord {
	
	
	/*
	 * - Create a method that will accept a String and return the sentence with each word reversed 
	Ex: "I love learning java" -> I evol gninrael avaj


	 */
	
	public static void main(String[] args) {
		System.out.println(reverseEachWord("I love learning java"));
		System.out.println(reverseEachWord("Today is a nice day"));

	}
	
	
	public static String reverseEachWord (String str) {
		
		String [] words = str.split(" ");
		
		String reverse = "";
		
		for(String word: words) {
			
			String reverseEach = "";
			
			for(int i = word.length()-1; i >= 0; i-- ) {
				
				reverseEach += word.charAt(i);
				
			}
			
			reverse += reverseEach + " ";
			
		}
		
		return reverse.trim();
	}

}
