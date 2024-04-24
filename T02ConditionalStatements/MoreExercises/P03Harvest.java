package T02ConditionalStatements.MoreExercises;

import java.util.Scanner;

public class P03Harvest {
    public static void main(String[] args) {
        // 1. Input reading
        Scanner scanner = new Scanner(System.in);
        int landArea = Integer.parseInt(scanner.nextLine());
        double grapeFor1m = Double.parseDouble(scanner.nextLine());
        double neededWineL = Double.parseDouble(scanner.nextLine());
        int workers = Integer.parseInt(scanner.nextLine());

        // 2. Computation of wine in liters
        double grapesKg = landArea * grapeFor1m;
        double grapesForWine = 0.4 * grapesKg;
        double wineL = grapesForWine / 2.5;

        // 3. Output printing - 2 cases:
        if (wineL < neededWineL) {
            double neededWine = Math.floor(neededWineL - wineL);
            System.out.printf("It will be a tough winter! More %.0f liters wine needed.", neededWine);
        } else {
            double leftWine = wineL - neededWineL;
            double wineForOneWorker = leftWine / workers;
            System.out.printf("Good harvest this year! Total wine: %.0f liters.\n", Math.floor(wineL));
            System.out.printf("%.0f liters left -> %.0f liters per person.", Math.ceil(leftWine), Math.ceil(wineForOneWorker));
        }
    }
}
