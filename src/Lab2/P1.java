package Lab2;

import java.util.Scanner;
public class P1{
    public static void main(String[] args)
    {
        int choice;
        Scanner sc = new Scanner(System.in);
        do {

            System.out.println("Perform the following methods:");
            System.out.println("1: multiplication test");
            System.out.println("2: quotient using division by subtraction");
            System.out.println("3: remainder using division by subtraction");
            System.out.println("4: count the number of digits");
            System.out.println("5: position of a digit");
            System.out.println("6: extract all odd digits");
            System.out.println("7: quit");
            choice = sc.nextInt();
            int m, n;
            switch (choice) {
                case 1: /* add mulTest() call */
                    mulTest();
                    break;
                case 2: /* add divide() call */
                    System.out.println("Please enter dividend and divisor: ");
                    m = sc.nextInt();
                    n = sc.nextInt();
                    System.out.printf("%d/%d = %d\n",m,n,divide(m,n));
                    break;
                case 3: /* add modulus() call */
                    System.out.println("Please enter dividend and divisor: ");
                    m = sc.nextInt();
                    n = sc.nextInt();
                    System.out.printf("%d %% %d = %d\n",m,n,modulus(m,n));
                    break;
                case 4: /* add countDigits() call */
                    System.out.println("Please enter a number ");
                    int num = sc.nextInt();
                    if(num>=0) {
                       System.out.printf("n : %d - count = %d\n", num, countDigits(num));
                       break;
                    }
                    System.out.println("Error! Number must be non-negative");
                    break;
                case 5: /* add position() call */
                    System.out.println("Enter number and digit: ");
                    int result = position(sc.nextInt(), sc.nextInt());
                    System.out.printf("position = %d\n", result);
                    break;
                case 6: /* add extractOddDigits() call */
                    System.out.println("Enter a number ");
                    long extract = sc.nextLong();
                    if(extract<0) System.out.println("Error input!!");
                    else System.out.printf("oddDigits = %d\n", extractOddDigits(extract));
                    break;
                case 7: System.out.println("Program terminating ….");
            }
        } while (choice < 7);
    }
    /* add method code here */
    public static void mulTest() {
        Scanner scan = new Scanner(System.in);
        int score = 0;
        for(int i = 0; i<5; i++) {

            int num1 = (int) (Math.random() * 10);
            int num2 = (int) (Math.random() * 10);
            System.out.printf("How much is %d times %d? ", num1, num2);
            if(scan.nextInt()==num1*num2) score++;
        }
        System.out.printf("%d answers out of 5 are correct.", score);
    }

    public static int divide(int m, int n) {
        int quotient = 0;
        if(m < 0) m = -m;
        while(m>=n) {
            m -= n;
            quotient++;
        }
        return quotient;
    }

    public static int modulus(int m, int n) {
        while(m>=n) {
            m -= n;
        }
        return m;
    }

    public static int countDigits(int n) {
        int num = 0;
        while(n>0) {
            n /= 10;
            num++;
        }
        return num;
    }

    public static int position(int n, int digit) {
        int count = 1;
        while(n>0) {
            if(n%10==digit) {
                return count;
            }
            count++;
            n/=10;
        }
        return -1;
    }

    public static long extractOddDigits(long n) {
    
        if(n%2==0) {
            return -1;
        }
        int power = 0;
        int result = 0;
        while(n>0) {
            if(n%2==1) {
                result += (n%10) * (int) (Math.pow(10, (double)(power++)));
            }
            n /= 10;
        }
        return result;
    }

}