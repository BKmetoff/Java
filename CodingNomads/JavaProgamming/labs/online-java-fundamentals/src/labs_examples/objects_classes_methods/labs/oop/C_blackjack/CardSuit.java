package labs_examples.objects_classes_methods.labs.oop.C_blackjack;

public enum CardSuit {
    CLUBS,
    DIAMONDS,
    HEARTS,
    SPADES;

    public String toString() {
        return switch (this) {
            case CLUBS -> "♣";
            case DIAMONDS -> "♦";
            case HEARTS -> "♥";
            case SPADES -> "♠";
        };
    }
}