package T03ConditionalStatementsAdvaneced.Exercise;

import java.util.Scanner;

public class P03NewHouse {
    public static void main(String[] args) {
        // 1. Input reading
        Scanner scanner = new Scanner(System.in);
        String flower = scanner.nextLine();
        int numberFlowers = Integer.parseInt(scanner.nextLine());
        int budget = Integer.parseInt(scanner.nextLine());

        // 2. Price for 1 flower assignment
        double priceFor1Flower = 0;
        switch (flower) {
            case "Roses":
                priceFor1Flower = 5;

                if (numberFlowers > 80) {
                    priceFor1Flower = 0.90 * 5;
                }
                break;
            case "Dahlias":
                priceFor1Flower = 3.80;
                if (numberFlowers > 90) {
                    priceFor1Flower = 0.85 * 3.80;
                }

                break;
            case "Tulips":
                priceFor1Flower = 2.80;
                if (numberFlowers > 80) {
                    priceFor1Flower = 0.85 * 2.80;
                }

                break;
            case "Narcissus":
                priceFor1Flower = 3;
                if (numberFlowers < 120) {
                    priceFor1Flower = 1.15 * 3;
                }

                break;
            case "Gladiolus":
                priceFor1Flower = 2.50;
                if (numberFlowers < 80) {
                    priceFor1Flower = 1.2 * 2.50;
                }
                break;
        }

        // 3. Sum computation
        double sum = numberFlowers * priceFor1Flower;

        // 4. Output printing - 2 cases:
        if (budget >= sum) {
            double change = budget - sum;
            System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.", numberFlowers, flower, change);
        } else {
            double neededMoney = sum - budget;
            System.out.printf("Not enough money, you need %.2f leva more.", neededMoney);
        }
    }
}

