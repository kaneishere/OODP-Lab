package Lab4.Polymorphism;

import java.util.Scanner;

public class ShapeFactory {

    private static ShapeFactory shapeFactory = null;
    private static final Scanner scanner = new Scanner(System.in);
    private ShapeFactory() {}

    public static ShapeFactory getFactory() {
        return shapeFactory == null? new ShapeFactory() : shapeFactory;
    }
    public Shape make(String shape) {

        if(shape.equalsIgnoreCase("circle")) {
            System.out.print("Enter radius: ");
            return new Circle(scanner.nextInt());
        }

        else if(shape.equalsIgnoreCase("square")) {
            System.out.print("Enter length: ");
            return new Square(scanner.nextInt());
        }

        else if(shape.equalsIgnoreCase("rectangle")) {
            System.out.println("Enter length and width: ");
            return new Rectangle(scanner.nextInt(), scanner.nextInt());
        }

        else if(shape.equalsIgnoreCase("triangle")) {
            System.out.println("Enter base and height: ");
            return new Triangle(scanner.nextInt(), scanner.nextInt());
        }

        else {
            System.out.println("Shape not supported");
            return new NullShape();
        }
    }
}
