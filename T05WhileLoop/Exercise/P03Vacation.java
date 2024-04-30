package T05WhileLoop.Exercise;

import java.util.Scanner;

public class P03Vacation {
    public static void main(String[] args) {
        // 1. Input reading
        Scanner scanner = new Scanner(System.in);
        double neededMoney = Double.parseDouble(scanner.nextLine());
        double money = Double.parseDouble(scanner.nextLine());

        // 2. While cycle with 2 inputs on every iteration and two possible commands
        int spendDays = 0;
        int allDaysCounter = 0;

        while (true) {
            // 2.1. Reading action, sum and counting
            String action = scanner.nextLine();
            double currentSum = Double.parseDouble(scanner.nextLine());
            allDaysCounter++;

            // 2.2. Spend command logic
            if (action.equals("spend")) {
                spendDays++;
                if (fiveSpendingDays(spendDays, allDaysCounter)) return;

                money -= currentSum;
                if (money < 0) {
                    money = 0;
                }

            } else {
                // 2.3. Save command logic
                spendDays = 0;
                money += currentSum;

                if (saveMoney(neededMoney, money, allDaysCounter)) return;
            }
        }
    }

    private static boolean saveMoney(double neededMoney, double money, int allDaysCounter) {
        if (money >= neededMoney) {
            System.out.printf("You saved the money for %d days.", allDaysCounter);
            return true;
        }
        return false;
    }

    private static boolean fiveSpendingDays(int spendDays, int allDaysCounter) {
        if (spendDays == 5) {
            System.out.println("You can't save the money.");
            System.out.printf("%d", allDaysCounter);
            return true;
        }
        return false;
    }
}

