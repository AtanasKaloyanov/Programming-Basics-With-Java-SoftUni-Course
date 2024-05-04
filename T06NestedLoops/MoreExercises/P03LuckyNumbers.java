package T06NestedLoops.MoreExercises;

import java.util.Scanner;

public class P03LuckyNumbers {
    public static void main(String[] args) {
        // 1. Input reading
        Scanner scanner = new Scanner(System.in);
        int N = Integer.parseInt(scanner.nextLine());

        // 2. Output printing via 4 nested loops
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                for (int k = 1; k <= 9; k++) {
                    for (int l = 1; l <= 9; l++) {
                        int firstSum = i + j;
                        int secondSum = k + l;
                        boolean firstCond = firstSum == secondSum;
                        boolean secondCond = N % firstSum == 0;
                        if (firstCond && secondCond) {
                            int luckyNumber = numberGenerated(i, j, k, l);
                            System.out.print(luckyNumber + " ");
                        }
                    }
                }
            }
        }
    }

    private static int numberGenerated(int i, int j, int k, int l) {
        char firstNumber = (char) (i + 48);
        char secondNumber = (char) (j + 48);
        char thirdNumber = (char) (k + 48);
        char fourthNumber = (char) (l + 48);
        String numberAsString = String.valueOf(firstNumber) +
                secondNumber + thirdNumber + fourthNumber;
        int currentNumber = Integer.parseInt(numberAsString);
        return currentNumber;
    }
}
