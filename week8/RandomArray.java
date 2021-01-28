  package a_review.week8;
  
  import java.util.Arrays;

// pic  -> package, import, class
  
  import java.util.Random;

public class RandomArray {
	
	
	/*
	 *  Create a method that will accept a number and returns an int array. 
	 *  The size of the array will be based on the given number. 
	 *  Fill each element with a random number (range: 1-100). Print the array
	
	 */
	

	public static void main(String[] args) {
		System.out.println(Arrays.toString(generateRandomArray(8)));
	}
	
	public static int [] generateRandomArray(int size) {
		
		Random num = new Random();
		
		int [] arr = new int[size];
		
		for(int i=0; i < size; i++) { // <= length -1 or size -1
			
			arr[i] = num.nextInt(100)+1; // 0 - 99 , adding +1:  1-100
			
		}
			
		return arr;
		
	}
	
	

}
