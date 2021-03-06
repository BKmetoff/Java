package labs_examples.conditions_loops.labs;

/**
 * Conditions and Loops Exercise 10: continue
 *
 *      Demonstrate the use of the "continue" statement to skip to the next iteration of a loop.
 *
 */

public class Exercise_10 {
    public static void main(String[] args) {
        for (int i = 0; i < 30; i++) {
            if (i == 23) {
                System.out.println("Skip iteration here!");
                continue;
            }
            System.out.println(i);
        }
    }
}
