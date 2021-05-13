package labs_examples.arrays.labs;

import java.util.ArrayList;

/**
 *  ArrayLists
 *
 *      Please demonstrate how to create an ArrayList, populate an array list, access elements within an ArrayList.
 *      Also take a moment to explore the many methods that are available to you when you use an ArrayList. By simply
 *      typing the dot operator (".") after the ArrayList object that you create. You should see a menu pop up that
 *      shows a list of methods.
 *
 */
public class Exercise_07 {
    public static void main(String[] args) {

        ArrayList<Integer> listOfInts = new ArrayList();

        listOfInts.add(4);
        listOfInts.add(6);

        listOfInts.remove(1);

        int fromList = listOfInts.get(0);
        System.out.println(fromList);

        boolean listIsEmpty = listOfInts.isEmpty();
        System.out.println(listIsEmpty);

        int sizeOfList = listOfInts.size();
        System.out.println(sizeOfList);
    }
}
