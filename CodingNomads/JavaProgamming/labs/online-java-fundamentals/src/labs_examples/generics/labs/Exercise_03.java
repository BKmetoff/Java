package labs_examples.generics.labs;

/**
 * Generics Exercise 3:
 *
 *      1) Write a generic method that accepts two generic arguments. This generic method should only accept
 *      arguments which are subclasses of Number. The generic method must return the sum (as a double) of whatever two
 *      numbers were passed in regardless of their type.
 *
 *      2) Write a generic method to count the number of elements in a "Collection" of Strings that are palindromes
 *
 *      3) Write a generic method to exchange the positions of two different elements in an array.
 *
 *      4) Write a generic method to find the largest element within the range (begin, end) of a list.
 *
 */

class Exercise_03 {
    public static void main(String[] args) {



    }

    // 1)
    public <N extends Number, M extends Number> double sumNumbers (N numN, M numM) {
        return numM.doubleValue() + numN.doubleValue();
    }

    // 2)
    public static <S extends String> int countElementsInPalindromesCollection(S[] stringsCollection) {
        return stringsCollection.length;
    }

    // 3)
    public static <A> A[] swapPossitions(A[] arrayOfStuff, int position1, int position2) {
        try {
            A element1 = arrayOfStuff[position1];
            arrayOfStuff[position1] = arrayOfStuff[position2];
            arrayOfStuff[position2] = element1;
        } catch (ArrayIndexOutOfBoundsException exception) {
            exception.printStackTrace();
        }


        return arrayOfStuff;
    }

    // 4) - what does this mean!?

}