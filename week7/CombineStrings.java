package a_review.week7;

public class CombineStrings {
	
	/*
	 * 
	 * * Write a program that will take two String and combine them
	Ex:
		Input: "java", "apple"
		Output: "jaapvpale"
		
		// jaapvpale
		
	 */
	
	public static void main(String[] args) {
		System.out.println(combineStrings("abc", "def"));
		System.out.println(combineStrings("aaaaaaa", "bbbb"));
		
	}
	
	public static String combineStrings(String one, String two) {
		
		String combined = "";
		int biggest = one.length() > two.length() ? one.length() : two.length();
		
		for(int i=0; i < biggest; i++) {
			
			if(i < one.length()) {
				combined += one.charAt(i);
			}
		
			if(i < two.length()) {
				combined += two.charAt(i);
			}
			
		}
		
		return combined;
		
			
	}
	
	

}
