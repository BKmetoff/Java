package labs_examples.objects_classes_methods.labs.methods;

import java.util.ArrayList;
import java.util.Arrays;

public class MethodTraining {

    public static void main(String[] args) {
//        System.out.println(countConsonants("blahe"));
//        System.out.println(returnLargest(12, 345, 768, 1));
//        System.out.println(isPrimeNumber(10));
//        System.out.println(Arrays.toString(returnSmallestAndLargest(new int[]{12, 4, 5, 65, 8, -1})));
//        System.out.println(divisibleByMultipleDividers(100, 4, 9));

        int[] arrayOfNums = {1, 2, 3, 4, 5};
        reverseArray(arrayOfNums);
    }


    // 1) ======================================
    public static int multiply(int a, int b) {
        return a * b;
    }

    public static double multiply(double a, double b) {
        return a * b;
    }
    // 1) ======================================


    // 3) ======================================
    public static int returnLargest(int...args) {
        int largestArg = 0;

        for (int arg : args) {
            if (arg > largestArg)
                largestArg = arg;
        }
        return largestArg;
    }
    // 3) ======================================


    // 4) ======================================
    public static int countConsonants(String str) {
        int vowelCount = 0;
        String[] vowels = {"a", "e", "i", "u", "o"};

        for (String vowel : vowels) {
            if (str.contains(vowel)) {
                vowelCount++;
            }
        }
        return vowelCount;
    }
    // 4) ======================================

    // 5) ======================================
    public static String isPrimeNumber(int number) {
        String result;
        if (number <= 1 ) {
            result = "it's not";
            return result;
        }

        if (number % 2 != 0 & number % 3 != 0) {
            result = "it is";
        } else {
            result = "it's not";
        }
        return result;
    }
    // 5) ======================================


    // 6) ======================================
    public static int[] returnSmallestAndLargest(int[] numArray) {
        int[] result = new int[2];
        int smallest = numArray[0];
        int largest = smallest;

        for (int number : numArray) {
            if (number < smallest) {
                smallest = number;
            }

            if (number > largest) {
                largest = number;
            }
        }

        result[0] = smallest;
        result[1] = largest;

        return result;
    }
    // 6) ======================================


    // 7) ======================================
    public static ArrayList<Integer> divisibleByMultipleDividers(int maxNum, int divisor1, int divisor2) {
        ArrayList<Integer> listOfDivisibleNumbers = new ArrayList<>();

        for (int iterator = 0;iterator < maxNum; iterator++) {
            if (iterator % divisor1 == 0 & iterator % divisor2 == 0) {
                listOfDivisibleNumbers.add(iterator);
            }
        }

        return listOfDivisibleNumbers;
    }
    // 7) ======================================


    // 8) ======================================
    public static void reverseArray(int[] arrayOfNums) {
        int temp;


        for (int i = 0; i < arrayOfNums.length / 2; i++) {
            temp = arrayOfNums[i];

            arrayOfNums[i] = arrayOfNums[arrayOfNums.length - i - 1];
            arrayOfNums[arrayOfNums.length - i - 1] = temp;
        }

        System.out.println(Arrays.toString(arrayOfNums));

    }
    // 8) ======================================

}
