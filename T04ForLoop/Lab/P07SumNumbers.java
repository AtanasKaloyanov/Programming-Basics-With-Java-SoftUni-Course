package T04ForLoop.Lab;

import java.util.Scanner;

public class P07SumNumbers {
    public static void main(String[] args) {
        // 1. Input reading
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        // 2. Sum computing
        int sum = 0;
        for (int i = 0; i < n; i++) {
            int currentNumber = Integer.parseInt(scanner.nextLine());
            sum += currentNumber;
        }

        // 3. Output printing
        System.out.println(sum);
    }
}
