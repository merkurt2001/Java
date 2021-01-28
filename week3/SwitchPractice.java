package a_review.week3;

public class SwitchPractice {

	public static void main(String[] args) {
		
		
		
		int seasonCode = 2 ; // 1,2,3,4
		// 1 : Spring   2: Summer  3 : Fall  4 : Winter 
		
		switch(seasonCode) {
		
			case 1 :
				System.out.println("Spring");
				break ; // this is or breaking out of the switch statement
			case 2 : 
				System.out.println("Summer");
				break ; 
			case 3 : 
				System.out.println("Fall");
				break; 
			case 4 : 
				System.out.println("Winter");
				break; 
			default :
				System.out.println("INVALID ENTRY");
				break; // This is optional here because this is the last line of switch anyway

		}
		
		
		
		/*
		if(seasonCode==1){
		
			System.out.println("Spring");
		
		}else if(seasonCode==2) {
			
			System.out.println("Summer");
			
		}else if(seasonCode==3) {
			
			System.out.println("Fall");
			
		}else if(seasonCode==4) {
			
			System.out.println("Winter");
			
		}else {
			System.out.println("INVALID ENTRY!!!!!");
		}
		*/

	}

}
