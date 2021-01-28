package a_review.week12;

public class ShapeObjects {

    public static void main(String[] args) {
        //Rectangle:  w= 10,  l= 20
        Rectangle rectangle = new Rectangle(10, 20);
        System.out.println(rectangle.toString());

        // Square: side = 4;
        Square square = new Square(5);
        System.out.println(square.toString());

        //Circle: r = 8
        Circle circle = new Circle(8);
        System.out.println(circle);


    }


}
