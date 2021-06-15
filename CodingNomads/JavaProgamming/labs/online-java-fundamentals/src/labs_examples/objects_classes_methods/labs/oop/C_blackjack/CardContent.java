package labs_examples.objects_classes_methods.labs.oop.C_blackjack;

public class CardContent  {
    private int value;
    private CardFace face;

    public CardContent(int value) {
        this.value = value;
    }

    public CardContent(CardFace face) {
        this.face = face;
        this.value = face.getNumericValue();
    }

    public int getValue() {
        return value;
    }

    @Override
    public String toString() {
        return  this.face != null
                ? this.face.toString()
                : String.valueOf(this.value);
    }
}

