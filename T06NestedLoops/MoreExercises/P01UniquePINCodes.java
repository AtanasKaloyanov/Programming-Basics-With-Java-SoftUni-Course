package T06NestedLoops.MoreExercises;

import java.util.Scanner;

public class P01UniquePINCodes {
    public static void main(String[] args) {
        // 1. Input reading
        Scanner scanner = new Scanner(System.in);
        int firstNumberEnd = Integer.parseInt(scanner.nextLine());
        int secondNumberEnd = Integer.parseInt(scanner.nextLine());
        int thirdNumberEnd = Integer.parseInt(scanner.nextLine());
        
        // 2. Nested Loops
        for (int i = 1; i <= firstNumberEnd; i++) {
            for (int j = 1; j <= secondNumberEnd; j++) {
                for (int k = 1; k <= thirdNumberEnd; k++) {
                    if ( (i % 2 == 0) && (isPrime(j)) && (k % 2 == 0) ) {
                        System.out.printf("%d %d %d\n", i, j, k);
                    }
                }
            }
        }
    }
    private static boolean isPrime(int k) {
        if (k == 1) {
            return false;
        }
        int sqrt = (int) Math.sqrt(k);
        for (int i = 2; i <= sqrt; i++) {
            if (k % i == 0) {
                return false;
            }
        }
        return true;
    }
}
