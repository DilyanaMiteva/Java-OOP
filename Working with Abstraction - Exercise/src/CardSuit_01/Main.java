package CardSuit_01;

public class Main {
    public static void main(String[] args) {

        System.out.println("Card Suits:");

        Cards[] cards = Cards.values();
        for (Cards card : cards) {
            System.out.printf("Ordinal value: %d; Name value: %s%n"
            ,card.ordinal(), card.name());
        }
        ;
    }
}
