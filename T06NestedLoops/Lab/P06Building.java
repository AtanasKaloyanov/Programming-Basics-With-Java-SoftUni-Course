package T06NestedLoops.Lab;

import java.util.Scanner;

public class P06Building {
    public static void main(String[] args) {
        // 1. Input reading
        Scanner scanner = new Scanner(System.in);
        int floors = Integer.parseInt(scanner.nextLine());
        int rooms = Integer.parseInt(scanner.nextLine());

        // 2. Output printing via nested loops
        for (int i = floors; i >= 1; i--) {
            for (int j = 0; j < rooms; j++) {
                if (i == floors) {
                    printLastFloor(i, j);
                } else {
                    printFloor(i, j);
                }
            }
            System.out.println();
        }
    }
    private static void printLastFloor(int i, int j) {
        System.out.printf("L%d%d ", i, j);
    }
    private static void printFloor(int i, int j) {
        if (i % 2 == 0) {
            System.out.printf("O%d%d ", i, j);
        } else {
            System.out.printf("A%d%d ", i, j);
        }
    }
}
