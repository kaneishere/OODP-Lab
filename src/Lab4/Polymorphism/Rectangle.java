package Lab4.Polymorphism;

public class Rectangle implements Shape{
    private int length;
    private int width;


    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }
    @Override
    public int getArea() {
        return length * width;
    }
}
