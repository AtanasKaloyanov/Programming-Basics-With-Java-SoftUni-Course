package T04ForLoop.MoreExercises;

import java.util.Scanner;

public class P11OddOrEvenSum {
    public static void main(String[] args) {
        // 1. Input reading
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        // 2. 6 counters logic implementation
        double oddSum = 0;
        double oddMin = Integer.MAX_VALUE;
        double oddMax = Integer.MIN_VALUE;
        double evenSum = 0;
        double evenMin = Integer.MAX_VALUE;
        double evenMax = Integer.MIN_VALUE;

        for (int i = 1; i <= n; i++) {
            double currentNumber = Double.parseDouble(scanner.nextLine());

            if (i % 2 != 0) {
                oddSum += currentNumber;
                oddMin = getMin(oddMin, currentNumber);
                oddMax = getMax(oddMax, currentNumber);
            } else {
                evenSum += currentNumber;
                evenMin = getMin(evenMin, currentNumber);
                evenMax = getMax(evenMax, currentNumber);
            }
        }

        // 3. Output printing
        System.out.printf("OddSum=%.2f,\n", oddSum);
        printMin(oddMin, "OddMin=No,", "OddMin=%.2f,\n");
        printMax(oddMax, "OddMax=No,", "OddMax=%.2f,\n");

        System.out.printf("EvenSum=%.2f,\n", evenSum);
        printMin(evenMin, "EvenMin=No,", "EvenMin=%.2f,\n");
        printMax(evenMax, "EvenMax=No", "EvenMax=%.2f");

    }

    private static void printMax(double oddMax, String x, String format) {
        if (oddMax == Integer.MIN_VALUE) {
            System.out.println(x);
        } else {
            System.out.printf(format, oddMax);
        }
    }

    private static void printMin(double oddMin, String x, String format) {
        if (oddMin == Integer.MAX_VALUE) {
            System.out.println(x);
        } else {
            System.out.printf(format, oddMin);
        }
    }

    private static double getMin(double min, double currentNumber) {
        if (currentNumber < min) {
            min = currentNumber;
        }
        return min;
    }

    private static double getMax(double max, double currentNumber) {
        if (currentNumber > max) {
            max = currentNumber;
        }
        return max;
    }
}


