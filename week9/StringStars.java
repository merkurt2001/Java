package a_review.week9;

import java.util.ArrayList;

public class StringStars {
	
	/*
	 * * Create a method that will accept a String ArrayList and change all the 
	 * elements to stars for the same number of characters each element has. 
	 * Return the star ArrayList

	Ex: Input: {"one", "hi", "hold}

	Output: {"***","**","****"}


	 */

	public static void main(String[] args) {
//		String [] str = {"one,", "hi", "hold"};
//		
//		ArrayList<String> s = new ArrayList<>();
//		s.addAll(Arrays.asList(str));
//		
//		ArrayList<String> s2 = new ArrayList<>(Arrays.asList(str));
//		
//		System.out.println(s);
		
		ArrayList<String> s = new ArrayList<>();
		s.add("one");
		s.add("hi");
		s.add("hold");
		s.add("popcorn");
		
		System.out.println(makeStars(s));
	}
	public static ArrayList<String> makeStars(ArrayList<String> words) {
		
		ArrayList<String> stars = new ArrayList<>();
		
		for(String word : words) {
			
			String eachStar = "";
			
			for(int i=0; i < word.length(); i++) {
				eachStar += "*";
			}
			
			stars.add(eachStar);
			
		}
		
		return stars;
		
	}
	
	
	
	
}
