package T06NestedLoops.Lab;

import java.util.Scanner;

public class P05Travelling {
    public static void main(String[] args) {
        // 1. Input reading
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        // 2. Output printing via 2 nested while cycles
        while (!input.equals("End")) {
            String destination = input;
            double neededMoney = Double.parseDouble(scanner.nextLine());
            double sum = 0;

            while (neededMoney > sum) {
                double currentSum = Double.parseDouble(scanner.nextLine());
                sum += currentSum;
            }

            System.out.printf("Going to %s!\n", destination);
            input = scanner.nextLine();
        }
    }
}

