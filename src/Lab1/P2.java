package Lab1;

import java.util.Scanner;

public class P2 {
    public static void main(String[] args) {
    	int salary;
    	int points;
        Scanner scanner  = new Scanner(System.in);
        
        System.out.println("Enter the salary: ");
        salary = scanner.nextInt();
        System.out.println("Enter the points: ");
        
        points = scanner.nextInt();
        char grade;
        if(salary>=800 && salary<=899) grade = 'A';

        else if(salary>=700 && salary<=799) {
            grade = 'B';
            if(points>=20) {
                grade = 'A';
            }
        }
        else if(salary>=650) grade = 'B';

        else if(salary>=600) {
            grade = 'C';
            if(points>=10) {
                grade = 'B';
            }
        }

        else grade = 'C';

        System.out.println("Grade " + grade);

        
    }
}
