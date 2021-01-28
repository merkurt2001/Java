package a_review.week12;

public class Rectangle extends Shape {
        public double width, length;

        public Rectangle(double width, double length){
            super("Rectangle");
            this.width = width;
            this.length = length;
            area = calculateArea();
            perimeter = calculatePerimeter();
        }

    @Override
    public double calculateArea() {
        return width * length;
    }

    @Override
    public double calculatePerimeter() {
        return (width+length) * 2;
    }

}
