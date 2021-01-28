package a_review.week2;

public class Task_SecondsConverter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int seconds = 3910 ; 
		System.out.println("Original seconds value "  + seconds );
		
		int minutes , hours ; 
		int secondsRemainingAfterHour ; 
		
		hours = seconds/3600 ;   // 3910/3600 is 1   and  310 seconds remaining after this	
		// calculate the minute for remaining part of seconds 
		// 310 seconds remaining and below is how we get that 310
		secondsRemainingAfterHour =  seconds % 3600 ; // 310 
		// now use this remaining seconds to calculate minutes 
		// 310 / 60 -->> 5 minutes 
		minutes = secondsRemainingAfterHour / 60 ;  // 5 minutes and 10 seconds remaining 
		
		// find out how many seconds remaining after minute calculation 
		//  310 % 60 -->> 10 seconds 
		
		seconds = secondsRemainingAfterHour % 60 ;  // changing the original value of 3910 to remainings seconds 
	
		System.out.println("hours value "  + hours );
		System.out.println("minutes value "+ minutes );
		System.out.println("seconds value "+ seconds );
		
		
		
		
		
		
		
		
		

	}

}
