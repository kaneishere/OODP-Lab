package Tutorial5.Polygon;

public class Test {
    public static void main(String[] args) {
        Polygon rectangle = new Rectangle("rect", 10, 10 );
        Polygon triangle = new Triangle("triang", 10, 10);
        System.out.println(rectangle.calArea());
        System.out.println(triangle.calArea());
    }
}
