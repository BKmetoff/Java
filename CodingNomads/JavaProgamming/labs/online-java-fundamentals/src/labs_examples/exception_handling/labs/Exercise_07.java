package labs_examples.exception_handling.labs;

/**
 * Exception Handling Exercise 7:
 *
 *      1) Create a custom exception.
 *      2) Demonstrate a method throwing your custom exception.
 */

public class Exercise_07 {
    public static String nastyMethod (boolean shouldThrowNastyException) throws NastyException {
        if (shouldThrowNastyException) {
            throw new NastyException();
        } else {
            return "Not throwing nasty exception";
        }
    }
}

class NastyException extends Exception {
    @Override
    public String toString() {
        return "this is a nasty exception";
    }
}