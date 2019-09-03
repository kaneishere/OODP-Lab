package Tutorial2;

import java.util.Random;

public class Dice {
    private int valueOfDice;

    public Dice() {
//        setDiceValue();
        valueOfDice = 1;
    }

    public void setDiceValue() {
        valueOfDice = (new Random()).nextInt(6) + 1;
    }

    public int getValueOfDice() {
        return valueOfDice;
    }

    public void printDiceValue() {
        System.out.println("Current Value is " + getValueOfDice());
    }
}
