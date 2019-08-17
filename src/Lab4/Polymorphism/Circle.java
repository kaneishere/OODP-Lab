package Lab4.Polymorphism;

public class Circle implements Shape{

    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public int getArea() {
        return (int) (Math.PI * Math.pow(radius, 2));
    }
}
