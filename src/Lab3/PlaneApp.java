package Lab3;

import java.util.Scanner;

public class PlaneApp {
    private static final Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {
        Plane plane = new Plane();

        System.out.println("Select an option: ");
        System.out.println("(1) Show number of empty seats ");
        System.out.println("(2) Show the list of empty seats ");
        System.out.println("(3) Show the list of seat assignments by seat ID ");
        System.out.println("(4) Show the list of seat assignments by customer ID ");
        System.out.println("(5) Assign a customer to a seat ");
        System.out.println("(6) Remove a seat assignment ");
        System.out.println("(7) Exit ");
        System.out.print("      Enter the number of your choice: ");

        int choice = scanner.nextInt();
        while(choice<7) {
            switch(choice) {
                case 1:
                    plane.showNumEmptySeats();
                    break;
                case 2:
                    plane.showEmptySeats();
                    break;
                case 3:
                    plane.showAssignedSeats(true);
                    break;
                case 4:
                    plane.showAssignedSeats(false);
                    break;
                case 5:
                    System.out.println("    Assigning Seat .. ");
                    System.out.print("      Please enter SeatID: ");
                    int seatId = scanner.nextInt();
                    System.out.print("      Please enter Customer ID: ");
                    int custId = scanner.nextInt();
                    plane.assignSeat(seatId, custId);
                    System.out.println("    Seat Assigned!");
                    break;
                case 6:
                    System.out.print("      Enter SeatID to unassign customer from: ");
                    seatId = scanner.nextInt();
                    plane.unAssignSeat(seatId);
                    System.out.println("    Seat Unassigned!");
                    break;
                default:
                    System.out.println("Number not supported. Enter a number from 1 to 7. ");
                    break;
            }
            System.out.println();
            System.out.print("      Enter the number of your choice: ");
            choice = scanner.nextInt();
        }
    }
}
