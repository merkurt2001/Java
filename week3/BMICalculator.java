package a_review.week3;

import java.util.Scanner;

public class BMICalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/**
		 * 
		 * The formula is BMI = kg/m2 where kg is a person's weight in kilograms 
		 * and m2 is their height in metres squared. 
		 * A BMI of 25.0 - 30 is overweight, 
		 * A BMI of 18.5 - 25.0 is normal, 
		 * A BMI of less than 18.5 is underweight
		 * A BMI of more than 30 is obese
		 * 
		 * 
		 */
		
		 Scanner scan = new Scanner(System.in);
		
		 System.out.println("Please enter you weight in klogram ");
		 double weight = scan.nextDouble()  ;   // weight in klogram
		 
		 System.out.println("Please enter you height in meter ");
		 double height = scan.nextDouble()  ;      // height in meter
		 
		 double bmi  =  weight / (height*height)  ; 
		 
		 System.out.println("YOUR BMI is " + bmi);
		 
		 if( bmi < 18.5) {
			 
			 System.out.println("YOU ARE underweight ");
			 
		 }else if( bmi>= 18.5 && bmi < 25.0) {
			 
			 System.out.println("YOU ARE normal");
			 
		 }else if ( bmi>= 25 && bmi < 30.0) {
			 
			 System.out.println("YOU ARE overwight");
			 
		 }else if(bmi >=30 ) {
			 
			 System.out.println("You are obese");
			 
		 }
		 
		 
		 

	}

}
