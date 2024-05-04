package T06NestedLoops.MoreExercises;

import java.util.Scanner;

public class P10Profit {
    public static void main(String[] args) {
        // 1. Input reading
        Scanner scanner = new Scanner(System.in);
        int oneCoinsNumber = Integer.parseInt(scanner.nextLine());
        int twoCoinsNumber = Integer.parseInt(scanner.nextLine());
        int fiveCoinsNumber = Integer.parseInt(scanner.nextLine());
        int sum = Integer.parseInt(scanner.nextLine());

        // 2. Output printing via 3 for loops
        for (int i = 0; i <= oneCoinsNumber; i++) {
            for (int j = 0; j <= twoCoinsNumber; j++) {
                for (int k = 0; k <= fiveCoinsNumber; k++) {
                    boolean cond =  (i + j * 2 + k * 5 == sum);
                    if (cond) {
                        System.out.printf("%d * 1 lv. + %d * 2 lv. + %d * 5 lv. = %d lv.\n", i, j, k, sum);
                    }
                }
            }
        }

    }
}
