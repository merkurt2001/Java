package a_review.week11;

public class Test {

    public int score;

    public Test(int score){
        this.score = score;
    }

}


class B{
    public static void main(String[] args) {

        Test test01 = new Test(10);
        //Test test02 = new Test();

        System.out.println(test01.score);

        Test test03 = new Test(20);

        System.out.println(test03.score);

    }
}


