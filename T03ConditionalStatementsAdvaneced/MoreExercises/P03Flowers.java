package T03ConditionalStatementsAdvaneced.MoreExercises;

import java.util.Scanner;

public class P03Flowers {
    public static void main(String[] args) {
        // 1. Input reading
        Scanner scanner = new Scanner(System.in);
        int chrysanthemums = Integer.parseInt(scanner.nextLine());
        int roses = Integer.parseInt(scanner.nextLine());
        int tulips = Integer.parseInt(scanner.nextLine());
        String season = scanner.nextLine();
        String holidayMessage = scanner.nextLine();

        // 2. Price for a flower assignment
        double chrysanthemumPrice = 0;
        double rosePrice = 0;
        double tulipPrice = 0;

        switch (season) {
            case "Spring":
            case "Summer":
                chrysanthemumPrice = 2.00;
                rosePrice = 4.10;
                tulipPrice = 2.50;
                break;

            case "Autumn":
            case "Winter":
                chrysanthemumPrice = 3.75;
                rosePrice = 4.50;
                tulipPrice = 4.15;
                break;
        }

        // 3. Increasing the price when it's a holiday
        if (holidayMessage.equals("Y")) {
            chrysanthemumPrice *= 1.15;
            rosePrice *= 1.15;
            tulipPrice *= 1.15;
        }

        // 4. Sum computing
        double bucket = chrysanthemumPrice * chrysanthemums + rosePrice * roses + tulipPrice * tulips;

        // 5. Discounting the bucket
        if (tulips > 7 && season.equals("Spring")) {
            bucket *= 0.95;
        }
        if (roses >= 10 && season.equals("Winter")) {
            bucket *= 0.90;
        }
        double sumFlowers = chrysanthemums + roses + tulips;
        if (sumFlowers > 20) {
            bucket *= 0.80;
        }

        // 6. Adding the arrangement
        bucket += 2;

        // 7. Output printing
        System.out.printf("%.2f", bucket);
    }
}
