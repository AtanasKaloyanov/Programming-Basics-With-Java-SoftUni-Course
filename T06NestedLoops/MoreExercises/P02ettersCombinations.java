package T06NestedLoops.MoreExercises;

import java.util.Scanner;

public class P02ettersCombinations {
    public static void main(String[] args) {
        // 1. Input reading
        Scanner scanner = new Scanner(System.in);
        char begin = scanner.nextLine().charAt(0);
        char end = scanner.nextLine().charAt(0);
        char exception = scanner.nextLine().charAt(0);

        // 2. Counting and printing via 3 nested loops
        int counter = 0;
        for (int i = begin; i <= end; i++) {
            for (int j = begin; j <= end; j++) {
                for (int k = begin; k <= end; k++) {
                    if ( (i != exception) && (j != exception) && (k != exception) ) {
                        char firstChar = (char) (i);
                        char secondChar = (char) (j);
                        char thirdChar = (char) (k);
                        System.out.printf("%c%c%c ", firstChar, secondChar, thirdChar);
                        counter++;
                    }
                }
            }
        }

        // 3. Counter printing
        System.out.printf("%d", counter);
    }
}
