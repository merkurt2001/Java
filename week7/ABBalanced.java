package a_review.week7;

public class ABBalanced {

	/*
	 * * Write a program that will accept a String and check if the a's and b's in the String are 
	 * balanced. A String is balanced whenever there is an 'a' character and somewhere later 
	 * in the String there is a 'b' character
	Ex:
		Input: "abcab"
		Output: "balanced"

		Input: "bacdf"
		Output: "not balanced"

		Input: "ayeba"
		Output: "not balanced"
	 */
	
	public static void main(String[] args) {
		System.out.println(isBalanced("abcab"));
		System.out.println(isBalanced("bacdf"));
		System.out.println(isBalanced("ayeba"));
		System.out.println(isBalanced("aaxxb"));

	}
	
	public static String isBalanced(String s) {
		
		for(int i=0; i < s.length(); i++) {  // i <= str.length() -1
			
			if(s.charAt(i) == 'a') {
				
				if(!s.substring(i).contains("b")) {  // "axxb"
					return "not balanced";
				}
				
			}
			
		}
		
		
		return "balanced";
		
	}
	
	
	
	
}
