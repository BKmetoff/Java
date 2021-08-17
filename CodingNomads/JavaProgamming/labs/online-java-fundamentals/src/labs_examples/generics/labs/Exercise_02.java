package labs_examples.generics.labs;

import java.util.ArrayList;

/**
 * Generics Exercise 2:*
 *      Create a class with a generic method that takes in an ArrayList of any Numeric type and returns the sum of all
 *      Numbers in the ArrayList
 */

class Exercise_02 {
    public static void main(String[] args) {
        ArrayList<Integer> intArray = new ArrayList<>();
        intArray.add(34);
        intArray.add(14);
        intArray.add(32);

        ClassWithGenericMethod newSum = new ClassWithGenericMethod();
        System.out.println(newSum.sumNumbers(intArray));

    }
}

class ClassWithGenericMethod {

    public <N extends Number> double sumNumbers (ArrayList<N> arrayOfNumbers) {
        double sum = 0;
        for (N num: arrayOfNumbers) {
            sum += num.intValue();
        }

        return sum;
    }
}
