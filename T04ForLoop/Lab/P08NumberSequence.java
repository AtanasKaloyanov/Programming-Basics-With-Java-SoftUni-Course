package T04ForLoop.Lab;

import java.util.Scanner;

public class P08NumberSequence {
    public static void main(String[] args) {
        // 1. Input reading
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        // 2. Finding the greatest and the smallest number
        int smallest = Integer.MAX_VALUE;
        int greatest = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            int currentNumber = Integer.parseInt(scanner.nextLine());
            if (currentNumber < smallest) {
                smallest = currentNumber;
            }
            if (currentNumber > greatest) {
                greatest = currentNumber;
            }
        }

        // 3. Output printing
        System.out.printf("Max number: %d\n", greatest);
        System.out.printf("Min number: %d", smallest);
    }
}