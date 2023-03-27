package creational1.Bridge;

public class Square extends Shape{
    public Square(color color1){
        super(color1);
    }
    @Override
    public String draw() {
        return "Square drawn " + color.fill();
    }
}
