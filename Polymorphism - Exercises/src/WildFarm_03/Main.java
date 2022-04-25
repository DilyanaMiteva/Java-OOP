package WildFarm_03;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String input;
        while (!"End".equals(input = scan.nextLine())) {
            Functionality.execute(input.split("\\s+"), scan.nextLine().split("\\s+"));
        }
        Functionality.getAnimalsInfo().forEach(e -> System.out.println(e.toString()));
    }
}
