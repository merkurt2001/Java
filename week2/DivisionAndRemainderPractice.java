package a_review.week2;

public class DivisionAndRemainderPractice {

	public static void main(String[] args) {
		
		// 1 minutes  60 seconds 
		// 1 hour  60 minutes 
		// 1 hour  3600 seconds 
		
		// convert the seconds to minutes 
		int seconds = 3910 ;  // 1 hour 5 minutes and 10 seconds 
		
		int minutes , hours ; 
		
		minutes =  seconds / 60 ; 
		System.out.println(" The minutes is : "  + minutes     );
		
		// how many seconds remaining after getting minutes part 
		
		int remainingSecondsAfterMinute =  seconds % 60 ; 
		System.out.println(" The remianing seconds after minute is :  " + remainingSecondsAfterMinute   );
		
		// we can use minute as below 
		// hours =  minutes / 60 ; 
		// or we can use seconds directly
		hours = seconds / 3600 ; 
		
		
		System.out.println(" Hours is " + hours);
		
		// Task : convert the seconds to real life example of 
		// 3910 seconds is  1 hour 5 minute and 10 seconds 
		
		
		
		
		
	}

}
