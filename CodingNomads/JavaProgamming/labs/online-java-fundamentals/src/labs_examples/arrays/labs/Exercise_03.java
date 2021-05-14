package labs_examples.arrays.labs;

/**
 *  2D Array
 *
 *      Create and populate a 5x5 2D array with multiples of 3, starting with 3. Once populated, print out the results.
 *
 *      The output should look something like this:
 *
 *      3 6 9 12 15
 *      18 21 24 27 30
 *      ...
 *      ...
 *      ...
 *
 */

public class Exercise_03 {

    public static void main(String[] args) {
        int rows, columns;
        int start = 3;
        int multiplicator = 1; // haXXX
        int array[][] = new int[5][5];

        for (rows = 0; rows < 5; rows++) {
            for (columns = 0; columns < 5; columns++) {
                array[rows][columns] = start * multiplicator;
                multiplicator++;
            }
        }

        for (rows = 0; rows < 5; rows++) {
            for (columns = 0; columns < 5; columns++) {
                System.out.print(array[rows][columns] + " | ");
            }
            System.out.println();
        }


    }
}
