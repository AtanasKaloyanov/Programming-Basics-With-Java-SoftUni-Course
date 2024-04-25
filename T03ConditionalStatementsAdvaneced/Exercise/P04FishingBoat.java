package T03ConditionalStatementsAdvaneced.Exercise;

import java.util.Scanner;

public class P04FishingBoat {
    public static void main(String[] args) {
        // 1. Input reading
        Scanner scanner = new Scanner(System.in);
        int budget = Integer.parseInt(scanner.nextLine());
        String season = scanner.nextLine();
        int fishers = Integer.parseInt(scanner.nextLine());

        // 2. Assigning of the rent
        int rent = 0;
        switch (season) {
            case "Spring":
                rent = 3000;
                break;
            case "Summer":
            case "Autumn":
                rent = 4200;
                break;
            case "Winter":
                rent = 2600;
                break;
        }

        // 3. Computing the rent after the discount
        double rentAfterDiscount;
        if (fishers <= 6) {
            rentAfterDiscount = 0.90 * rent;
        } else if (fishers <= 11) {
            rentAfterDiscount = 0.85 * rent;
        } else {
            rentAfterDiscount = 0.75 * rent;
        }

        // 4. Additional discount computing
        if ( (fishers % 2 == 0) && (!season.equals("Autumn")) ) {
            rentAfterDiscount *= 0.95;
        }

        // 5. Output printing - 2 cases:
        if (budget >= rentAfterDiscount) {
            double change = budget - rentAfterDiscount;
            System.out.printf("Yes! You have %.2f leva left.", change);
        } else {
            double neededMoney = rentAfterDiscount - budget;
            System.out.printf("Not enough money! You need %.2f leva.", neededMoney);
        }

    }
}






