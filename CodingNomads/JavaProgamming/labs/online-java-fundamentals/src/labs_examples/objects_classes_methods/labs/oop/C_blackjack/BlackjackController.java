package labs_examples.objects_classes_methods.labs.oop.C_blackjack;

import java.util.Scanner;

public class BlackjackController {
    public static void main(String[] args) {
        Deck newDeck = new Deck();
        Player computer = new Player("BlackJacknator");
        Player humanoid = new Player();
        Scanner scanner = new Scanner(System.in);

        playBlackJack(newDeck, humanoid, computer, scanner);

    }

    private static void playBlackJack(Deck deck, Player humanoid, Player computer, Scanner scanner) {

        System.out.print("Enter your name: ");
        humanoid.setName(scanner.nextLine());

        System.out.println("======== Game starts! =======");
        System.out.println("== " + humanoid.getName() + " vs. " + computer.getName() + " ==");
        System.out.println("=============================\n");

        gameUI(deck, humanoid, computer, scanner);

    }

    private static void gameUI (Deck deck, Player humanoid, Player computer, Scanner scanner) {

        // initial draw
        dealCardAndPrintScore(humanoid, deck);
        dealCardAndPrintScore(computer, deck);

        System.out.print("\nDraw another card? y/n: ");

        while (scanner.nextLine().equalsIgnoreCase("y")) {
            System.out.println();

            dealCardAndPrintScore(humanoid, deck);

            if (computer.wantsAnotherCard()) {
                dealCardAndPrintScore(computer, deck);
            } else {
                System.out.println(computer.getName() + " does not draw another card!");
                System.out.println("Current hand value: " + computer.getHand().getScoreOfHand());
                System.out.println("================================\n");
            }

            if (humanoid.getHand().getScoreOfHand() > 21 || computer.getHand().getScoreOfHand() > 21) {

                Player bustedPlayer = humanoid.getHand().getScoreOfHand() > 21
                        ? humanoid
                        : computer;

                System.out.println(
                        bustedPlayer.getName() +
                        " busts! Score: " +
                        bustedPlayer.getHand().getScoreOfHand() +
                        "\n================================\n"
                );

                // exit loop to end game
                break;
            } else {
                System.out.print("Draw another card? y/n: ");
            }
        }

        endGame(humanoid, computer);
    }


    private static void dealCardAndPrintScore(Player player, Deck deck) {
        System.out.println(player.getName() + " draws:");
        deal(player, deck);
        System.out.println("Current hand value: " + player.getHand().getScoreOfHand());
        System.out.println("================================\n");
    }

    private static void deal (Player player, Deck deck) {

        // return a number corresponding to a card in the deck
        int randomNumber = checkIfCardHasBeenUsed(deck);

        // ensure the same card won't be drawn again
        deck.addToUsedCards(randomNumber);

        deck.countUsedCards();

        Card cardForPlayerHand = deck.addCardToUserHand(randomNumber);

        System.out.println(cardForPlayerHand);
        player.hand.addCardToHand(cardForPlayerHand);
    }

    private static String determineWinner(Player playerOne, Player playerTwo) {

        int playerOneScore = playerOne.getHand().getScoreOfHand();
        int playerTwoScore = playerTwo.getHand().getScoreOfHand();

        if (playerOneScore > 21) {
            return playerTwo.getName();
        }

        if (playerTwoScore > 21) {
            return playerOne.getName();
        }

        if (playerOneScore == playerTwoScore) {
            return "Nobody ";
        }

        // whoever is closer to 21 wins
        return 21 - playerOneScore < 21 - playerTwoScore
                ? playerOne.getName()
                : playerTwo.getName();

    }

    private static void endGame (Player playerOne, Player playerTwo) {
        System.out.println("======== Game over! ========");
        System.out.println("======= Final score: =======");
        System.out.println(
                playerOne.getName() + " " +
                playerOne.getHand().getScoreOfHand() +
                " : " +
                playerTwo.getHand().getScoreOfHand() + " " +
                playerTwo.getName() +
                "\n"
        );

        System.out.println("===== " +  determineWinner(playerOne, playerTwo) + " wins! =====");
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
        int max = 51;

        // the internet is undefeated
        return (int)Math.floor(Math.random() * (max - min + 1) + min);
    }
}
