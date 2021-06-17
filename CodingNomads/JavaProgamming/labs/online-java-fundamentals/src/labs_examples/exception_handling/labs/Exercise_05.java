package labs_examples.exception_handling.labs;

/**
 * Exception Handling Exercise 5:
 *
 *      Demonstrate how to throw an exception.
 *
 */

public class Exercise_05 {
    public static int tryCatch(int a, int b) throws ArithmeticException {

        if (a == 0  || b == 0) {
            System.out.println("faulty division");
            throw new ArithmeticException();
        } else {
            return a / b;
        }
    }
}

