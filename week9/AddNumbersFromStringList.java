package a_review.week9;

import java.util.ArrayList;

public class AddNumbersFromStringList {
	
	/*
	 * 
	 * * Create a method that will give an ArrayList of String, which will have number digits. 
	 * Take each character in the String elements as single digit numbers and add the numbers
	 *  from each element and put store them into an ArrayList of numbers.
     
    Ex: input: {"123,"421"};
     
        output: {6, 7}
	 */
	
	public static void main(String[] args) {
		
		ArrayList<String> nums = new ArrayList<>();
		nums.add("123");
		nums.add("421");
		nums.add("4032");
		
		System.out.println(sumOfEachString(nums));
	}

	public static ArrayList<Integer> sumOfEachString(ArrayList<String> nums) {
		
		ArrayList<Integer> sums = new ArrayList<>();
		
		for(int i=0; i < nums.size(); i++) {
			
			int sum = 0;
			
			for(int j = 0; j < nums.get(i).length(); j++) {
				
				sum += Integer.parseInt(nums.get(i).substring(j, j+1));
				// sum += Integer.parseInt("" + nums.get(i).charAt(j));
			}
			
			sums.add(sum);
			
		}
		
		return sums;
	}
	
	// If the Strings could have other characters besides numbers
	
	public static ArrayList<Integer> sumOfEachString2(ArrayList<String> nums) {
		
		ArrayList<Integer> sums = new ArrayList<>();
		
		for(int i=0; i < nums.size(); i++) {
			
			int sum = 0;
			
			for(int j = 0; j < nums.get(i).length(); j++) {
				
				if(!Character.isDigit(nums.get(i).charAt(j))) {
					continue;
				}
				
				sum += Integer.parseInt(nums.get(i).substring(j, j+1));
				// sum += Integer.parseInt("" + nums.get(i).charAt(j));
				
			}
			
			sums.add(sum);
			
		}
		
		return sums;
	}
	
}
