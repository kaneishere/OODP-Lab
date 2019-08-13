package Lab1;

import java.util.Scanner;

public class P3 {
    private static final double CONVERSION_RATE = 1.82;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] starting = new int[3];
        int[] ending = new int[3];
        int[] increment = new int[3];
        for(int i = 0; i<3; i++) {
            System.out.print("(" + (i+1) +")" + " starting : ");
            starting[i] = scanner.nextInt();
            System.out.print(", ending : ");
            ending[i] = scanner.nextInt();
            System.out.print(", increment : ");
            increment[i] = scanner.nextInt();
            System.out.println();
        }

        // Print using for loop
        if(starting[0]>ending[0]) {
            System.out.println("Error input!!");
        }
        else {
            System.out.println("(1) starting : " + starting[0] + ", ending : " + ending[0] + ", increment : " + increment[0]);
            System.out.println("US$         S$");
            System.out.println("--------------");
            for (int i = starting[0]; i <= ending[0]; i += increment[0]) {
                System.out.printf("%-2d          %02.2f\n", i, i*CONVERSION_RATE);
            }
        }

        // Print using while loop
        if(starting[1]>ending[1]) {
            System.out.println("Error input!!");
        }
        else {
            System.out.println("(2) starting : " + starting[1] + ", ending : " + ending[1] + ", increment : " + increment[1]);
            System.out.println("US$         S$");
            System.out.println("--------------");
            int amount = starting[1];
            while (amount <= ending[1]) {
                System.out.printf("%-2d          %02.2f\n", amount, amount*CONVERSION_RATE);
                amount += increment[1];
            }
        }
        // Print using do-while loop
        if(starting[2]>ending[2]) {
            System.out.println("Error input!!");

        }

        else {
            System.out.println("(3) starting : " + starting[2] + ", ending : " + ending[2] + ", increment : " + increment[2]);
            System.out.println("US$         S$");
            System.out.println("--------------");
            int amount = starting[2];
            do {
                System.out.printf("%-2d          %02.2f\n", amount, amount*CONVERSION_RATE);
                amount += increment[2];
            } while (amount <= ending[2]);
        }
    }
}
