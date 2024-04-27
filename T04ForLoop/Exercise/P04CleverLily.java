package T04ForLoop.Exercise;

import java.util.Scanner;

public class P04CleverLily {
    public static void main(String[] args) {
        // 1. Input reading
        Scanner scanner = new Scanner(System.in);
        int age = Integer.parseInt(scanner.nextLine());
        double washingMachinePrice = Double.parseDouble(scanner.nextLine());
        int toyPrice = Integer.parseInt(scanner.nextLine());

        // 2. Computation of the current sum and the toys number
        int sum = 0;
        int toysNumber = 0;

        for (int year = 1; year <= age; year++) {
            if (year % 2 == 0) {
                sum += year * 5;
                sum -= 1;
            } else {
                toysNumber++;
            }
        }

        // 3. Computing of the total sum
        int totalSum = toysNumber * toyPrice + sum;

        // 4. Output printing - 2 cases:
        if (totalSum >= washingMachinePrice) {
            double change = totalSum - washingMachinePrice;
            System.out.printf("Yes! %.2f", change);
        } else {
            double neededSum = washingMachinePrice - totalSum;
            System.out.printf("No! %.2f", neededSum);
        }
    }
}
