package a_review.week12;

public class Circle extends Shape{
    public double radius, diameter; // multiple copies

    public final static double PI;  // there is only one copy

    static{
        PI = Math.PI;
    }

    public Circle(double radius){
        super("Circle");
        this.radius = radius;
        diameter =2 * radius;
        area = calculateArea();
        perimeter = calculatePerimeter();
    }

    @Override
    public double calculateArea() {
        return radius * radius * PI;
    }

    @Override
    public double calculatePerimeter() {
        return  diameter * PI;
    }


}
