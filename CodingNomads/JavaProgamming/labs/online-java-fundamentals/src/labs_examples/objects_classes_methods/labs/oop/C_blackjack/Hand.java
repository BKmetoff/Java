package labs_examples.objects_classes_methods.labs.oop.C_blackjack;

import java.util.ArrayList;

public class Hand {
    private ArrayList<Card> cards = new ArrayList<>();
    private int handValue;

    public void addCardToHand (Card card) {
        cards.add(card);
    }

}
