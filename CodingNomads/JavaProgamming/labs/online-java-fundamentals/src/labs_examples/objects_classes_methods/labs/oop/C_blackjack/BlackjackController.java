package labs_examples.objects_classes_methods.labs.oop.C_blackjack;

public class BlackjackController {
    public static void main(String[] args) {

        Deck newDeck = new Deck();

        Player johny = new Player("johny");

        deal(johny, newDeck);

    }

    private static void deal (Player player, Deck deck) {

        // return a number corresponding to a card in the deck
        int randomNumber = checkIfCardHasBeenUsed(deck);

        deck.addToUsedCards(randomNumber);
        Card cardForPlayerHand = deck.addCardToUserHand(randomNumber);
        player.hand.addCardToHand(cardForPlayerHand);
        System.out.println(cardForPlayerHand);
        
    }

    // runs recursively until an unused number (card) is found
    private static int checkIfCardHasBeenUsed(Deck deck) {
        int randomNumber = randomNumber();

        if (deck.getUsedCards().contains(randomNumber)) {
            checkIfCardHasBeenUsed(deck);
        }

        return randomNumber;
    }


    private static int randomNumber () {
        int min = 1;
        int max = 52;

        // the internet is undefeated
        return (int)Math.floor(Math.random() * (max - min + 1) + min);
    }
}
