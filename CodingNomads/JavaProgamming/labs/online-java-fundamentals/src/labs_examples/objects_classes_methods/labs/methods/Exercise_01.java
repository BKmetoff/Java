package labs_examples.objects_classes_methods.labs.methods;

import java.util.ArrayList;

/**
 * Created by ryandesmond - https://codingnomads.co
 */
public class Exercise_01 {

    public static void main(String[] args) {

        // please create the methods as instructed below then
        // call each of those methods from here, within the main()

        ArrayList <Integer> returns = new ArrayList<>();

        returns.add(multiply(3, 8));
        returns.add(divide(24, 6));
        printJoke();
        returns.add(secondsInAYear(2));
        returns.add(lenghtOfArgs(1, 2, 3, 4, 5));

        for (int methodReturn : returns) {
            System.out.println(methodReturn);
        }

    }


    // 1) Create a static multiply() method below that takes two int arguments (int a, int b) and
    //    returns the result of a * b

    public static int multiply(int a, int b) {
        return a * b;
    }

    // 2) Create a static divide() method below that takes two int arguments (int a, int b) and
    //    returns the result of a / b
    public static int divide(int a, int b) {
        return a / b;
    }

    // 3) Create a static void method that will print of joke of your choice to the console
    public static void printJoke() {
        System.out.println("Two 360s walk into a bar...");
    }

    // 4) Create a static method that takes in a number in years (int years) as an argument
    //    and returns the number of seconds that number in years represents
    public static int secondsInAYear(int year) {
        int seconds, days;

        days = year * 365;
        seconds = days * 24 * 360;

        return seconds;
    }

    // 5) Create a varargs method that will return the length of the varargs array passed in
    public static int lenghtOfArgs(int... args) {
        int count = 0;
        for (int arg : args) {
            count++;
        }

        return count;
    }







}
