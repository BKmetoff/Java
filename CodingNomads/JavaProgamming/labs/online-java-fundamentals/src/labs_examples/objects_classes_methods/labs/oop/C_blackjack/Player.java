package labs_examples.objects_classes_methods.labs.oop.C_blackjack;

public class Player {
    private String name;
    Hand hand = new Hand();

    public Player(){}
    public Player(String name){
        this.name = name;
    }

    // computerAI method from instructions
    public boolean wantsAnotherCard () {
        return hand.getScoreOfHand() < 16;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Hand getHand() {
        return hand;
    }
}
