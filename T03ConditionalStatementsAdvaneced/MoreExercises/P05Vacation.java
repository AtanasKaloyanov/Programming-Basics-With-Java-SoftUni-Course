package T03ConditionalStatementsAdvaneced.MoreExercises;

import java.util.Scanner;

public class P05Vacation {
    public static void main(String[] args) {
        // 1. Input reading
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();

        // 2. Price, destination and place assignment
        double price;
        String destination;
        String place;

        if (budget <= 1000) {
            place = "Camp";
            destination = season.equals("Summer") ? "Alaska" : "Morocco";
            price = season.equals("Summer") ? 0.65 * budget : 0.45 * budget;
        } else if (budget <= 3000) {
            place = "Hut";
            destination = season.equals("Summer") ? "Alaska" : "Morocco";
            price = season.equals("Summer") ? 0.80 * budget : 0.60 * budget;
        } else {
            place = "Hotel";
            destination = season.equals("Summer") ? "Alaska" : "Morocco";
            price = 0.90 * budget;
        }

        // 3. Output printing
        System.out.printf("%s - %s - %.2f", destination, place, price);
    }
}
