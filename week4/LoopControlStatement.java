package a_review.week4;

public class LoopControlStatement {

	public static void main(String[] args) {
		
		
		// break 	:  breaking out of the loop early
		
		for (int i = 1; i <=10 ; i++) {
			
			System.out.print(i + "  ");
			if(i==5) {
				System.out.println(" I am gonna break right here!!");
				break; 
			}
			
		}
		
		System.out.println();
		
		// continue :  skip the current iteration 
		
		for(int i=1 ; i<=10 ; i++) {
			
			if(i==5) {
				System.out.print("I will just skip this one!!!");
				continue ; 
			}
			
			System.out.print( i + " "  );
		}
		
		
		System.out.println();
		
		for(int i=1 ; i<=10 ; i++) {
			
			if(i != 5) {
				System.out.print(i + " ");
			}else {
				System.out.print("I will just skip this one!!!");
			}
			
		}
		
		
		
		
		
		
		
		
		

	}

}
