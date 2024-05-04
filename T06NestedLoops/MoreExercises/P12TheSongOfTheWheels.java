package T06NestedLoops.MoreExercises;

import java.util.Scanner;

public class P12TheSongOfTheWheels {
    public static void main(String[] args) {
        // 1. Input reading
        Scanner scanner = new Scanner(System.in);
        int M = Integer.parseInt(scanner.nextLine());

        // 2. Password finding via 4 nested for loops
        int counter = 0;
        StringBuilder password = new StringBuilder();
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                for (int k = 1; k <= 9; k++) {
                    for (int l = 1; l <= 9; l++) {
                        boolean firstCond = i < j;
                        boolean secondCond = k > l;
                        boolean thirdCond = M == i * j + k * l;
                        if (firstCond && secondCond && thirdCond) {
                            System.out.printf("%d%d%d%d ", i, j, k, l);
                            counter++;
                            if (counter == 4) {
                                password.append(i).append(j).append(k).append(l);
                            }
                        }
                    }
                }
            }
        }

        // 3. Output printing
        if (password.length() == 4) {
            System.out.println();
            System.out.printf("Password: %s", password);
        } else {
            System.out.println();
            System.out.println("No!");
        }

    }
}
