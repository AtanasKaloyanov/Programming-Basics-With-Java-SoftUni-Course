package T06NestedLoops.Exercise;

import java.util.Scanner;

public class P02EqualSumEvenOddPositions {
    public static void main(String[] args) {
        // 1. Input reading
        Scanner scanner = new Scanner(System.in);
        int begin = Integer.parseInt(scanner.nextLine());
        int end = Integer.parseInt(scanner.nextLine());

        // 2. Odd and Even sum computation of the numbers between the begin and the end
        for (int i = begin; i <= end ; i++) {
            int oddSum = 0;
            int evenSum = 0;
            for (int j = 1; j <= 6; j++) {
                String numberAsString = String.valueOf(i);
                char currentChar = numberAsString.charAt(j - 1);
                int currentCharAsNumber = Integer.parseInt(String.valueOf(currentChar));
                if (j % 2 != 0) {
                    oddSum += currentCharAsNumber;
                } else {
                    evenSum += currentCharAsNumber;
                }
            }

            if (oddSum == evenSum) {
                System.out.print(i + " ");
            }
        }
    }
}
