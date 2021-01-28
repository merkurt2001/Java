package a_review.week10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListPractice2 {
	
	public static void main(String[] args) {
		String[] names = {"John", "Daniel", "Ahmed", "John", "Muhammed", "Daniel", "Ahmed", "Andy"};
		
		ArrayList<String> list = new ArrayList<>(Arrays.asList(names) );
		System.out.println(list);
		
		ArrayList<String> uniques = new ArrayList<>();
		
		for(String name : list ) {
			
			int count = 0;
			for( String each : list) {
				if(each.equals(name)) {
					count++;
				}
			}
			
			if(count == 1) {
				uniques.add(name);
			}
				
		}
		
		System.out.println(uniques);
		
		
		System.out.println("==================================================");
		
		String[] students = {"Hava", "Sheker", "Ali", "Ali", "Ellie", "Hava", "Ahmed", "Ahmed" };
		
		ArrayList<String> listOfStudents = new ArrayList<>(Arrays.asList(students));
		
		ArrayList<String> uniqueNames = new ArrayList<>();
		
		for( String each: listOfStudents) {
			int count = Collections.frequency(listOfStudents, each);
			if(count == 1) {
				uniqueNames.add(each);
			}
		}
		
		System.out.println(uniqueNames);
		
		System.out.println("=====================================================");
		
		/*
		ArrayList<String> studentNames = new ArrayList<>(Arrays.asList(students));
		
		studentNames.removeIf( each ->  Collections.frequency(studentNames, each) > 1 );
				// if the names are occured more than once, we remove those names, then there will unique names only
		
		System.out.println(studentNames);
		*/
		
		
		
		
		
		
	}

}
