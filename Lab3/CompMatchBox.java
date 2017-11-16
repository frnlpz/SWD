package Lab3;

public class CompMatchBox {
    double weight = 0;

    public Box box = new Box(8,2,12);

    public CompMatchBox(Box box, double weight){
        this.box = box;
        this.weight = weight;
    }
}
