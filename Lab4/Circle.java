package Lab4;

public class Circle implements GeometricObject {

    protected double radius = 1.0;

    public Circle(double radius){
        this.radius = radius;
    }

    public Circle() {
        Circle circle = new Circle(4);
    }

    @Override
    public double getArea() {
        return radius*radius*Math.PI;
    }

    @Override
    public double getPerimeter(){
        return 2*radius*Math.PI;
    }
}
