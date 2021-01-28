package a_review.week3;

import java.util.Scanner; 

public class LoginTestWithScanner {

	public static void main(String[] args) {
		
		// shortcut for importing after below line. 
		// command + shift + o for mac and  ctrl + shift + o for windows
		Scanner input = new Scanner(System.in) ;  
		
		System.out.println("Enter your username and password separated by space");
		
		String username  =  input.next();    //"abcdA" ;
		String password  = 	input.next(); 	 //"secret"; 
		
		 if(  username.equals("abcd")   && password.equals("secret")     ) {
			 
			 System.out.println("LOGIN SUCCESSFUL!");
			 
		 }else if( !username.equals("abcd")  && !password.equals("secret")  ) {
		 //}else if( username.equals("abcd")==false  &&  password.equals("secret")==false  ) {
				 
			 System.out.println("BOTH USERNAME AND PASSWORD ARE WRONG!!!");
			 
		 }else if( username.equals("abcd") &&  !password.equals("secret")  ) {
			 
			 System.out.println("USERNAME IS CORRECT BUT PASSWORD IS WRONG");
			 
		 }else if( !username.equals("abcd")  && password.equals("secret")  ) {
			 
			 System.out.println("USERNAME IS WRONG BUT PASSWORD IS CORRECT");
			 
		 }
		 
		
		
		
		

	}

}
