package a_review.week10;

public class StringPractice3 {

	public static void main(String[] args) {
		
		String str = "aaaabbbbcccdddeeeffffgggghhhhhhiiiijjjjkkkkk";
					//"aabcca";
		
		String result = "";  // "abc"
		
							// [a, a, b, c, c, a]	
		for(String each  :   str.split("")  ) {
			
			if( ! result.contains(each) ) {
				result += each;
			}
			
		}
		
		
		System.out.println(result);
					
		
		
	}
	
}

/*
Remove duplicated characters

	"aabcca"
	
	"abc"
*/