package labs_examples.exception_handling.labs;

/**
 * Exception Handling Exercise 1:
 *      1) Demonstrate a try/catch.
 */

public class Exercise_01 {
    public static int tryCatch(int a, int b) {
        try {
            return a / b;
        } catch (ArithmeticException e) {
            return  -1;
        }
    }
}

