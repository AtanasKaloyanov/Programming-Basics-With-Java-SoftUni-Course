package T02ConditionalStatements.Exercise;

import java.util.Scanner;

public class P07Shopping {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1.Бюджетът на Петър - реално число в интервала [0.0…100000.0]
        // 2.Броят видеокарти - цяло число в интервала [0…100]
        // 3.Броят процесори - цяло число в интервала [0…100]
        // 4.Броят рам памет - цяло число в интервала [0…100]

        double budget = Double.parseDouble(scanner.nextLine());
        int videocards = Integer.parseInt(scanner.nextLine());
        int processors = Integer.parseInt(scanner.nextLine());
        int ram = Integer.parseInt(scanner.nextLine());



        double sum = videocards * 250.0 + processors * 0.35 * videocards * 250.0 + ram * 0.1 * videocards * 250.0;
        if (videocards > processors) {
            sum = 0.85 * sum;

        }
        if (budget >= sum) {
            double moneyLeft = budget - sum;
            System.out.printf("You have %.2f leva left!", moneyLeft);
        } else {
            double moneyNeeded = sum - budget;
            System.out.printf("Not enough money! You need %.2f leva more!", moneyNeeded);

        }
    }
}
