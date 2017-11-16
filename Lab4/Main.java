package Lab4;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(23.12);
        System.out.println("Circle's area: "+circle.getArea());
        System.out.println("Circle's perimeter: "+circle.getPerimeter());

        ResizableCircle resizableCircle = new ResizableCircle(12.3);
        System.out.println("Resizable circle's area: "+resizableCircle.getArea());
        System.out.println("Resizable circle's perimeter: "+resizableCircle.getPerimeter());

        resizableCircle.resize(34);
        System.out.println("Resizing to 34% . . . ");
        System.out.println("Resizable new circle's area: "+resizableCircle.getArea());
        System.out.println("Resizable new circle's perimeter: "+resizableCircle.getPerimeter());
    }
}
