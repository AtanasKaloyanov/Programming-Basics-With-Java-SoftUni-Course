package T04ForLoop.Lab;

import java.util.Scanner;

public class P09LeftAndRightSum {
    public static void main(String[] args) {
        // 1. Input reading
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        // 2. Sums computation
        int leftSum = getSum(scanner, n);
        int rightSum = getSum(scanner, n);

        // 3. Output printing - 2 cases:
        if (leftSum == rightSum) {
            System.out.printf("Yes, sum = %d", leftSum);
        } else {
            int difference = Math.abs(leftSum - rightSum);
            System.out.printf("No, diff = %d", difference);
        }
    }

    private static int getSum(Scanner scanner, int n) {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            int number = Integer.parseInt(scanner.nextLine());
            sum += number;
        }
        return sum;
    }
}

