package a_review.week3;

import java.util.Locale;
import java.util.Scanner;

public class ScannerDoubleDataTypeHackForEUComputer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in).useLocale(Locale.US)  ; 
		System.out.println("Enter double using . not comma");

		double num = scan.nextDouble();
		System.out.println("Entering double " + num);
	}

}
