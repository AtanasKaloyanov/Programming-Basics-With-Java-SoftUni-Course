package T06NestedLoops.Lab;

import java.util.Scanner;

public class P03Combinations {
    public static void main(String[] args) {
        // 1. Input reading
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int solutions = 0;

        // 3. Counting via 3 for cycles
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= n; j++) {
                for (int k = 0; k <= n; k++) {
                    int result = i + j + k;
                    if (result == n) {
                        solutions++;
                    }
                }
            }
        }

        // 3. Output printing
        System.out.println(solutions);
    }
}
