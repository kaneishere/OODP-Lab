package Lab4;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
public class Numbers
{
    // --------------------------------------------
// Reads in an array of integers, sorts them,
// then prints them in sorted order.
// --------------------------------------------
    public static void main (String[] args)
    {

        // in order to make use of Sorting.selectionSort(Comparable list[]),
        // we need to make sure that the Objects contained in the array passed into the function
        // implements the Comparable interface. What was originally passed in was
        // an array of integer primitives, which are not objects. To make the function work,
        // we create Integer[], which is an object wrapper for the int primitive in java and implements
        // the comparable interface.

        Integer[] intList;
        int size;
        Scanner scan = new Scanner(System.in);
        System.out.print ("\nHow many integers do you want to sort? ");
        size = scan.nextInt();
        intList = new Integer[size];
        System.out.println ("\nEnter the numbers...");
        for (int i = 0; i < size; i++)
            intList[i] = scan.nextInt();

        Sorting.insertionSort(intList);
        System.out.println ("\nYour numbers in sorted order...");
        for (int i = 0; i < size; i++)
            System.out.print(intList[i] + " ");
        System.out.println ();
    }
}