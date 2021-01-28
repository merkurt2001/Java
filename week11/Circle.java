package a_review.week11;

import java.text.DecimalFormat;

public class Circle {

    public final static double PI = 3.14;
    private double radius, diameter, area, perimeter;

    public Circle(double radius){  // for one time setting only for each object
        this.radius =radius;
        diameter =  radius * 2;
        area = calculateArea();
        perimeter = calculatePerimeter();
    }

    private double calculateArea(){  // for internal use only
        return radius * radius * PI;
    }

    private double calculatePerimeter(){ // for internal use only
        return diameter * PI;
    }


    public String toString() {
        DecimalFormat df =new DecimalFormat("0.00");
        return "Circle{" +
                "radius=" + radius +
                ", diameter=" + diameter +
                ", area=" + df.format(area )+
                ", perimeter=" + df.format(perimeter) +
                '}';
    }


    public double getRadius() {
        return radius;
    }

    public double getDiameter() {
        return diameter;
    }

    public double getArea() {
        return area;
    }

    public double getPerimeter() {
        return perimeter;
    }



}

/*
	Circle:
		attributes:
			r, PI, diameter, area, perimeter

		methods:
			calculateArea(), calculatePerimeter(),
			toString()
 */
