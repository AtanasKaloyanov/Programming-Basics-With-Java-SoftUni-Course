package T03ConditionalStatementsAdvaneced.Exercise;

import java.util.Scanner;

public class P05Journey {
    public static void main(String[] args) {
        // 1. Input reading
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();

        // 2. Assigning of the destination, the spend money and the type of tourism
        String destination;
        double spendMoney;
        String typeTourism;

        if (budget <= 100) {
            destination = "Bulgaria";

            if (season.equals("summer")) {
                spendMoney = 0.30 * budget;
                typeTourism = "Camp";
            } else {
                spendMoney = 0.70 * budget;
                typeTourism = "Hotel";
            }
        } else if (budget <= 1000) {
            destination = "Balkans";
            if (season.equals("summer")) {
                spendMoney = 0.40 * budget;
                typeTourism = "Camp";
            } else {
                spendMoney = 0.80 * budget;
                typeTourism = "Hotel";
            }
        } else {
            destination = "Europe";
            spendMoney = 0.90 * budget;
            typeTourism = "Hotel";
        }

        // 3. Output printing - 2 cases:
        System.out.printf("Somewhere in %s\n", destination);
        System.out.printf("%s - %.2f", typeTourism, spendMoney);

    }
}

