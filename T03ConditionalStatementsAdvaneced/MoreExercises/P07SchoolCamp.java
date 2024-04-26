package T03ConditionalStatementsAdvaneced.MoreExercises;

import java.util.Scanner;

public class P07SchoolCamp {
    public static void main(String[] args) {
        // 1. Input reading
        Scanner scanner = new Scanner(System.in);
        String season = scanner.nextLine();
        String groupType = scanner.nextLine();
        int students = Integer.parseInt(scanner.nextLine());
        int nights = Integer.parseInt(scanner.nextLine());

        // 2. Price and sport assignment
        double price = 0;
        String sport = null;

        switch (groupType) {
            case "girls":
                if (season.equals("Winter")) {
                    price = 9.60;
                    sport = "Gymnastics";
                } else if (season.equals("Spring")) {
                    price = 7.20;
                    sport = "Athletics";
                } else {
                    price = 15.00;
                    sport = "Volleyball";
                }
                break;

            case "boys":
                if (season.equals("Winter")) {
                    price = 9.60;
                    sport = "Judo";
                } else if (season.equals("Spring")) {
                    price = 7.20;
                    sport = "Tennis";
                } else {
                    price = 15.00;
                    sport = "Football";
                }
                break;

            case "mixed":
                if (season.equals("Winter")) {
                    price = 10.00;
                    sport = "Ski";
                } else if (season.equals("Spring")) {
                    price = 9.50;
                    sport = "Cycling";
                } else {
                    price = 20.00;
                    sport = "Swimming";
                }
                break;
        }

        // 3. Discount making
        if (students >= 50) {
            price *= 0.50;
        } else if (students >= 20) {
            price *= 0.85;
        } else if (students >= 10) {
            price *= 0.95;
        }
        // 4. Computing of the sum
        double sum = price * students * nights;

        // 5. Output
        System.out.printf("%s %.2f lv.", sport, sum);
    }
}
