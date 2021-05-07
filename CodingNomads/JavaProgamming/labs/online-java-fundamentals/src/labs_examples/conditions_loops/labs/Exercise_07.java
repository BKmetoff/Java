package labs_examples.conditions_loops.labs;

import java.util.Scanner;

/**
 * Conditions and Loops Exercise 7: First vowel
 *
 *      Take in a word from the user and using a "while" loop, find the first vowel in the word.
 *      Once you find the vowel, print out the word and the first vowel.
 *
 *      Hints:
 *          - there are a few helpful methods in the String class called length(), charAt() and indexOf()
 *          - you'll likely want to use a String that contains all the vowels:
 *              - ie: String vowels = "aeiou";
 *
 */

public class Exercise_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a word: ");
        String word = scanner.nextLine();

        String vowels = "aeiou";
        int counter = 0;

        while (counter < word.length()) {
            char currentChar = word.charAt(counter);
            if (vowels.contains(Character.toString(currentChar))) {
                System.out.println("your word: " + word + ", first vowel: " + currentChar);
                break;
            }
            counter++;
        }
    }
}
