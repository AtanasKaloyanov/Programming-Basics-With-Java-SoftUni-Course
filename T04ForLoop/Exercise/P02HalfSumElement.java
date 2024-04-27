package T04ForLoop.Exercise;

import java.util.Scanner;

public class P02HalfSumElement {
    public static void main(String[] args) {
        // 1. Input reading
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        // 2. Sum computation and finding of the greatest element
        int sum = 0;
        int bestElement = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            int currentNumber = Integer.parseInt(scanner.nextLine());
            if (currentNumber > bestElement) {
                bestElement = currentNumber;
            }
            sum += currentNumber;
        }

        // 3. Finding the sum without the greatest and
        int sumWithoutTheBestElement = sum - bestElement;

        // 4. Output printing - 2 cases:
        if (sumWithoutTheBestElement == bestElement) {
            System.out.println("Yes");
            System.out.printf("Sum = %d", sumWithoutTheBestElement);
        } else {
            int restSum = Math.abs(sumWithoutTheBestElement - bestElement);
            System.out.println("No");
            System.out.printf("Diff = %d", restSum);
        }

    }
}
