package T03ConditionalStatementsAdvaneced.MoreExercises;

import java.util.Scanner;

public class P04CarToGo {
    public static void main(String[] args) {
        // 1. Input reading
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();

        // 2. Assignment of price, type and class of the car
        double price;
        String type;
        String clazz;

        if (budget <= 100) {
            clazz = "Economy class";
            type = season.equals("Summer") ? "Cabrio" : "Jeep";
            price = season.equals("Summer") ? 0.35 * budget : 0.65 * budget;
        } else if (budget <= 500) {
            clazz = "Compact class";
            type = season.equals("Summer") ? "Cabrio" : "Jeep";
            price = season.equals("Summer") ? 0.45 * budget : 0.80 * budget;
        } else {
            clazz = "Luxury class";
            type = "Jeep";
            price = 0.90 * budget;
        }

        // 3. Output printing
        System.out.println(clazz);
        System.out.printf("%s - %.2f", type, price);
    }
}
