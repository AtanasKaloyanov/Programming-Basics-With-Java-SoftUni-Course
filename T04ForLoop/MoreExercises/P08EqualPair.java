package T04ForLoop.MoreExercises;

import java.util.Scanner;

public class P08EqualPair {
    public static void main(String[] args) {
        // 1. Input reading
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        // 2. Min and Max sum finding
        int previousSum = Integer.MIN_VALUE;
        int currentSum = Integer.MIN_VALUE;

        int maxDifference = 0;

        for (int i = 0; i < n; i++) {
            int first = Integer.parseInt(scanner.nextLine());
            int second = Integer.parseInt(scanner.nextLine());
            currentSum = first + second;

            if ( (previousSum != Integer.MIN_VALUE) && (previousSum != currentSum) ) {
                int currentDifference = Math.max(currentSum, previousSum) - Math.min(currentSum, previousSum);

                if (currentDifference > maxDifference) {
                    maxDifference = currentDifference;
                }
            }

            previousSum = currentSum;
        }

        // 3. Output printing - 2 cases:
        if (maxDifference == 0) {
            System.out.printf("Yes, value=%d", currentSum);
        } else {
            System.out.printf("No, maxdiff=%d", maxDifference);
        }

    }
}
