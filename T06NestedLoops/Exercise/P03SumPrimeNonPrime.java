package T06NestedLoops.Exercise;

import java.util.Scanner;

public class P03SumPrimeNonPrime {
    public static void main(String[] args) {
        // 1. Input reading
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();


        // 2. Computation of prime and non-prime sum via while cycle
        int primeSum = 0;
        int nonPrime = 0;

        while (!input.equals("stop")) {
            int currentNumber = Integer.parseInt(input);
            if (currentNumber < 0) {
                System.out.println("Number is negative.");
                input = scanner.nextLine();
                continue;
            }

            boolean isPrime = isPrime(currentNumber);
            if (isPrime) {
                primeSum += currentNumber;
            } else {
                nonPrime += currentNumber;
            }

            input = scanner.nextLine();
        }

        // 3. Output printing
        System.out.printf("Sum of all prime numbers is: %d\n", primeSum);
        System.out.printf("Sum of all non prime numbers is: %d", nonPrime);
    }

    private static boolean isPrime(int currentNumber) {
        int square = (int) Math.sqrt(currentNumber);

        for (int i = 2; i <= square; i++) {
            if (currentNumber % i == 0) {
                return false;
            }
        }
        return true;
    }
}
