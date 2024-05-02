package T05WhileLoop.MoreExercises;

import java.util.Scanner;

public class P02ReportSystem {
    public static void main(String[] args) {

        // 1. Input reading
        Scanner scanner = new Scanner(System.in);
        int sum = Integer.parseInt(scanner.nextLine());

        // 2. While cycle - 2 cases of continuing, boolean variable value switching, sum computation and counting
        String input = scanner.nextLine();
        boolean isCash = true;
        int cashCounter = 0;
        int cardCounter = 0;
        int cashSum = 0;
        int cardSum = 0;
        while (!input.equals("End")) {
            int price = Integer.parseInt(input);

            if (isCash && price > 100) {
                System.out.println("Error in transaction!");
                isCash = switchPayment(isCash);
                input = scanner.nextLine();
                continue;
            }

            if (!isCash && price < 10) {
                System.out.println("Error in transaction!");
                isCash = switchPayment(isCash);
                input = scanner.nextLine();
                continue;
            }

            if (isCash) {
                cashSum += price;
                cashCounter++;
            } else {
                cardSum += price;
                cardCounter++;
            }

            sum -= price;
            System.out.println("Product sold!");

            if (sum <= 0) {
                double averageCashSum = cashSum * 1.0 / cashCounter;
                double averageCardSum = cardSum * 1.0 / cardCounter;
                System.out.printf("Average CS: %.2f\n", averageCashSum);
                System.out.printf("Average CC: %.2f", averageCardSum);
                return;
            }

            isCash = switchPayment(isCash);
            input = scanner.nextLine();
        }

        // 3. Printing
        System.out.println("Failed to collect required money for charity.");
    }

    private static boolean switchPayment(boolean cash) {
        if (cash) {
            cash = false;
        } else {
            cash = true;
        }
        return cash;
    }
}
