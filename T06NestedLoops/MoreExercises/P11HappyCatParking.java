package T06NestedLoops.MoreExercises;

import java.util.Scanner;

public class P11HappyCatParking {
    public static void main(String[] args) {
        // 1. Input reading
        Scanner scanner = new Scanner(System.in);
        int days = Integer.parseInt(scanner.nextLine());
        int hours = Integer.parseInt(scanner.nextLine());

        // 2. Day sum and total sum computation via 2 nested loops
        double totalSum = 0;
        for (int i = 1; i <= days; i++) {
            double daySum = 0;
            for (int j = 1; j <= hours; j++) {
                boolean firstCond = (i % 2 == 0) && (j % 2 != 0);
                boolean secondCond = (i % 2 != 0) && (j % 2 == 0);
                double hourTax = getTax(firstCond, secondCond);
                daySum += hourTax;
            }
            System.out.printf("Day: %d - %.2f leva\n", i, daySum);
            totalSum += daySum;
        }

        // 3. Output printing
        System.out.printf("Total: %.2f leva", totalSum);
    }

    private static double getTax(boolean firstCond, boolean secondCond) {
        double tax = 0;
        if (firstCond) {
            tax = 2.50;
        } else if (secondCond) {
            tax = 1.25;
        } else {
            tax = 1;
        }
        return tax;
    }
}
