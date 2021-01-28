package a_review.week8;

import java.util.Arrays;

public class UniqueFromArrayString {
	
	
	public static void main(String[] args) {
		int [] arr = {1,2,3,1,2,4, 5, 6, 6, 7, 8, 8, 8, 9};
		System.out.println(Arrays.toString(uniquesValues(arr)));
	}
	
	public static String [] uniquesValues (int [] nums) {
		
		String uniques = "";
		
		for(int eachNum : nums) {
			
			int count = 0;
			
			for(int eachInnerNum : nums) {
				
				if(eachNum == eachInnerNum) {
					count++;
				}
				
			}
			
			if(count == 1) {
				uniques += eachNum + " ";
			}
			
		}
		
		System.out.println(uniques);  // 3 4 5 7 9 
		
		return uniques.trim().split(" ");  // 3, 4, 5, 7, 9
		
	}

}
