package hotelReservation_04;

public class PriceCalculator {
    private double pricePerDay;
    private int days;
    private DiscountType discountType;
    private Season season;

    public PriceCalculator(double pricePerDay, int days, Season season,  DiscountType discountType) {
        this.pricePerDay = pricePerDay;
        this.days = days;
        this.discountType = discountType;
        this.season = season;
    }

    public double calculate() {
        return pricePerDay * days * season.getMultiplier() *
                (1.00 - (discountType.getPercentage() / 100.00));
    }
}
