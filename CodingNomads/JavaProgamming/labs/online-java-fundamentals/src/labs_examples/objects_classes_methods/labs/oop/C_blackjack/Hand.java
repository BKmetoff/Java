package labs_examples.objects_classes_methods.labs.oop.C_blackjack;

import java.util.ArrayList;

public class Hand {
    private ArrayList<Card> cards = new ArrayList<>();
    private int scoreOfHand;

    public void addCardToHand(Card card) {
        updateScoreOfHand(card);
        cards.add(card);
    }

    public int getScoreOfHand() {
        return scoreOfHand;
    }

    private void updateScoreOfHand(Card newCard) {
        scoreOfHand += newCard.getNumericValue();
    }
}
