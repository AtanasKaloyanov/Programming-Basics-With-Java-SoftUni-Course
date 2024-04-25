package T03ConditionalStatementsAdvaneced.Exercise;

import java.util.Scanner;

public class P09SkiTrip {
    public static void main(String[] args) {
        // 1. Input reading
        Scanner scanner = new Scanner(System.in);
        int days = Integer.parseInt(scanner.nextLine());
        String typePlace = scanner.nextLine();
        String estimation = scanner.nextLine();

        // 2. Price per night assignment
        double priceFor1Night = 0;
        switch (typePlace) {
            case "room for one person":
                priceFor1Night = 18.00;
                break;

            case "apartment":
                priceFor1Night = 25.00;
                if (days < 10) {
                    priceFor1Night *= 0.70;
                } else if (days <= 15) {
                    priceFor1Night *= 0.65;
                } else {
                    priceFor1Night *= 0.50;
                }
                break;

            case "president apartment":
                priceFor1Night = 35.00;
                if (days < 10) {
                    priceFor1Night *= 0.90;
                } else if (days <= 15) {
                    priceFor1Night *= 0.85;
                } else {
                    priceFor1Night *= 0.80;
                }
                break;
        }

        // 2. nights computing and the sum
        int night = days - 1;
        double sum = night * priceFor1Night;

        // 3. positive or negative sum change
        sum = estimation.equals("positive") ? sum + 0.25 * sum : sum - 0.10 * sum;

        // 4. Output printing
        System.out.printf("%.2f", sum);
    }
}
