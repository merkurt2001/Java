package a_review.week9;

import java.util.ArrayList;

public class SecondMaxNumber {
	
	// [ 1, 2, 2 3,5,4,1,4,5,5 ]

	/*
	 * * Create a method that accept an ArrayList of numbers and will find the 
	 * second biggest number and return that number. The biggest and the second
	 *  biggest number should not be the same.
	 */
	
	public static void main(String[] args) {
		ArrayList<Integer> nums = new ArrayList<>();
		nums.add(4);
		nums.add(6);
		nums.add(-4);
		nums.add(100);
		nums.add(100);
		nums.add(10);
		nums.add(-900);
		
		System.out.println(getSecondMax(nums));
		
		ArrayList<Integer> nums2 = new ArrayList<>();
		nums2.add(5);
		nums2.add(5);
		System.out.println(getSecondMax(nums2));
		
	}
	public static int getSecondMax (ArrayList<Integer> numbers) {
	
		int max = Integer.MIN_VALUE;
		int secondMax = Integer.MIN_VALUE;
		
		for(int num : numbers) {
			
			if(num > max) {
				secondMax = max;
				max = num;
			}
			
			if(num > secondMax && num < max) {
				secondMax = num;
			}
		
		}
		
		return secondMax;
	
	}

}
