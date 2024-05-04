package T06NestedLoops.MoreExercises;

import java.util.Scanner;

public class P13PrimePairs {
    public static void main(String[] args) {
        // 1. Input reading
        Scanner scanner = new Scanner(System.in);
        int firstPairBegin = Integer.parseInt(scanner.nextLine());
        int secondPairBegin = Integer.parseInt(scanner.nextLine());
        int firstPairDiff = Integer.parseInt(scanner.nextLine());
        int secondPairDiff = Integer.parseInt(scanner.nextLine());

        // 2. First and second pair's ends computation
        int firstPairEnd = firstPairBegin + firstPairDiff;
        int secondPairEnd = secondPairBegin + secondPairDiff;

        for (int i = firstPairBegin; i <= firstPairEnd; i++) {
            for (int j = secondPairBegin; j <= secondPairEnd; j++) {
                if (isPrime(i) && isPrime(j)) {
                    System.out.printf("%d%d\n", i, j);
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
