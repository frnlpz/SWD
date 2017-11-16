package Lab3;

public class Main {
    public static void main(String[] args) {
        InhMatchBox inhMatchBox = new InhMatchBox(89,37,48);
        inhMatchBox.setWeight(120);
        CompMatchBox compMatchBox = new CompMatchBox(inhMatchBox,2);
        System.out.println("MatchBox volume is: "+ compMatchBox.box.Volume());
        System.out.println("Composition MatchBox height is: "+compMatchBox.weight);
    }
}
