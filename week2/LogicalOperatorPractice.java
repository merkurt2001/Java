package a_review.week2;

public class LogicalOperatorPractice {

	public static void main(String[] args) {
		
		
		// we can combine more than one condition using logical operators
		
		// LOGICAL AND  && , &
		// LOGICAL OR   || , | 
		// exclusive or   ^
		
		boolean light1On = true ;
		boolean light2On = false ;
		
		// check if both lights are on at the same time 
		System.out.println(  light1On && light2On       );
		// check if either of the lights are one // at least one of them is on 
		System.out.println(  light1On || light2On );
		
		// check if exactly one light is off and another is on 
		System.out.println(  light1On ^ light2On );
		
		
		// if the both lights are on print all on 
		// else print not both lights are one 
		
		//if( light1On==true && light2On ==true    )
		 if( light1On && light2On ) {
			 
			 System.out.println("BOTH LIGHTS ARE ON!!!");
			 
		 }else {
			 
			 System.out.println("NOT BOTH LIGHTS ARE ON!!!!");
			 
		 }
		// HOW many condition we can combine ? as many as you want!!!
		 
		//  check if at least one light is on 
		 if( light1On || light2On ) {
			 
			 System.out.println("AT LEAST ONE LIGHT IS ON!!!!!");
			 
		 }else {
			 
			 System.out.println("NONE OF THE LIGHTS ARE ON !!!!! DARK!!!!");
		 }
		 
		 
		 // CHECK EXACTLY ONE LIGHT IS ON ONE LIGHT IS OFF!!
		 if( light1On ^ light2On ) {
			 System.out.println("EXACTLY ONE LIGHT IS ON AND ONE IS OFF!");
		 }else {
			 System.out.println(" either both lights are on or both lights are off");
		 }
		

	}

}
