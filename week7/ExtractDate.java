package a_review.week7;

public class ExtractDate {
	
	
	/*
	 * 
	 *  Write a program that will have a String date, which will have format: mm/dd/yyyy. Take the input date and print out the Month name instead of number and the day
		Ex: 
		Input: 10/08/2020
		Output: October 10
	 */
	
	
	public static void main(String[] args) {
		System.out.println(extractMonth("02/10/2010"));
		System.out.println(extractMonth("04/25/2010"));

	}
	
	public static String extractMonth(String date) {
		
		String month = date.substring(0, date.indexOf('/') ); // 10
		String day = date.substring(date.indexOf('/')+ 1, date.lastIndexOf('/')); //8\
		String fixedDate = "";
		
		switch(month) {
		
			case "01": 
				fixedDate = "January";
				break;
			case "02":
				fixedDate = "February";
				break;
			case "03":
				fixedDate = "March";
				break;
			case "04":
				fixedDate = "April";
				break;
			// etc. 
		
		}
		
		
		return fixedDate + " " + day;
		
		
	}
	

}
