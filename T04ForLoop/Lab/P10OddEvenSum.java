package T04ForLoop.Lab;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class P10OddEvenSum {
    public static void main(String[] args) {
        // 1. Input reading
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        // 2. Sum computing
        int oddSum = 0;
        int evenSum = 0;

        for (int i = 1; i <= n; i++) {
            int currentNumber = Integer.parseInt(scanner.nextLine());
            if (i % 2 == 0) {
                oddSum += currentNumber;
            } else {
                evenSum += currentNumber;
            }
        }

        // 3. Output printing
        if (oddSum == evenSum) {
            System.out.println("Yes");
            System.out.printf("Sum = %d", oddSum);
        } else {
            int difference = Math.abs(oddSum - evenSum);
            System.out.println("No");
            System.out.printf("Diff = %d", difference);
        }
    }
}

