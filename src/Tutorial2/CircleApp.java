package Tutorial2;

import java.util.Scanner;

public class CircleApp {
    public static void main(String[] args) {
        System.out.println("====Circle Computation====");
        System.out.println("|1. Create a new Circle  |");
        System.out.println("|2. Print Area           |");
        System.out.println("|3. Print Circumference  |");
        System.out.println("|4. Quit                 |");
        System.out.println("==========================");
        System.out.println("Choose option (1 - 3):    ");

        Scanner scan = new Scanner(System.in);
        Circle circle = new Circle(10);
        int choice;
        do {
            choice = scan.nextInt();
            switch(choice){
                case 1:
                    System.out.println("Enter the radius to compute the area and circumference");
                    circle.setRadius(scan.nextInt());
                    System.out.println("A new circle is created");
                    break;

                case 2:
                    circle.printArea();
                    break;

                case 3:
                    circle.printCircumference();
                    break;

//                default:
//                    System.out.println("Usage: Enter choice 1 to 4");
//                    break;
            }
        } while(choice<4 && choice>0);
    }
}
