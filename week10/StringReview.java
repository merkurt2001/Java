package a_review.week10;

public class StringReview {
	
	public static void main(String[] args) {
		String str = "cybertek";
			str = str.toUpperCase();  // "CYBERTEK"
			
			System.out.println(str);
			
		
			String name = "I love Java";
			String language = name.substring(  name.lastIndexOf(" ")+1   );
			
			System.out.println(language);
			
			
			
			String s1 = "Cybertek";
			String s2 = new String("Cybertek");
			
			System.out.println( s1 == s2 );
			System.out.println(s1.equals(s2));
			
		
		
	}

}
