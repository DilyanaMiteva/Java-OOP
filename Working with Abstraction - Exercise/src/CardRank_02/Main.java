package CardRank_02;

public class Main {
    public static void main(String[] args) {

        System.out.println("Card Ranks:");

        Ranks[] cardRanks = Ranks.values();

        for (Ranks card : cardRanks) {
            System.out.printf("Ordinal value: %d; Name value: %s%n",
                    card.ordinal(), card.name());
        }


    }
}
