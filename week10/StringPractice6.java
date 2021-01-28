package a_review.week10;

public class StringPractice6 {
	
	public static void main(String[] args) {
		
		String str = "ababaaacbbdaaae";
		String uniques = "";
		
		for(char ch  : str.toCharArray()) {
			
			int count = 0;
			for(char each  : str.toCharArray() ) {
				if(each == ch) {
					count++;
				}
			}
			
			if(count == 1) {
				uniques += ch;
			}
			
		}
		
		
		System.out.println(uniques);
		
		
		
		
		
	}

}
