package Lab5;

public class Rectangle extends Shape{

    private double length, width = 0;

    Rectangle(double length, double width){
        this.length = length;
        this.width = width;
    }

    @Override
    public double Area() {
        return length*width;
    }

    @Override
    public double Perimeter() {
        return 2*length+2*width;
    }
}
