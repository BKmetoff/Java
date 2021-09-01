package labs_examples.lambdas.labs;

import java.util.function.BiFunction;
import java.util.function.Predicate;

/**
 * Lambdas Exercise 1:
 *
 *      1) Demonstrate creating a functional interface with an abstract method that takes no parameters and returns void
 *
 *      2) Implement the previous functional interface with a lambda expression and use it. Also demonstrate creating
 *          an anonymous inner class from this interface.
 *
 *      3) Demonstrate creating a functional interface with an abstract method that takes 1 parameter and returns a
 *          value of the same type as the parameter
 *
 *      4) Implement the previous functional interface with a lambda expression and use it. Also demonstrate creating
 *          an anonymous inner class from this interface.
 *
 *      5) Demonstrate creating a functional interface with an abstract method that takes 2 parameters and returns a
 *          value
 *
 *      6) Implement the previous functional interface with a lambda expression and use it. Also demonstrate creating
 *          an anonymous inner class from this interface.
 *
 *      7) Demonstrate the use of at least two built-in functional interfaces from the java.util.function package.
 */

// 1)
@FunctionalInterface
interface ReturnVoid {
     void returnsVoid (String str);
}

// 3)
@FunctionalInterface
interface ReturnSameTypeAsParameter {
    double squareRoot (double dbl);
}

// 5)
@FunctionalInterface
interface TwoParameters {
   double sum (double a, double b);
}

class Exercise_01 {

    public static void main(String[] args) {

        // 2)
        ReturnVoid returnVoid = (String x) -> System.out.println(x);
        returnVoid.returnsVoid("print this");

        ReturnVoid anonymousVoid = new ReturnVoid() {
            @Override
            public void returnsVoid(String str) {
                System.out.println("printing from anonymous class" + str);
            }
        };
        anonymousVoid.returnsVoid(" ...cool");

        // 4)
        ReturnSameTypeAsParameter returnSame = (double dbl) -> Math.sqrt(dbl);
        System.out.println(returnSame.squareRoot(3));

        // 6)
        TwoParameters twoParameters = (double a, double b) -> a + b;
        System.out.println(twoParameters.sum(1.2, 1.5));

        // 7)
        BiFunction<Integer, Integer, Integer> newBiFuncion = (firstInt, secondInt) -> firstInt * secondInt;
        System.out.println(newBiFuncion.apply(6, 7));

        Predicate<Integer> newPredicate = (parameter) -> parameter % 2 == 0;
        System.out.println(newPredicate.test(5));

    }
}

