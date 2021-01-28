package a_review.week16;

public class tryCatchEx {

    public static void main(String[] args) {
        String s = "java";
        try {

            System.out.println(s.charAt(1));
            //throw new RuntimeException();

            Thread.sleep(-10);

        }catch (StringIndexOutOfBoundsException e) {
            System.out.println(s.charAt(0));
        }catch (InterruptedException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Finally block");
        }



    }

}
