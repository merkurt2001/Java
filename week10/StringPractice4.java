package a_review.week10;

public class StringPractice4 {

	public static void main(String[] args) {
		
		
		String sentence = "I love java, Java is cool, jAvA is fun javajavajava java java java";
		String originalSentence = sentence;
		
			sentence = sentence.toLowerCase();
								// "i love java, java is cool, java is fun"
			
								// "i love , java is cool, java is fun"
							    // "i love , a is cool, java is fun"
								// "i love , a is cool, is fun"
			
		
		String word = "JAVA";
		word = word.toLowerCase();  // "java"
		
		int count =0; 
		
		
		while( sentence.contains(word) ) {
			sentence = sentence.replaceFirst(word, "");
			count++;
		}
		
		System.out.println(count);
		
		
		
	}
	
	
}
/*
Frequency of word
		
		sentence = "I love java, Java is cool, jAvA is fun"
		word = "java"
		
		
		3
	
*/