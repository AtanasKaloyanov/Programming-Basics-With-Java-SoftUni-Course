package T04ForLoop.MoreExercises;

import java.util.Scanner;

public class P06Bills {
    public static void main(String[] args) {
        // 1. Input reading
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        double firstSum = 0;
        double secondSum = 0;
        double thirdSum = 0;
        double fourthSum = 0;
        double allSum = 0;

        // 2. Computation of the 4 sums with for cycle
        for (int i = 0; i < n; i++) {
            double currentFirstCosts = Double.parseDouble(scanner.nextLine());
            firstSum += currentFirstCosts;
            secondSum += 20;
            thirdSum += 15;

            double fourthCurrentCost = (currentFirstCosts + 20 + 15) * 1.2;
            fourthSum += fourthCurrentCost;

            allSum += currentFirstCosts + 20 + 15 + fourthCurrentCost;
        }

        // 3. Average costs computation and output printing
        double averageCosts = allSum / n;
        System.out.printf("Electricity: %.2f lv\n", firstSum);
        System.out.printf("Water: %.2f lv\n", secondSum);
        System.out.printf("Internet: %.2f lv\n", thirdSum);
        System.out.printf("Other: %.2f lv\n", fourthSum);
        System.out.printf("Average: %.2f lv", averageCosts);
    }
}
