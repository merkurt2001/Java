package a_review.week5;

public class CallingAMethodInsideAnotherMethod {

	public static void main(String[] args) {
		/**
		 * 
		 * wakeUp() ;
		 * 
		 * prepareTheKids() ;
		 * 		makeBreakfast();
		 * 		feedTheKids;
		 * 		dropTheKidsToSchool();
		 * 
		 * workAndLearn()
			  work()
			  attendClass()
		 * 
		 */
		
//		wakeUp();
		
		prepareTheKids();
		/*
		 * output :
		 *  Prepare the kids method start
			make a turkish tea or coffee
			cereal , egg , milk , toast
			feed the kids with love , and nice food
			pop up in the car, drive to school , dropoff
			Prepare the kids method end
		 * */
		System.out.println("-------------");
		workAndLearn();
		
	}
	 
	public static void wakeUp() {
		System.out.println("open one eye");
		System.out.println("close it and back to sleep");
		System.out.println("throw the alarm and wake up and drink coffee");
	}
	
	public static void prepareTheKids() {
		
		System.out.println("Prepare the kids method start");
		makeBreakfast();
		feedTheKids();
		dropTheKidsToSchool();
		
		System.out.println("Prepare the kids method end");
		
	}
	
	
	
	//makeBreakfast();
	public static void makeBreakfast() {
		
		System.out.println("make a turkish tea or coffee");
		System.out.println("cereal , egg , milk , toast");
	}
	
//	 * 		feedTheKids;
	public static void feedTheKids() {
		
		System.out.println("feed the kids with love , and nice food");
	}
	
//	 * 		dropTheKidsToSchool();
	public static void dropTheKidsToSchool() {
		
		System.out.println("pop up in the car, drive to school , dropoff");
	}
	
	
// workAndLearn()
//	  work()
//	  attendClass()
	public static void workAndLearn() {
		
		work();
		attendClass();
	}
	
	
	public static void work() {
		System.out.println("working as an SDET");
	}
	
	public static void attendClass() {
		System.out.println("Attending class at Cybertek");
	}
	
	
	
	
	

}
