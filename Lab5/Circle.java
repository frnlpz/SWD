package Lab5;

public class Circle extends Ellipse{

    private double radius = 0;

    Circle(double radius){
        this.radius = radius;
    }

    @Override
    public double Area() { return Math.PI * radius * radius; }

    @Override
    public double Perimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString(){
        return  Name()+ "\n"
                + "Area=" +         Area() +         "\n"
                + "Perimeter=" +    Perimeter() +    "\n";
    }
}
