package labs_examples.conditions_loops.labs;

import java.util.Scanner;

/**
 * Conditions and Loops Exercise 5: Calculator
 *
 *      Take two numbers from the user, an upper and lower bound. Using a "for-loop", calculate the sum
 *      of numbers from the lower bound to the upper bound. Also, calculate the average of numbers.
 *      Print the results to the console.
 *
 *      For example, if a user enters 1 and 100, the output should be:
 *
 *      The sum is: 5050
 *      The average is: 50.5
 *
 *
 */

public class Exercise_05 {
    public static void main(String[] args) {
        Scanner scannerLower = new Scanner(System.in);

        System.out.println("enter lower bound: ");
        float lowerBound = scannerLower.nextInt();

        System.out.println("enter upper bound: ");
        float upperBound = scannerLower.nextInt();

        System.out.println("sum is: " + sum(lowerBound, upperBound));
        System.out.println("average is: " + average(lowerBound, upperBound));
    }

    private static float average(float lowerBound, float upperBound) {
        return ((lowerBound + upperBound) / 2);
    }

    private static int sum(float lowerBound, float upperBound) {
        int sum = 0;
        float iterator = lowerBound;

        for (; iterator <= upperBound; iterator++) {
            sum += iterator;
        }

        return sum;
    }
}
