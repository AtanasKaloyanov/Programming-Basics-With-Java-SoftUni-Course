package T02ConditionalStatements.MoreExercises;

import java.util.Scanner;

public class P07FuelTank {
    public static void main(String[] args) {
        // 1. Input reading
        Scanner scanner = new Scanner(System.in);
        String fuelName = scanner.nextLine();
        double liters = Double.parseDouble(scanner.nextLine());

        // 2. Output printing - 2 cases: The first case has also 2 cases
        if (fuelName.equals("Diesel") || fuelName.equals("Gasoline") || fuelName.equals("Gas")) {
            fuelName = fuelName.toLowerCase();
            if (liters >= 25) {
                System.out.printf("You have enough %s.", fuelName);
            } else {
                System.out.printf("Fill your tank with %s!", fuelName);
            }
        } else {
            System.out.println("Invalid fuel!");
        }
    }
}
