package a_review.week11;

public class LogIn {

    public static void main(String[] args) {

        // System.out.println(Credentials.userName);
        Credentials obj1 = new Credentials();


        /*
        System.out.println("Username entered: "+ obj1.userName); // not visible
        System.out.println("Password entered: "+ obj1.passWord); // not visible

        System.out.println("=========================================");
        obj1.userName = "B123456"; // not visible
        obj1.passWord = "789456"; // not visible

        System.out.println("Username entered: "+ obj1.userName); // not visible
        System.out.println("Password entered: "+ obj1.passWord); // not visible
    */




        System.out.println("Username entered: "+ obj1.getUserName());
        System.out.println("Password entered: "+ obj1.getPassWord());

        System.out.println("==============================================");
        /*
        cybertekSchool
        cyber456
         */

        obj1.setUserName("cybertekSchool");
        obj1.setPassWord("cyber456");

        System.out.println("Username entered: "+ obj1.getUserName());
        System.out.println("Password entered: "+ obj1.getPassWord());








    }

}
