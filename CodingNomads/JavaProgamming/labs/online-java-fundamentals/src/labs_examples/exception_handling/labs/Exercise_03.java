package labs_examples.exception_handling.labs;

/**
 * Exception Handling Exercise 3:
 *
 *      Demonstrate a try/catch/finally block.
 *
 */

public class Exercise_03 {
    public static int tryCatch(int a, int b) {
        try {
            return a / b;
        } catch (ArithmeticException e) {
            return  -1;
        } finally {
            System.out.println("your mom");
        }
    }
}

