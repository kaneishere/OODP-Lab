package Lab4;

import java.util.Scanner;

public class Strings {
    public static void main(String[] arg) {
        String[] strings;
        Scanner sc = new Scanner(System.in);
        int size;
        System.out.print("How many strings do you want to sort? ");
        size = sc.nextInt();
        strings = new String[size];

        System.out.print("Enter the strings...");
        for(int i = 0;i<size;i++) {
            strings[i] = sc.next();
        }

        Sorting.insertionSort(strings);
        System.out.println("Your strings in sorted order...");
        for(String string:strings) {
            System.out.println(string);
        }

    }
}
