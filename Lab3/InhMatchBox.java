package Lab3;

public class InhMatchBox extends Box {
    double weight = 0;

    public InhMatchBox(double width, double height, double depth) {
        super(width, height, depth);
    }

    public void setWeight(double weight){
        this.weight = weight;
    }
}
