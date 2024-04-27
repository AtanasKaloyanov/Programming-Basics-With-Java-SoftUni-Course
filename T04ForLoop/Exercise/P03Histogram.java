package T04ForLoop.Exercise;

import java.util.Scanner;

public class P03Histogram {
    private static int p1;
    private static int p2;
    private static int p3;
    private static int p4;
    private static int p5;

    public static void main(String[] args) {
        // 1. Input reading
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        // 2. Counters incrementation
        for (int i = 0; i < n; i++) {
            int currentNumber = Integer.parseInt(scanner.nextLine());
            numberCounting(currentNumber);
        }

        // 3. Percentage computing
        double p1percentage = (p1 * 1.00 / n) * 100;
        double p2percentage = (p2 * 1.00 / n) * 100;
        double p3percentage = (p3 * 1.00 / n) * 100;
        double p4percentage = (p4 * 1.00 / n) * 100;
        double p5percentage = (p5 * 1.00 / n) * 100;

        // 4. Output printing
        System.out.printf("%.2f%%\n", p1percentage);
        System.out.printf("%.2f%%\n", p2percentage);
        System.out.printf("%.2f%%\n", p3percentage);
        System.out.printf("%.2f%%\n", p4percentage);
        System.out.printf("%.2f%%", p5percentage);
    }

    private static void numberCounting(int currentNumber) {
        if (currentNumber < 200) {
            p1++;
        } else if (currentNumber < 400) {
            p2++;
        } else if (currentNumber < 600) {
            p3++;
        } else if (currentNumber < 800) {
            p4++;
        } else {
            p5++;
        }
    }
}


