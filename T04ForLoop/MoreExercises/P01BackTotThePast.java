package T04ForLoop.MoreExercises;

import java.util.Scanner;

public class P01BackTotThePast {
    public static void main(String[] args) {
        // 1. Input reading
        Scanner scanner = new Scanner(System.in);
        double money = Double.parseDouble(scanner.nextLine());
        int year = Integer.parseInt(scanner.nextLine());

        int age = 18;
        double costs = 0;

        // 2. Computation pf the costs
        for (int i = 1800; i <= year; i++) {
            if (i % 2 == 0) {
                costs += 12000;
            } else {
                double currentCosts = 12000 + 50 * age;
                costs += currentCosts;
            }

            age++;
        }

        // 3. Output printing - 2 cases:
        if (money >= costs) {
            double change = money - costs;
            System.out.printf("Yes! He will live a carefree life and will have %.2f dollars left.", change);
        } else {
            double neededMoney = costs - money;
            System.out.printf("He will need %.2f dollars to survive.", neededMoney);
        }

    }
}
