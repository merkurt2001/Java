package a_review.week8;

public class UniqueFromArrays {
	
	
	/*
	 * 
	 * - Create a method that will accept an int array and print out the unique elements 
			Ex: [1,2,3,1,2,4] -> 3, 4
			
			return all the unique value in a String array
	 */
	
	public static void main(String[] args) {
		int [] arr = {1,2,3,1,2,4, 5, 6, 6, 7, 8, 8, 8, 9};
		uniquesValues(arr);
	}
	
	public static void uniquesValues (int [] nums) {
		
		for(int eachNum : nums) {
			
			int count = 0;
			
			for(int eachInnerNum : nums) {
				
				if(eachNum == eachInnerNum) {
					count++;
				}
				
			}
			
			if(count == 1) {
				System.out.println(eachNum);
			}
			
		}
		
		
	}

}
