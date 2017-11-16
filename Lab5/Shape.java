package Lab5;

public abstract class Shape {

    String Name() {
        return this.getClass().getName();
    }

    public abstract double Area();
    public abstract double Perimeter();

    @Override
    public String toString(){
        return    Name()+ "\n"
                + "Area=" +     Area() +      "\n"
                + "Perimeter="+ Perimeter() + "\n";
    }
}
