package geometry_02;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] rectangleInfo = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt).toArray();

        Rectangle rectangle = GeometryFactory.createRectangle(rectangleInfo);

        int n = Integer.parseInt(scanner.nextLine());

        while (n-- > 0){
            int[] pointInfo = Arrays.stream(scanner.nextLine().split("\\s+"))
                    .mapToInt(Integer::parseInt).toArray();

            Point2D point2D = GeometryFactory.createPoint2D(pointInfo);

            System.out.println(rectangle.contains(point2D));
        }
    }
}
