package Tutorial2;

public class Circle {
    private double radius = 0;
    private static final double PI = Math.PI;

    public Circle() {}

    public Circle(double radius) {
        this.radius = radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double area() {
        return PI * Math.pow(radius, 2);
    }

    public double circumference() {
        return 2 * radius * PI;
    }

    public void printArea() {
        System.out.println("Area of circle");
        System.out.println("Radius: " + radius);
        System.out.println("Area: " + area());
    }

    public void printCircumference() {
        System.out.println("Circumference of circle");
        System.out.println("Radius: " + radius);
        System.out.println("Circumference: " + circumference());
    }
}
