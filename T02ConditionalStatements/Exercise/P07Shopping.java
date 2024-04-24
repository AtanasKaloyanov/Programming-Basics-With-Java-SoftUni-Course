package T02ConditionalStatements.Exercise;

import java.util.Scanner;

public class P07Shopping {
    public static void main(String[] args) {
        // 1. Input reading
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        int videoCards = Integer.parseInt(scanner.nextLine());
        int processors = Integer.parseInt(scanner.nextLine());
        int ramMemories = Integer.parseInt(scanner.nextLine());

        // 2. Computing the sum
        double videoCardsSum = videoCards * 250;
        double processorsPrice = 0.35 * videoCardsSum;
        double ramMemoriesPrice = 0.10 * videoCardsSum;
        double sum = videoCardsSum + processors * processorsPrice + ramMemories * ramMemoriesPrice;

        if (videoCards > processors) {
            sum *= 0.85;
        }

        // 3. Result printing
        if (budget >= sum) {
            double change = budget - sum;
            System.out.printf("You have %.2f leva left!", change);
        } else {
            double neededMoney = sum - budget;
            System.out.printf("Not enough money! You need %.2f leva more!", neededMoney);
        }
    }
}
