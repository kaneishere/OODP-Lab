package Tutorial2;

import java.util.Scanner;

public class DiceApp {
    public static void main(String[] args) {
        Dice[] dices = new Dice[2];
        dices[0] = new Dice();
        dices[1] = new Dice();
        Scanner scan = new Scanner(System.in);

        System.out.println("Press <key> to roll the first first dice");
        scan.next();
        dices[0].setDiceValue();
        dices[0].printDiceValue();
        System.out.println("Press <key> to roll the second dice");
        scan.next();
        dices[1].setDiceValue();
        dices[1].printDiceValue();
        System.out.println("Your total number is: " + (dices[0].getValueOfDice() + dices[1].getValueOfDice()));
    }
}
