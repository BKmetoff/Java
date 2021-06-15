package labs_examples.objects_classes_methods.labs.oop.C_blackjack;

public enum CardFace {
    ACE,
    KING,
    QUEEN,
    JACK;

    public String toString() {
        return switch (this) {
            case ACE -> "Ace";
            case KING -> "King";
            case QUEEN -> "Queen";
            case JACK -> "Jack";
        };
    }

    public int getNumericValue() {
        return this == ACE
                ? 1
                : 10;
    }
}