package a_review.week9;

import java.util.ArrayList;

public class MergeArrayWithArrayList {
	
	
	/*
	 * 
	 * * Create a method that will take two arrays and merge the elements from the arrays. Return an ArrayList. 
     
          Ex: arrOne = {1,2};
              arrTwo = {4,5,6,7};
     
              result = [ 1,4,2,5,6, 7 ]
     
       () Note: The given arrays may be different sizes

	 */

	public static void main(String[] args) {
		int [] one = {5,5,5,5,5};
		int [] two = {1};
		System.out.println(mergeArrays(one, two));
	}
	
	public static ArrayList<Integer> mergeArrays(int [] one, int [] two) {
		
		ArrayList<Integer> numbers = new ArrayList<>();
		
		int max = Math.max(one.length,two.length);
		
		for(int i=0; i < max ; i++) {
			
			if(i < one.length) {
				numbers.add(one[i]);
			}
			
			if(i < two.length) {
				numbers.add(two[i]);
			}
			
		}
		
		return numbers;
	}
	
	
}
