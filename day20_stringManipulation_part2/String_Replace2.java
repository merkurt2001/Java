package day20_stringManipulation_part2;

public class String_Replace2 {

	public static void main(String[] args) {
		
		String sentence = "Coding is fun, it is my hobby!!";
		String withNoSpace = sentence.replace(" ", "");
		System.out.println(withNoSpace);
		System.out.println(sentence);
		
		//replace , with !!!
		sentence = sentence.replace(",", "!!!");
		System.out.println(sentence);
		
		
		String mixed = "&^@#j$a-v|a@#$";
		mixed = mixed.replace("&^@#", "");
		System.out.println(mixed);
		mixed = mixed.replace("@#$", "");
		System.out.println(mixed);
		mixed=mixed.replace("$", "").replace("-", "").replace("|","");
		System.out.println(mixed);
		
		String result = "About 8,930,000,000 results (0.68 seconds)";
		
		result = result.replace("About ", "").replace(" results (0.68 seconds)", "");
				
		System.out.println(result);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
