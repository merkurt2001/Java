package a_review.week6;

public class UsingComputerMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Computer c1 = new Computer() ; 
		c1.brand = "Apple" ; 
		c1.price = 1300 ; 
		c1.screenSize = 17 ; 
		
//		c1.open();
		c1.displayInfo();
		
		Computer c2 = new Computer() ; 
		c2.brand = "Asus" ; 
		c2.price = 345 ; 
		c2.screenSize = 20 ; 
		
		c2.displayInfo();
		
		
	}

}
