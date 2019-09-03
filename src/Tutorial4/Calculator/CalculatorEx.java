package Tutorial4.Calculator;

import java.util.Scanner;

public class CalculatorEx {
    private double result = 0.0;

    public static final Scanner scan = new Scanner(System.in);
    public double resultValue() { return result; }

    public void doCalculation() {
        System.out.println("result = " + resultValue());
        char op = scan.next().charAt(0);
        double value;
        while(op != 'q') {
            try{
                value = scan.nextDouble();
                result = evaluate(op, value, result);
                System.out.printf("result %c %.1f = %.1f\n", op, value, result);
            } catch(UnknownOperatorException e) {
                System.out.println(e.getMessage());
                handleUnknownOpException();
            } finally {
                System.out.printf("updated result = %.1f\n", resultValue());
                op = scan.next().charAt(0);

            }
        }
        System.out.printf("Final result = %.1f\n", resultValue());
    }

    public double evaluate(char op, double result, double value) throws UnknownOperatorException{
        switch(op) {
            case '+':
                return result + value;

            case '-':
                return result - value;

            case '/':
                return result / value;

            case '*':
                return result * value;

            default:
                throw new UnknownOperatorException(op);
        }
    }

    private double handleUnknownOpException() {
        System.out.println("Please reenter: ");
        return 0;
    }

    public static void main(String[] args) {
        CalculatorEx cal = new CalculatorEx();
        System.out.println("Calculator is on");
        cal.doCalculation();
        System.out.println("End of Program");
    }

}
