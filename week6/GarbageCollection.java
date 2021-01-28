package a_review.week6;

public class GarbageCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// process of cleaning up unused objects from the heap memory 
		
		Computer c1 = new Computer() ; 
				 c1 = null ; 
		
		
		Computer c2 = new Computer();
		
//		c1 = c2 ; 
//		
		c2 = c1 ; 
		
		
		
		
		System.out.println("The end ");
		

	}

}
