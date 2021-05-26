package labs_examples.objects_classes_methods.labs.oop.C_blackjack;

public class Card {
    private char[] suits = new char[]{'♠', '♦', '♥', '♣'};
    private String[] faces = {"Ace", "King", "Queen", "Jack"};

    private char cardSuit;
    private String cardFace;
    private int numericValue;


    public Card(){}

    public void setCardSuit(int suitValue) {
        this.cardSuit = suits[suitValue];
    }

    public void setCardFace(int faceValue) {
        this.cardFace = faces[faceValue];
    }

    public void setNumericValue(int numericValue) {
        this.numericValue = numericValue;
    }

    @Override
    public String toString() {
        return "Card{" +
                "cardSuit=" + cardSuit +
                ", cardFace='" + cardFace + '\'' +
                ", numericValue=" + numericValue +
                '}';
    }
}
