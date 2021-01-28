package a_review.week12;

import java.text.DecimalFormat;

public class Shape {

    public String name;
    public double area, perimeter;

    public Shape(String name) {
        this.name = name;
    }

    public double calculateArea(){
        return 0;
    }

    public double calculatePerimeter(){
        return 0;
    }

    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("0.00");
        return "Shape{" +
                "name='" + name + '\'' +
                ", area=" +  df.format(area) +
                ", perimeter=" + df.format(perimeter )+
                '}';
    }


}

/*
Shape:
	variables:
			 name, area, perimeter

	methods:
			calculateArea()	, calculatePerimeter(), toString()
 */
