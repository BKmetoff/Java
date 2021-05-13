package labs_examples.arrays.labs;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Arrays calculator
 *
 *      Take in 10 numbers from the user. Place the numbers in an array. Using the loop of your choice,
 *      calculate the sum of all of the numbers in the array as well as the average.
 *
 *      Print the results to the console.
 *
 */

public class Exercise_01 {

    public static void main(String[] args) {

        Scanner iteratorInput = new Scanner(System.in);
        System.out.println("how many numbers are we workin' with?");
        int iterator = iteratorInput.nextInt();

        int sum = getSum(populateArray(iterator));
        float average = getAverage(iterator, sum);

        System.out.println("sum is: " + sum);
        System.out.println("average is: " + average);
    }

    private static ArrayList populateArray(int iterator) {
        ArrayList<Integer> userNumbers = new ArrayList<>();
        Scanner userInput = new Scanner(System.in);

        while (userNumbers.size() < iterator) {
            System.out.println("Enter number #: " + (userNumbers.size() + 1));
            int currentNumber = userInput.nextInt();
            userNumbers.add(currentNumber);
        }
        return userNumbers;
    }

    private static int getSum(ArrayList array) {
        int sum = 0;
        for (Object number : array) {
            sum += (int) number;
        }
        return sum;
    }

    private static int getAverage(int numOfElements, int sumOfElements) {
        return  sumOfElements / numOfElements;
    }
}