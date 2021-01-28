package a_review.week14;

    /*

    2. create a sub class of shape called Circle (meant to be subclass ONLY)
			attributes: radius, name(static), area, perimeter, hasVolume(static), volume

			override the abstract methods

			(if the shape does not have volume, return 0 for the colume)

			add a constructor that takes an argument for radius of the circle and initialize the instance variables: radius, area, perimeter, volume

			add a static block that can initialize the static variables of the circle

     */

import java.text.DecimalFormat;

public class Circle extends Shape{

    double radius;

    public Circle(double radius) {

        if(radius > 0) {

            this.radius = radius;
            area = calculateArea();
            perimeter = calculatePerimeter();

        }
    }

    static {
        name = "Circle";
    }

    @Override
    public double calculateArea() {
        return Math.pow(radius, 2) * Math.PI; // Math.pow(radius, 2) == radius * radius
    }

    @Override
    public double calculatePerimeter() {
        return radius * 2 * Math.PI;
    }

    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("0.00");
        return "Circle {" +
                "radius= " + radius +
                ", area= " + df.format(area) +
                ", perimeter =" + df.format(perimeter) +
                '}';
    }


}
