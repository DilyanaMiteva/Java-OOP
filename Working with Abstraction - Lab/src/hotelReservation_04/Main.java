package hotelReservation_04;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] tokens = scanner.nextLine().split("\\s+");
        String season = tokens[2];
        String discountType = tokens[3];

        PriceCalculator priceCalculator = new PriceCalculator(
                Double.parseDouble(tokens[0]),
                Integer.parseInt(tokens[1]),
                Season.valueOf(tokens[2].toUpperCase()),
                tokens[3].equals("SecondVisit")
                        ? DiscountType.SECOND_VISIT
                        : DiscountType.valueOf(tokens[3].toUpperCase()));

        System.out.printf("%.2f%n", priceCalculator.calculate());
    }
}
