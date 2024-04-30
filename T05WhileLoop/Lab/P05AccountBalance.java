package T05WhileLoop.Lab;

import java.util.Scanner;

public class P05AccountBalance {
    public static void main(String[] args) {
        // 1. Input reading
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();

        // 2. Sum computation via while cycle
        double sum = 0;
        while (!line.equals("NoMoreMoney")) {
            double currentNumber = Double.parseDouble(line);
            if (currentNumber < 0) {
                System.out.println("Invalid operation!");
                break;
            }

            sum += currentNumber;
            System.out.printf("Increase: %.2f\n", currentNumber);
            line = scanner.nextLine();
        }

        // 3. Final message printing
        System.out.printf("Total: %.2f", sum);
    }
}

