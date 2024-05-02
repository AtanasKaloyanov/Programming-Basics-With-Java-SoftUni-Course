package T05WhileLoop.MoreExercises;

import java.util.Scanner;

public class P05AverageNumber {
    public static void main(String[] args) {
        // 1. Input reading
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        // 2. Sum computation
        int sum = 0;
        for (int i = 0; i < n; i++) {
            int currentNumber = Integer.parseInt(scanner.nextLine());
            sum += currentNumber;
        }

        // 3. Average sum computation and printing
        double avg = sum * 1.0 / n;
        System.out.printf("%.2f", avg);
    }
}
