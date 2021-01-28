package a_review.week6;

public class StringInMemory {

	public static void main(String[] args) {
		
		// since String is so common , java allow to create 
		// String object directly using String literal 
		String s1 = "abc" ;  //  "abc" is String literal 
		String s3 = "abc" ; 
		
		System.out.println( s1==s3 ); // this is checking if s1 and s3 have same address 
									 // meaning do they point to same object 
		
		
		String s2 = new String("abc") ; // using new keyword  
		System.out.println(s1==s2); // this is checking whether s1 and s2 has same address 
										// to same object 
		
		System.out.println(s1.equals(s2) );
		// this one is checking whether string objects s1 and s2 pointing has same content!!!!
	
		
		
		
		// Strings are objects 
		// they are storSed in the heap
		// String pool (String Constant Pool) : 
		//A very special area in the heap to store UNIQUE string literals 
		

	}

}
