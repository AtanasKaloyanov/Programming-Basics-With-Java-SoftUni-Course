package T06NestedLoops.MoreExercises;

import java.util.Scanner;

public class P14PasswordGenerator {
    public static void main(String[] args) {
        // 1. Input reading
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int l = Integer.parseInt(scanner.nextLine());

        // 2. 5 nested loops
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                for (int k = 1; k <= l; k++) {
                    int realInt = k + 96;
                    char third = (char) realInt;
                    for (int m = 1; m <= l; m++) {
                        int realInt2 = m + 96;
                        char fourth = (char) realInt2;
                        for (int o = 1; o <= n; o++) {
                            if (o > i && o > j) {
                                System.out.printf("%d%d%c%c%d ", i, j, third, fourth, o);
                            }
                        }
                    }
                }
            }
        }
    }
}
