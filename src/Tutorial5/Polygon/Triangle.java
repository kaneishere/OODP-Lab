package Tutorial5.Polygon;

public class Triangle extends Polygon {
    public Triangle(String name, float width, float height) {
        super(name, width, height);
        setPolytype(KindofPolygon.POLY_TRIANG);
    }

    @Override
    public float calArea() {
        return (float) (0.5 * width * height);
    }
}
