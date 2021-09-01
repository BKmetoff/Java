package labs_examples.lambdas.labs;

import java.util.ArrayList;
import java.util.function.*;

/**
 * Lambdas Exercise 2:
 *
 *      1) Demonstrate the use of 10 pre-built Functional Interfaces from the java.util.functions package. That's right,
 *      10 of them! You can do it! You'll know so much about them when you're done!
 *
 */

class Exercise_02 {
    public static void main(String[] args) {

        // 1)
        calculateWithBiConsumer(43, 12, (a, b) -> System.out.println(a * b));
        calculateWithBiConsumer(5, 6, (a, b) -> System.out.println(a - b));

        // 2)
        BiFunction<Integer, Integer, ArrayList<Integer>> biFunction = (paramOne, paramTwo) -> {
            ArrayList<Integer> newList = new ArrayList<>();
            newList.add(paramOne);
            newList.add(paramTwo);
            return newList;
        };
        System.out.println(biFunction.apply(5, 6));

        // 3)
        BiPredicate<String, String> biPredicate = (strOne, strTwo) -> strOne.equals(strTwo);
        System.out.println(biPredicate.test("this", "that"));

        // 4)
        Supplier<String> printMessage = () -> "this is the message";
        printMessage.get();

        // 5)
        IntFunction<Integer> cubeInteger = (int number) -> number * number * number;
        System.out.println(cubeInteger.apply(3));
    }

    static <Integer> void calculateWithBiConsumer (
            Integer paramOne,
            Integer paramTwo,
            BiConsumer<Integer, Integer> biConsumer
        ) {
        biConsumer.accept(paramOne, paramTwo);
    }

}