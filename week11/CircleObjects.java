package a_review.week11;

public class CircleObjects {

    public static void main(String[] args) {
        Circle circle1 = new Circle(5);

        System.out.println("Area: "+circle1.getArea());
        System.out.println("Perimeter: " + circle1.getPerimeter());
        System.out.println("Diameter: " +circle1.getDiameter());

        System.out.println(circle1);

        Circle circle2 = new Circle(20);

        System.out.println(circle2);



    }


}
