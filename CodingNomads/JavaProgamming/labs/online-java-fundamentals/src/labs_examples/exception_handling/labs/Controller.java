package labs_examples.exception_handling.labs;

public class Controller {

    public static void main(String[] args) throws NastyException {
        System.out.println(Exercise_01.tryCatch(24, 2));
        System.out.println(Exercise_03.tryCatch(24, 0));

        exercise_05();

        exercise_07(true);
        exercise_07(false);
    }

    public static void exercise_07 (boolean shouldThrow) {
        try {
            System.out.println(Exercise_07.nastyMethod(shouldThrow));
        } catch (NastyException e) {
            System.out.println(e.toString());
        }
    }

    public static void exercise_05 () {
        try {
            System.out.println(Exercise_05.tryCatch(24, 0));
        } catch (ArithmeticException e) {
            System.out.println(e.toString());
        }
    }
}
