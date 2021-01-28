package a_review.week6;

public class StringMethodsPractice {

	public static void main(String[] args) {
		/**
		 * 
		 * 		length 
		 * 		equals
				equalsIgnoreCase
				toUpperCase
				toLowerCase
				contains 
		
				trim
				charAt 
				concat 
				isEmpty
				indexOf 
				replace 
		
				subString 
		 * 
		 */
		String message = "Java is Awesome!!" ; 
		System.out.println("Initial value of message \n " + message);
		
//		int count = message.length() ; 
//		System.out.println("how many characters we have " + count);
//		
//		System.out.println("how many characters we have " +  message.length() );
		
		message =   message.toUpperCase(); 
		System.out.println("after using uppercase method in above line \n  "+  message );
		
		String str = "abc " ; 
		System.out.println("str has character count : " + str.length() );
		
		System.out.println("is <abc > equal <abc> " + str.equals("abc")  );
		// what if i did not care about the leading or training space 
		
		// save the trimmed result in new variable 
		String str2 =  str.trim();   //abc
		System.out.println("the result after trimming "  +  str2.equals("abc")    );
		
		// compare str2 with ABC without caring about the case. 
		System.out.println("check str2 is ABC caseInsensitive   " 
											+ str2.equalsIgnoreCase("ABC")   );
		
		// contain :  partial check 
		System.out.println("Does str contains letter a : "  +   str.contains("a")    );
		System.out.println("Does str contains letter A : "  +   str.contains("A")    );
		// checking something contain something else in case insensitive manner 
		System.out.println("Does str contains letter A or a case insenstive : "  
									+   str.toUpperCase().contains("A")       );
		
			//       01234		 
		String s1 = "Hello" ; 
		    // 	     12345
		// charAt  accept index as number return the character at that location 
		System.out.println("first character : " +  s1.charAt(0)  );
		// find last character : index of last character is always 1 less that character count 
		int lastIndex = s1.length() -1 ; 
		System.out.println("index of the last character is "  + lastIndex);

		System.out.println("last character is " +  s1.charAt( lastIndex )  );
		
		// shortcut
		
		char lastChar =  s1.charAt( s1.length() -1  );
		System.out.println("last character is " + lastChar);
		
		System.out.println("check whether s1 is empty " +  s1.isEmpty() );
		
		String s2 = "";
		System.out.println("check whether s2 is empty " +  s2.isEmpty() );
		
//		String s3 = null ; 
//		System.out.println("check whether s3 is empty " +  s3.isEmpty() );
		
		// indexOf 
		//			 012345678901234
		String s4 = "EU4 is Awesome!" ; 
		// find the location|position|index of A
		
		System.out.println("Position of A is " +  s4.indexOf("A")   );
		System.out.println("Position of A is " +  s4.indexOf('A')   );
		// what if it does not exist 
		System.out.println("Position of Z is "  + s4.indexOf("Z"));
		
		// find the location|position|index of som
		System.out.println("Position of som is " + s4.indexOf("som")   );
		
		// subStr 
		//   012345678901234	
		//  "EU4 is Awesome!" ; 
		
		// substring is used to get part of the string from starting point 
		// until right before ending point 
		
		System.out.println("characters between index 7 and right before index 9  | " 
				                     +  s4.substring(7, 9)  );
		
		System.out.println("characters between index 1 and right before index 8  | " 
                +  s4.substring(1, 8)  );
		
		
		// substr that accept only beginning index 
		
		System.out.println("Get character starting from index 4 till the last one | "
							    +   s4.substring(4)    );		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
