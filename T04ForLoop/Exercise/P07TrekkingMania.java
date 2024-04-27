package T04ForLoop.Exercise;

import java.util.Scanner;

public class P07TrekkingMania {
    private static int p1;
    private static int p2;
    private static int p3;
    private static int p4;
    private static int p5;
    private static int people;

    public static void main(String[] args) {
        // 1. Reading input
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        // 2. Peak counting
        for (int i = 0; i < n; i++) {
            int currentNumber = Integer.parseInt(scanner.nextLine());
            peakCounting(currentNumber);
        }

        // 3. Percentage computing
        double p1Percentage = (p1 / (people * 1.00) ) * 100;
        double p2Percentage = (p2 / (people * 1.00) ) * 100;
        double p3Percentage = (p3 / (people * 1.00) ) * 100;
        double p4Percentage = (p4 / (people * 1.00) ) * 100;
        double p5Percentage = (p5 / (people * 1.00) ) * 100;

        // 4. Output printing
        System.out.printf("%.2f%%\n", p1Percentage);
        System.out.printf("%.2f%%\n", p2Percentage);
        System.out.printf("%.2f%%\n", p3Percentage);
        System.out.printf("%.2f%%\n", p4Percentage);
        System.out.printf("%.2f%%", p5Percentage);
    }
    private static void peakCounting(int currentNumber) {
        if (currentNumber <= 5) {
            p1 += currentNumber;
        } else if (currentNumber <= 12) {
            p2 += currentNumber;
        } else if (currentNumber <= 25) {
            p3 += currentNumber;
        } else if (currentNumber <= 40) {
            p4 += currentNumber;
        } else {
            p5 += currentNumber;
        }
        people += currentNumber;
    }
}
