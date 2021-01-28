package a_review.week10;

import java.util.Arrays;

public class ArraysPractice2 {

	public static void main(String[] args) {
		
		String[] group1 = {"Nergiz", "Kevser", "Mohammed", "Hasan", "Havva"};
		String[] group2 = {"mustafa", "cansu", "darina", "emine", "joseph", "ali", "metin"};
		String[] group3 = {"Mustafa","mehmet","ferruh","faruk","melih","sheker","sait"};
		
		int length = group1.length + group2.length + group3.length;
		
		String[] cybertek = new String[length];
		
		int i = 0; // for the index num of the array cybertek
		
		for( String each: group1) 
			cybertek[i++] = each;
		
		for(String each: group2) 
			cybertek[i++] = each;
		
		for(String each: group3) 
			cybertek[i++] = each;
		
		
			System.out.println( Arrays.toString(cybertek) );
		
			
			String[][] cybertek2 = { group1, group2, group3 };
			
			System.out.println( Arrays.deepToString(cybertek2));
		
		
	}
	
}
