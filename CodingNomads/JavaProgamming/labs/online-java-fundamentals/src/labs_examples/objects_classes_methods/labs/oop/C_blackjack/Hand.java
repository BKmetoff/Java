package labs_examples.objects_classes_methods.labs.oop.C_blackjack;

import java.util.ArrayList;

public class Hand {
    private ArrayList<Card> cards = new ArrayList<>();
    private int scoreOfHand;

    public void addCardToHand (Card card) {
        if ( !isOver21(card.getNumericValue()) ) {
            updateScoreOfHand(card);
            cards.add(card);
        }

        System.out.println("Bust! Player's score is " + scoreOfHand);
    }

    public int getScoreOfHand () {
        return scoreOfHand;
    }

    private void updateScoreOfHand (Card newCard) {
        scoreOfHand += newCard.getNumericValue();
    }


    private boolean isOver21 (int newCardValue) {
        return (scoreOfHand + newCardValue) > 21;
    }

}
