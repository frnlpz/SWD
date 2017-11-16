package Lab4;

public class ResizableCircle extends Circle implements Resizable {

    public ResizableCircle(double radius){
        this.radius = radius;
    }

    @Override
    public void resize(int percent){
        radius*=((double)percent/100);
    }
}
