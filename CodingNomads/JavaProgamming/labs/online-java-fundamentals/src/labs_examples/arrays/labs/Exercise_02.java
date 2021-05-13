package labs_examples.arrays.labs;

import java.util.Arrays;
import java.util.Scanner;

/**
 *  More labs_examples.arrays
 *
 *      Using the array below, take in a number from 1-10 from the user and print out the index of that
 *      element.
 *
 */

public class Exercise_02 {

    public static void main(String[] args) {

        int[] array = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};

        // write code here
        findIndex(array, getUserInput(array));

    }

    private static void findIndex(int[] array, int userInput) {
        for (int i = 0; i < array.length; i++) {
            if (userInput == array[i]) {
                System.out.println("the index of this number is : " + i);
            }
        }
    }

    private static int getUserInput( int[] array) {
        Scanner userInput = new Scanner(System.in);
        int input = array.length + 1;

        while (input > array.length) {
            System.out.println("Enter a number between 1 & 10: ");
            input = userInput.nextInt();
        }
        return input;
    }
}