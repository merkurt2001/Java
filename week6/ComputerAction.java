package a_review.week6;

public class ComputerAction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Computer c1 = new Computer() ; 
		c1.brand = "Apple" ; 
		c1.price = 1300 ; 
		c1.screenSize = 17 ; 
		
		
		Computer c2 =  c1 ; 
		
		System.out.println(  c2.brand  );
		System.out.println(  c2.price  );
		System.out.println(  c2.screenSize  );
		
		
		c2.screenSize = 20 ; 
		System.out.println(  c1.screenSize  );
		
		

	}

}
