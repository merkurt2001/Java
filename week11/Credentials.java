package a_review.week11;

public class Credentials {

        private String userName = "A123456789";
        private String passWord = "Cybertek123";

        /*
        public static String getUserName(){  // static method does not accept instance
             return userName;
        }

         */

        public  String  getUserName(){
                return userName;
        }

        public String getPassWord(){
               return passWord;
        }

        public void setUserName(String userName){
                this.userName = userName;  // this. only used it to call the instance when local variable is sharing the same name with instance
        }

        public void setPassWord(String passWord){
                this.passWord = passWord;
        }








}
