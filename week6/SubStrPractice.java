package a_review.week6;

public class SubStrPractice {

	public static void main(String[] args) {
		
		//   012345678901234	
		//  "EU4 is Awesome!" ; 
		String str = "EU4 is Awesome!" ; 
		
		// Check if there is more than one word in above String 
		// print the result out 
		
		System.out.println(str + " has more than one word ?? : "  +  str.contains(" ")  );
		// alternatively you can do below using indexOf
//		contains("someString") --->> str.indexOf("someString")!= -1
		System.out.println(str + " has more than one word ?? : "  +  (str.indexOf(" ")!= -1)   );
		
		// assuming that the sentence does not start with or end with space (if so trim it out)
		// also assuming , there is only one space in between words 
		
		// find out the first word 
		int firstSpaceIndex = str.indexOf(" ") ; 
		String firstWord =  str.substring(0,  firstSpaceIndex ) ; 
		
		System.out.println("first word is " + firstWord);
		
		// second word , is between location right after first space and location right before second space 
		//  str.subStr(firstSpaceIndex+1  , secondSpaceIndex)
		
		
		//   012345678901234	
		//  "EU4 is Awesome!" ; 
		
		System.out.println("space index if we start looking from index 4  -->> " 
								+ str.indexOf(" " , 4)  );
		
		int secondSpaceIndex = str.indexOf(" " , firstSpaceIndex+1); 
		System.out.println("space index if we start looking from index right after first space  -->> " 
								+ secondSpaceIndex  );
		
		System.out.println("second word is " +  str.substring(firstSpaceIndex+1 , secondSpaceIndex));
		
		
		
		
		

	}

}
