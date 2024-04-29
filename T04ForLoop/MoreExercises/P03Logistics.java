package T04ForLoop.MoreExercises;

import java.util.Scanner;

public class P03Logistics {
    public static void main(String[] args) {
        // 1. Input reading
        Scanner scanner = new Scanner(System.in);
        int numberGoods = Integer.parseInt(scanner.nextLine());

        double allCosts = 0;

        int allWight = 0;
        double firstWeight = 0;
        double secondWeight = 0;
        double thirdWeight = 0;
        // 2.
        for (int i = 0; i < numberGoods; i++) {
            int currentWeight = Integer.parseInt(scanner.nextLine());
            double currentSum;
            if (currentWeight <= 3) {
                firstWeight += currentWeight;
                currentSum = currentWeight * 200;
            } else if (currentWeight <= 11) {
                secondWeight += currentWeight;
                currentSum = currentWeight * 175;
            } else {
                thirdWeight += currentWeight;
                currentSum = currentWeight * 120;

            }

            allWight += currentWeight;
            allCosts += currentSum;
        }

        // 3. Avrage sum and 3 percentage computation
        double averageSum = allCosts / allWight;
        double firstPercentage = (firstWeight / allWight) * 100;
        double secondPercentage = (secondWeight / allWight) * 100;;
        double thirdercentage = (thirdWeight / allWight) * 100;;

        // 4.  Output printing
        System.out.printf("%.2f\n", averageSum);
        System.out.printf("%.2f%%\n", firstPercentage);
        System.out.printf("%.2f%%\n", secondPercentage);
        System.out.printf("%.2f%%", thirdercentage);
    }
}
