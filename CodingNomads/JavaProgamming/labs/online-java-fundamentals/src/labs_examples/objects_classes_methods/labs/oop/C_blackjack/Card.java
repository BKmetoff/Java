package labs_examples.objects_classes_methods.labs.oop.C_blackjack;

public class Card {

    private CardSuit cardSuit;
    private CardContent content;

    public Card(){}

    public void setCardSuit(CardSuit cardSuit) { this.cardSuit = cardSuit; }

    public void setCardFace(CardFace faceValue) { this.content = new CardContent(faceValue); }

    public void setNumericValue(int numericValue) {
        this.content = new CardContent(numericValue);
    }

    public int getNumericValue() { return this.content.getValue(); }

    @Override
    public String toString (){
        return content + " of " + cardSuit;
    }
}
