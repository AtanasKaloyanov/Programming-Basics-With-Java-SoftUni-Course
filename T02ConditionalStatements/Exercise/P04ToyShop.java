package T02ConditionalStatements.Exercise;

import java.util.Scanner;

public class P04ToyShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double priceExcursion = Double.parseDouble(scanner.nextLine());
        int numberPuzzles = Integer.parseInt(scanner.nextLine());
        int numberDolls = Integer.parseInt(scanner.nextLine());
        int numberBears = Integer.parseInt(scanner.nextLine());
        int numberMinions = Integer.parseInt(scanner.nextLine());
        int numberTrucks = Integer.parseInt(scanner.nextLine());

        double totalSum = numberPuzzles * 2.60 + numberDolls * 3.00 + numberBears * 4.10 + numberMinions * 8.20 + numberTrucks * 2.00;
        int totalNumber = numberPuzzles + numberDolls + numberBears + numberMinions + numberTrucks;
        if (totalNumber >= 50) {
            totalSum = 0.75 * totalSum;
        }
        if (0.90 * totalSum >= priceExcursion) {
            double moneyLeft = 0.90 * totalSum - priceExcursion;
            System.out.printf("Yes! %.2f lv left.", moneyLeft);
        }
        if (0.90 * totalSum < priceExcursion) {
            double moneyNeeded = (priceExcursion - 0.90 * totalSum);
            System.out.printf("Not enough money! %.2f lv needed.", (moneyNeeded));
        }

    }
}
