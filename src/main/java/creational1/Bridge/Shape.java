package creational1.Bridge;

public abstract class Shape {
    protected color color;
    public Shape(color color1){
        this.color = color1;
    }

    abstract String draw();
}
