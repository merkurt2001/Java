package a_review.week9;

import java.util.ArrayList;
import java.util.Arrays;

public class CountLettersFromList {
	
	/*
	 * 
	 * * Create a method that will accept an ArrayList of Strings and a char. 
	 * Count and return how many times the given letter is found in total between 
	 * all the ArrayList elements. 
	 * 
	 * Ex: { apple, ape, anna ]
	 * a ->    1	1     2
	 * -> 4
	 */
	
	
	public static void main(String[] args) {
		
		ArrayList<String> words = new ArrayList<>();
		words.add("apple");
		words.add("ape");
		words.add("anna");
		words.add("build");
		words.add("aaabbc");
		
		System.out.println(countLetters(words, 'a'));
		System.out.println(countLetters(words, 'e'));
		
		System.out.println(Arrays.toString(countLetters2(words, 'a')));
		System.out.println(Arrays.toString(countLetters2(words, 'e')));
		
	}
	
	
	public static int countLetters(ArrayList<String> words, char letter) {
		
		int total = 0; 
		
		for(String word : words) {
			
			for(char eachLetter : word.toCharArray()) {
				if(eachLetter == letter) {
					total++;
				}
			}
			
		}
		
		return total;
		
	}
	
	// 2nd version: instead of one total, return an int array for the
	// number of times the letter appears in each word
	
	public static int [] countLetters2(ArrayList<String> words, char letter) {
		
		int [] total = new int[words.size()];
		int index = 0;
		
		for(String word : words) {
			int count = 0;
			for(char eachLetter : word.toCharArray()) {
				if(eachLetter == letter) {
					count++;
				}
			}
			
			total[index++] = count;
			
		}
		
		return total;
		
	}

}
