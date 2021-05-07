package labs_examples.conditions_loops.labs;

/**
 * Conditions and Loops Exercise 8: do-while loop
 *
 *      Use a "do-while" loop print out every third number counting backwards from 1000 to 1.
 *
 */

public class Exercise_08 {
    public static void main(String[] args) {
        printThirdNumber(1000, 1);
    }

    private static void printThirdNumber(int from, int to) {
        int counter = 0;
        System.out.println(from);

        do {
            if (counter == 3) {
                System.out.println(from);
                counter = 0;
            }
            from--;
            counter++;
        } while (from >= to);
    }
}
