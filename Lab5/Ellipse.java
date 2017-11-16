package Lab5;

public class Ellipse extends Shape implements Eccentric{

    private double a, b = 0;

    Ellipse(double a, double b){
        if (a>b) {
            this.a = a;
            this.b = b;
        } else {
            this.a = b;
            this.b = a;
        }
    }

    Ellipse() {}

    public double Eccentricity(){
        return Math.sqrt(1 - ((b * b) / (a * a)));
    }

    @Override
    public double Area() {
        return Math.PI * a * b;
    }

    @Override
    public double Perimeter() {
        double aux1 = a * a + b * b;
        double aux2 = (a - b) * (a - b);
        double aux3 = 2 * aux1 - aux2 / 2;
        return Math.PI * Math.sqrt(aux3);
    }

    @Override
    public String toString(){
        return  Name()+ "\n"
                + "Area=" +         Area() +         "\n"
                + "Perimeter=" +    Perimeter() +    "\n"
                + "Eccentricity=" + Eccentricity() + "\n";
    }
}
