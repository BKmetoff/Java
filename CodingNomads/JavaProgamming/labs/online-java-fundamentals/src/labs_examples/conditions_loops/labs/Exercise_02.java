package labs_examples.conditions_loops.labs;

import java.util.Scanner;

/**
 * Conditions and Loops Exercise 2: Days of the week
 *
 *      Take in a number from the user and print "Monday", "Tuesday", ... "Sunday", or "Other"
 *      if the number from the user is 1, 2,... 7, or other respectively. Use an if-else statement
 *      to accomplish this task.
 * 
 *      Bonus Tricky Challenge: Use a "nested-if" statement.
 *
 */

public class Exercise_02 {

    public static void main(String[] args) {

        // 1) create scanner (don't forget to import Scanner!)
        Scanner scanner = new Scanner(System.in);

        // 2) prompt user
        System.out.println("enter a number corresponding to a day of the week: ");

        // 3) assign input to variable as int
        int day = scanner.nextInt();

        // 4) write completed code here

        if (day > 7) {
            System.out.println("other");
            return;
        }

        if (day < 4) {
            if (day == 1) {
                System.out.println("Monday");
            } else if (day == 2) {
                System.out.println("Tuesday");
            } else {
                System.out.println("Wednesday");
            }
        } else {
            if (day == 5) {
                System.out.println("Friday");
                return;
            } else  if (day == 6){
                System.out.println("Saturday");
                return;
            } else if (day == 7){
                System.out.println("Sunday");
                return;
            }

            System.out.println("Thursday");
            return;
        }


}}
