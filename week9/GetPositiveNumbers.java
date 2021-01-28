package a_review.week9;

import java.util.ArrayList;

public class GetPositiveNumbers {
	
	/*
	 * 
	 * * Create a method that will accept an int array. 
	 * Extract all positive numbers from the array and store them into an ArrayList.
	Return the ArrayList
	 */
	
	public static void main(String[] args) {
		
		System.out.println(getPosNum(-9, 0, -8, 4, 1, -2, 3, -3));
		
	}
	
	public static ArrayList<Integer> getPosNum(int ... arr) {
		
		ArrayList<Integer> nums = new ArrayList<>();
		
		for(int each : arr) {
			
			if(each >= 0) {
				nums.add(each);
			}
		}
		
		return nums;
	}
	

}
