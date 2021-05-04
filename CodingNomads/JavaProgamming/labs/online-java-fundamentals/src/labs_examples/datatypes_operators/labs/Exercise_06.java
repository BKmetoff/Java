package labs_examples.datatypes_operators.labs;

/**
 * Fundamentals Exercise 4: Volume and Surface Area
 *
 *      Write the necessary code to calculate the volume and surface area of a cylinder
 *      with a radius of 3.14 and a height of 5. Print out the result.
 *
 */

public class Exercise_06 {

    public static void main(String[] args) {

        // write code here

        float radius = 3.14f;
        short height = 5;

        float pi = 3.14f;

        float volume = pi * (radius * radius) * height;
        double surfaceArea = (2 * pi) * (radius * radius) + (2 * pi) * radius * height;

        String output = String.format("Volume: %.2f, Surface area: %.2f", volume, surfaceArea);
        System.out.println(output);
    }
}