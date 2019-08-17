package Lab4.Polymorphism;

import java.util.Scanner;

public class Shape2DApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Shape[] figure;
        System.out.println("Welcome to Shape2D!");
        System.out.print("Enter the total number of shapes: ");
        int total = scanner.nextInt();
        figure = new Shape[total];
        ShapeFactory shapeFactory = ShapeFactory.getFactory();

        for (int i = 0; i < total; i++) {
            System.out.print("Enter shape: ");
            figure[i] = shapeFactory.make(scanner.next());
        }

        int totalArea = 0;

        for (Shape shape : figure) {
            totalArea += shape.getArea();
        }

        System.out.println("The total area is " + totalArea);

    }
}
