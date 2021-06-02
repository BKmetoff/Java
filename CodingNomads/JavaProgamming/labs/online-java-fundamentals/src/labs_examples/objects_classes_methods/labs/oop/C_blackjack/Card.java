package labs_examples.objects_classes_methods.labs.oop.C_blackjack;

import java.util.Arrays;

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

    public String getCardFace() {
        return cardFace;
    }

    public void setNumericValue(int numericValue) {
        this.numericValue = numericValue;
    }

    public int getNumericValue() {
        return this.numericValue;
    }

    public String printCard (){
        String faceOrNumeric = Arrays.asList(faces).contains(cardFace)
                ? cardFace
                : String.valueOf(numericValue);

        return faceOrNumeric + " of " + cardSuit;
    }
}
