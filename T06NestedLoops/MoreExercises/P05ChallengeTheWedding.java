package T06NestedLoops.MoreExercises;

import java.util.Scanner;

public class P05ChallengeTheWedding {
    public static void main(String[] args) {
        // 1. Input reading
        Scanner scanner = new Scanner(System.in);
        int men = Integer.parseInt(scanner.nextLine());
        int women = Integer.parseInt(scanner.nextLine());
        int tableLimit = Integer.parseInt(scanner.nextLine());

        // 2. Output printing via 2 nested for loops
        int tableCounter = 0;
        for (int i = 1; i <= men; i++) {
            for (int j = 1; j <= women; j++) {
                System.out.printf("(%d <-> %d) ", i, j);
                tableCounter++;
                if (tableCounter == tableLimit) {
                    return;
                }
            }
        }

    }
}
