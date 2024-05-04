package T06NestedLoops.MoreExercises;

import java.util.Scanner;

public class P09SumOfTwoNumbers {
    public static void main(String[] args) {
        // 1. Input reading
        Scanner scanner = new Scanner(System.in);
        int begin = Integer.parseInt(scanner.nextLine());
        int end = Integer.parseInt(scanner.nextLine());
        int magicNumber = Integer.parseInt(scanner.nextLine());

        // 2. Counting and finding that is equal to the magic number via nested for loops
        int counter = 0;
        for (int i = begin; i <= end; i++) {
            for (int j = begin; j <= end; j++) {
                counter++;
                if (i + j == magicNumber) {
                    System.out.printf("Combination N:%d (%d + %d = %d)", counter, i, j, magicNumber);
                    return;
                }
            }
        }

        // 3. Output printing
        System.out.printf("%d combinations - neither equals %d", counter, magicNumber);
    }
}
