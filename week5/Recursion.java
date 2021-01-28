package a_review.week5;

public class Recursion {

	public static void main(String[] args) {
		// Recursion : a method calling itself : BUT WHY???????!!!!!!!
			
		printNumber(10);
		System.out.println("-------");
		printNumberLowToHigh(8);
		// OUTPUT : 10 9 8 7 6 5 4 3 2 1 THE END!!!
	}
	
	// count until 10 from num
	public static void printNumberLowToHigh(int num) {
		
		if( num > 10) {
			System.out.println("END!!!");
			return ;
		}
		
		System.out.print(num + " ");
		printNumberLowToHigh(num+1);
		
	}
	
	
	public static void printNumber(int n) {
		
		if( n <= 0) { // GET OUT OF THE METHOD WHEN REACH 0
			System.out.println("THE END!!!");
			return;
		}
		
		System.out.print(n + " ");
		// call printNumber with different number below
		// for example one less than the value of n
		printNumber(n-1);
		
	}

}
