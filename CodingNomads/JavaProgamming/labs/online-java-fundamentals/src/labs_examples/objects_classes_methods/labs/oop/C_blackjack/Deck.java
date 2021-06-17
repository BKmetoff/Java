package labs_examples.objects_classes_methods.labs.oop.C_blackjack;

import java.util.ArrayList;

public class Deck {
//    private ArrayList<Integer> cards = new ArrayList<>();
    private ArrayList<Card> deckOfCards = new ArrayList<>();
    private ArrayList<Integer> usedCards = new ArrayList<>();
    private static int totalUsedCards;

    public Deck () {
        // for each suit
        for (CardSuit cardSuit : CardSuit.values()) {

            // create numeric cards
            for (int numericValue = 2; numericValue <= 10; numericValue++) {
                Card numericCard = new Card();
                numericCard.setNumericValue(numericValue);
                numericCard.setCardSuit(cardSuit);

                deckOfCards.add(numericCard);
            }

            // create face cards
            for (CardFace cardFace: CardFace.values()) {
                Card faceCard = new Card();
                faceCard.setCardSuit(cardSuit);
                faceCard.setCardFace(cardFace);

                deckOfCards.add(faceCard);
            }
        }
    }

    public ArrayList<Integer> getUsedCards() {
        return usedCards;
    }

    public void addToUsedCards (int dealtCard) { usedCards.add(dealtCard); }

    public Card addCardToUserHand (int cardPosition) {
        return deckOfCards.get(cardPosition);
    }

    // for exercise purposes
    public void countUsedCards () {
        totalUsedCards++;
    }
}
