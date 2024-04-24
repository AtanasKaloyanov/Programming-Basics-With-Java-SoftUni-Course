package T02ConditionalStatements.MoreExercises;

import java.util.Scanner;

public class P08FuelTank2 {
    public static void main(String[] args) {
        // 1. Input reading
        Scanner scanner = new Scanner(System.in);
        String fuelType = scanner.nextLine();
        double fuelQuantity = Double.parseDouble(scanner.nextLine());
        boolean hasCard = scanner.nextLine().equals("Yes");

        // 2. Output printing - 2 cases, every of them has 3 cases too. Another 2 cases in the end
        double sum = 0;
        if (hasCard) {
            if (fuelType.equals("Gas")) {
                sum = (0.93 - 0.08) * fuelQuantity;
            } else if (fuelType.equals("Gasoline")) {
                sum = (2.22 - 0.18) * fuelQuantity;
            } else if (fuelType.equals("Diesel")) {
                sum = (2.33 - 0.12) * fuelQuantity;
            }
        } else {
            if (fuelType.equals("Gas")) {
                sum = 0.93 * fuelQuantity;
            } else if (fuelType.equals("Gasoline")) {
                sum = 2.22 * fuelQuantity;
            } else if (fuelType.equals("Diesel")) {
                sum = 2.33 * fuelQuantity;
            }
        }

        if (fuelQuantity >= 20 && fuelQuantity <= 25) {
            sum *= 0.92;
        } else if (fuelQuantity > 25) {
            sum *= 0.90;
        }

        // 3. Output printing
        System.out.printf("%.2f lv.", sum);
    }
}
