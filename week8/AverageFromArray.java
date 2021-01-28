package a_review.week8;

public class AverageFromArray {

	
	/*
	 * - Create a method that will accept an int array and return
	 *  the average of the elements
			Ex: [10, 15, 5, 6] -> 9
	 */
	
	public static void main(String[] args) {
		int [] arr = {10, 15, 5, 6, 13, -10, -3};
		System.out.println(getAverage(arr));
	}
	
	public static double getAverage (int [] arr) {
		
		double sum = 0;
		
		for(int num : arr) {
			sum += num;  // sum = sum + num
		}
		
		return sum / arr.length;
	}
	
	public static double getAverage(double [] arr) {
		double sum = 0;
		
		for(double num : arr) {
			sum += num;  // sum = sum + num
		}
		
		return sum / arr.length;
	}
	
	
	
	
}
