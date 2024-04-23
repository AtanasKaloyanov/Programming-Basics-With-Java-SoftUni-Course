package T02ConditionalStatements.Exercise2;

import java.util.Scanner;

public class P04 {
    public static void main(String[] args) {
        // 1. Input Reading
        Scanner scanner = new Scanner(System.in);
        double excursion = Double.parseDouble(scanner.nextLine());
        int puzzles = Integer.parseInt(scanner.nextLine());
        int dolls = Integer.parseInt(scanner.nextLine());
        int bears = Integer.parseInt(scanner.nextLine());
        int minions = Integer.parseInt(scanner.nextLine());
        int trucks = Integer.parseInt(scanner.nextLine());

        // 2. Sum computing
        double sum = puzzles * 2.60 + dolls * 3 + bears * 4.10 + minions * 8.20 + trucks * 2;
        int toysNumber = puzzles + dolls + bears + minions + trucks;

        if (toysNumber >= 50) {
            sum *= 0.75;
        }

        sum *= 0.90;

        // 3. Result printing
        if (sum >= excursion) {
            double change = sum - excursion;
            System.out.printf("Yes! %.2f lv left.", change);
        } else {
            double neededMoney = excursion - sum;
            System.out.printf("Not enough money! %.2f lv needed.", neededMoney);
        }

    }
}
