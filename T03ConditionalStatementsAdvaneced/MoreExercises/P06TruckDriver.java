package T03ConditionalStatementsAdvaneced.MoreExercises;

import java.util.Scanner;

public class P06TruckDriver {
    public static void main(String[] args) {
        // 1. Input reading
        Scanner scanner = new Scanner(System.in);
        String season = scanner.nextLine();
        double kilometers = Double.parseDouble(scanner.nextLine());

        // 2. Sum for an hour assignment
        double sumForKm = 0;
        if (kilometers <= 5000) {
            switch (season) {
                case "Spring":
                case "Autumn":
                    sumForKm = 0.75;
                    break;

                case "Summer":
                    sumForKm = 0.90;
                    break;

                case "Winter":
                    sumForKm = 1.05;
                    break;
            }
        } else if (kilometers <= 10000) {
            switch (season) {
                case "Spring":
                case "Autumn":
                    sumForKm = 0.95;
                    break;

                case "Summer":
                    sumForKm = 1.10;
                    break;

                case "Winter":
                    sumForKm = 1.25;
                    break;
            }
        } else {
            sumForKm = 1.45;
        }

        // 2. Sum computation and making of payments
        double sum = sumForKm * kilometers * 4;
        sum *= 0.90;

        // 3. Output printing
        System.out.printf("%.2f", sum);
    }
}
