package T06NestedLoops.MoreExercises;

import java.util.Scanner;

public class P08SecretDoorsLock {
    public static void main(String[] args) {
        // 1. Input reading
        Scanner scanner = new Scanner(System.in);
        int firstBorder = Integer.parseInt(scanner.nextLine());
        int secondBorder = Integer.parseInt(scanner.nextLine());
        int thirdBorder = Integer.parseInt(scanner.nextLine());

        // 2. Output printing via 3 nested loops
        for (int i = 1; i <= firstBorder; i++) {
            for (int j = 2; j <= secondBorder; j++) {
                if (j == 8 || j == 9) {
                    continue;
                }
                for (int k = 1; k <= thirdBorder; k++) {
                    boolean first = i % 2 == 0;
                    boolean second = k % 2 == 0;
                    boolean third = isPrime(j);
                    if (first && second && third) {
                        System.out.printf("%d %d %d\n", i, j, k);
                    }
                }
            }
        }
    }
    private static boolean isPrime(int number) {
        int sqrt = (int) Math.sqrt(number);
        for (int i = 2; i <= sqrt; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
