package labs_examples.objects_classes_methods.labs.oop.C_blackjack;

import java.util.ArrayList;

public class Deck {
//    private ArrayList<Integer> cards = new ArrayList<>();
    private ArrayList<Card> deckOfCards = new ArrayList<>();
    private ArrayList<Integer> usedCards = new ArrayList<>();

    public Deck () {
        // for each suit
        for (int cardSuit = 0; cardSuit < 4; cardSuit++) {

            // create numeric cards
            for (int numericValue = 1; numericValue <= 10; numericValue++) {
                Card numericCard = new Card();
                numericCard.setNumericValue(numericValue);
                numericCard.setCardSuit(cardSuit);

                deckOfCards.add(numericCard);
            }

            // create face cards
            for (int cardFace = 0; cardFace < 4; cardFace++) {
                Card faceCard = new Card();
                faceCard.setCardFace(cardFace);
                faceCard.setCardSuit(cardSuit);

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


}
