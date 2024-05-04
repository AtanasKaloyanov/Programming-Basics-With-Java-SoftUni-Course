package T06NestedLoops.MoreExercises;

import java.util.Scanner;

public class P04CarNumber {
    public static void main(String[] args) {
        // 1. Input reading
        Scanner scanner = new Scanner(System.in);
        int begin = Integer.parseInt(scanner.nextLine());
        int end = Integer.parseInt(scanner.nextLine());

        // 2. 4 nested loops
        for (int i = begin; i <= end; i++) {
            for (int j = begin; j <= end; j++) {
                for (int k = begin; k <= end; k++) {
                    for (int l = begin; l <= end; l++) {
                        boolean firstCond = ( ( (i % 2 == 0) && (l % 2 != 0) ) || ( (i % 2 != 0) && (l % 2 == 0) ) );
                        boolean secondCond = i > l;
                        boolean thirdCond = (j + k) % 2 == 0;
                        if (firstCond && secondCond && thirdCond) {
                            int rightNumber = numberGenerated(i, j, k, l);
                            System.out.print(rightNumber + " ");
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
