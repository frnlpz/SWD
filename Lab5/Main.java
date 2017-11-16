package Lab5;

public class Main {
    public static void main(String[] args) {

        Circle circle = new Circle(3);
        Rectangle rectangle = new Rectangle(2,6);
        Square square = new Square(5);
        Ellipse ellipse = new Ellipse(4,2);

        System.out.println(circle.toString());
        System.out.println(rectangle.toString());
        System.out.println(square.toString());
        System.out.println(ellipse.toString());
    }
}
