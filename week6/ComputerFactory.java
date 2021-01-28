package a_review.week6;

public class ComputerFactory {

	public static void main(String[] args) {
		
		int x = 10 ; 
		
		// Computer class is blueprint for Computer objects 
		
		// creating object using new keyword
		Computer c1 = new Computer() ;
		// assigning value for each field
		c1.brand = "Apple" ; 
		c1.price = 1300 ; 
		c1.screenSize = 17 ; 
		// reassigning the value 
		c1.screenSize = 15 ;  
			
		
		Computer c2 = new Computer(); 
		c2.brand = "ASUS" ;
		c2.price = 345 ; 
		c2.screenSize = 15 ; 

		
		Computer c3 = new Computer(); 
		c3.brand = "ASUS" ;
		c3.price = 345 ; 
		c3.screenSize = 15 ; 
		

		System.out.println("computer 1 brand is " + c1.brand);
		System.out.println("computer 1 price is " + c1.price);
		System.out.println("computer 1 screenSize is " + c1.screenSize);
		
		System.out.println("computer 2 brand is " + c2.brand);
		System.out.println("computer 2 price is " + c2.price);
		System.out.println("computer 2 screenSize is " + c2.screenSize);
		
		

	}

}
