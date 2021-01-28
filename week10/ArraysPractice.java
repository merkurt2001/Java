package a_review.week10;

import java.text.DecimalFormat;

public class ArraysPractice {
	
	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,5,6,7,8,9};
		int countEven = 0;
		int countOdd = 0;
		
		for(int i = 0; i <=arr.length-1; i++ ) {
			if(arr[i] % 2 ==0 ) {
				countEven++;
			}else {
				countOdd++;
			}
		}
		
		System.out.println("Even Numbers: "+countEven);
		System.out.println("Odd Numbers: "+countOdd);
		
	System.out.println("======================================");
		
		int[] numbers = {10, 20, 5, 4, 3, 2, 1, 40, 30, 45, 1};
		int max = numbers[0]; // 45
		int min = numbers[0]; 
		int sum = 0;
		
		for(int each  : numbers) {
			 max=Math.max (each, max);
			 min= Math.min(each, min);
			 sum += each; 
		}
		//					10.0  / 3
		//			       double / int ==> double
		double average =  (double)sum / numbers.length;
		
		DecimalFormat df = new DecimalFormat("0.0000");  
		
		System.out.println("Max Number: "+max);
		System.out.println("Min Number: "+min);
		System.out.println("Average Number: "+ df.format( average ) ); 
	
	
		
		

	}
	

}
