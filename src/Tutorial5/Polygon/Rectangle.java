package Tutorial5.Polygon;

public class Rectangle extends Polygon {
    public Rectangle(String name, float width, float height) {
        super(name, width, height);
        setPolytype(KindofPolygon.POLY_RECT);
    }

    @Override
    public float calArea() {
        return (float) (width * height);
    }
}
