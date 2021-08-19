package labs_examples.enumerations.labs;

/**
 * Enumerations Exercise 1:
 *
 *      1) Create an enumeration. Use a controller class to demonstrate the use of the enum from a separate class.
 *      2) Create a parameterized enumeration that passes one or more values to its constructor. Demonstrate the use
 *      of this enum from a separate class.
 */

enum CardFaces {
    JACK(10, "Jack"),
    QUEEN(10, "Queen"),
    KING(10, "King"),
    ACE(1, "Ace");

    private int points;
    private String face;

    CardFaces(int points, String face) {
        this.points = points;
        this.face = face;
    }

    public int getPoints() {
        return points;
    }

    public String getFace() {
        return face;
    }
}

class Exercise_01 {
    public static void main(String[] args) {
        CardFaces ace = CardFaces.ACE;
        CardFaces king = CardFaces.KING;

        System.out.println(ace.getPoints() + ace.getFace());
        System.out.println(king.getPoints() + king.getFace());

    }
}