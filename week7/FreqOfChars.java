package a_review.week7;

public class FreqOfChars {
	
	
	/*
	 * * Write a program that can return the frequency of each letter in the given String
	Ex:
		Input: "ABBBCCDEE"
		Output: 
			A: 1
			B: 3
			C: 2
			D: 1
			E: 2
	 */
	
	public static void main(String[] args) {
		freqOfEachChar("aaaabaacddccchh");
	}
	
	// a -> a
	// a -> b
	// a -> c
	// a -> c
	// a -> c
	
	// b -> a
	// b -> b
	// b -> c
	 
	public static void freqOfEachChar(String str) {
		
		String checked = "";
		
		for(int i=0; i < str.length(); i++) { // this loop is to iterate through each char
			int count = 0; // resets the counter to 0 each time i increments
			char eachChar = str.charAt(i);  // eachChar will be the character and index 'i'
			
			if(checked.contains(""+ eachChar)) {
				continue;
			}
			
			
			for(int j=0; j < str.length(); j++) {  // this loop iterates through the String, but
													// this loop will run from beginning to end 
													// for each iteration of the i look
				char eachInner = str.charAt(j);  
				
				if(eachChar == eachInner) {
					count++;
				}
				
//				System.out.println("i " + i);
//				System.out.println("j " + j);
//				System.out.println();
					
			}
			
			System.out.println(eachChar + ": " + count);
			checked += eachChar;
		
		}
		
		
		
	}
	
	

}
