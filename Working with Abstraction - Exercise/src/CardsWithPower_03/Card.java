package CardsWithPower_03;

public class Card {
    private RankPowers rank;
    private SuitPowers suit;
    private int power;


    public Card(RankPowers rank, SuitPowers suit) {
        this.rank = rank;
        this.suit = suit;
        calculatePower();
    }

    public void calculatePower(){
        power = rank.getPower() + suit.getPower();
    }

    @Override
    public String toString() {
        return String.format("Card name: %s of %s; Card power: %d%n"
                , rank, suit, power);
    }
}
