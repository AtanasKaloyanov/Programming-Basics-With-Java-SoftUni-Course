package T06NestedLoops.Exercise;

import java.util.Scanner;

public class P01NumberPyramid {
    public static void main(String[] args) {
        // 1. Input reading
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        // 2. Output printing via 2 for cycles
        int currentNumber = 1;
        boolean isBigger = false;

        for (int rows = 1; rows <= n ; rows++) {
            for (int print = 1; print <= rows; print++) {

                System.out.print(currentNumber + " ");
                currentNumber++;
                if ( currentNumber > n) {
                    isBigger = true;
                    break;
                }
            }

            System.out.println();
            if (isBigger) {
                break;
            }
        }

    }
}

