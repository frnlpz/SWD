package Lab3;

public class Box {

    double Width, Height, Depth = 0;

    public Box(double width, double height, double depth){
        this.Width  = width;
        this.Height = height;
        this.Depth  = depth;
    }

    public double Volume(){
        return Width*Height*Depth;
    }
}
