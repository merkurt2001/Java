package a_review.week2;

public class RelationalOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Relational Operators
//				== , !=
//				>= , <= , > , <
		// it will return a boolean result 
		
		 int count = 11 ; 
		 
		 // =     assignment , it's a command 
		 // ==    comparison , it's a question -->> true or false 
		 
		 // check if the count is 10 
		 System.out.println(  count == 10   );
		// check if the count is not 10 
		 System.out.println(  count != 10   );
		 
		 // if the count is 10 print ,  GREAT !! 
		 // if not print NOT SO GREAT !! 
		 
		 // Inside parenthesis of if statement , w
		 // we can use below 
		  //   -- boolean literals :  true , false 
		  //   -- boolean variable :  assuming you have boolean b = true; -->> if(b==true){...}
		  //   -- boolean expression: anything that generate boolean result 
		 		// for example all the relational operators 
		 
		 if( count==10  ) {
			 System.out.println("GREAT!");
		 }else {
			 System.out.println("NOT SO GREAT!!");
		 }
		 
		 // if the count is odd number , print its odd !!! 
		 // else print even!!!!
		 // if a number can be divided by 2 without any remainder , it's a even number 
		 // if the remainder is 1 when dividing by 2 then it's a odd number 
		 
		 System.out.println("is count odd  "   +  (count%2 ==  1)       );
		 System.out.println("is count even  "   + (count%2 ==  0)       );
		 
		 // please do not accidentally end your if statement like this 
		 // if(some condition) ; // NO SEMI COLON here!!!
		 
		 if( count%2 == 1 ) {
			 System.out.println("THIS IS A ODD NUMBER!!");
		 } else {
			 System.out.println("THIS IS A EVEN NUMBER!!!");
		 }
		 
		 // Check if the number can be divided by 3 with no remainder 
		 // if so print  , can be divided by 3 
		 // else print , can not be divided by 3 
		 // try use != this time 
		 
		 if(  count%3  != 0   ) {
			 
			 System.out.println("IT CAN NOT BE DIVIDED BY 3 WITHOUT REMAINDER");
			 
		 }else {
			 
			 System.out.println("IT CAN BE DIVIDED BY 3 WITHOUT REMAINDER");
			 
		 }
		 
		
		

	}

}
