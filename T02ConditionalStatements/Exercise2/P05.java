package T02ConditionalStatements.Exercise2;

import java.util.Scanner;

public class P05 {
    public static void main(String[] args) {
        // 1. Input reading
        Scanner scanner = new Scanner(System.in);
        double movieBudget = Double.parseDouble(scanner.nextLine());
        int extraNumber = Integer.parseInt(scanner.nextLine());
        double clothingFor1Extra = Double.parseDouble(scanner.nextLine());

        // 2. Sum computing
        double decorsCosts = 0.1 * movieBudget;
        double extraCosts = extraNumber * clothingFor1Extra;

        if (extraNumber > 150) {
            extraCosts *= 0.9;
        }

        double allCosts = decorsCosts + extraCosts;

        // 3. Printing
        if (allCosts > movieBudget) {
            double neededMoney = allCosts - movieBudget;
            System.out.println("Not enough money!");
            System.out.printf("Wingard needs %.2f leva more.", neededMoney);
        } else {
            double leftMoney = movieBudget - allCosts;
            System.out.println("Action!");
            System.out.printf("Wingard starts filming with %.2f leva left.", leftMoney);
        }
    }
}
