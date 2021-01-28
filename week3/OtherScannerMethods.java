package a_review.week3;

import java.util.Scanner;

public class OtherScannerMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in); 
		
		// capture more than one word 
		System.out.println("ENTER FULL NAME ");
		String fullName =  scan.nextLine();
		
		System.out.println("ENTER Number within the range of byte ");
		byte   num1 = scan.nextByte();
		
		System.out.println("ENTER Number within the range of short ");
		short  num2 = scan.nextShort();
		
		System.out.println("ENTER Number within the range of int ");
		int    num3 = scan.nextInt();
		
		System.out.println("ENTER Number within the range of long ");
		long   num4 = scan.nextLong();
		
		System.out.println("ENTER Number within the range of float ");
		float  num5 = scan.nextFloat();
		
		System.out.println("ENTER Number within the range of double ");
		double num6 = scan.nextDouble();
		
		System.out.println("ENTER true or false! ");
		boolean b   = scan.nextBoolean();
		
		System.out.println("ENTER Your first name ");
		String name = scan.next();
		

	}

}
