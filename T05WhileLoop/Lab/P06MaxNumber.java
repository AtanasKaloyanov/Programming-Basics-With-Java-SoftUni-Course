package T05WhileLoop.Lab;

import java.util.Scanner;

public class P06MaxNumber {
    public static void main(String[] args) {
        // 1. Input reading
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();

        // 2. Finding the best number via while cycle
        int bestNumber = Integer.MIN_VALUE;
        while (!line.equals("Stop")) {
            int number = Integer.parseInt(line);
            if (number > bestNumber) {
                bestNumber = number;
            }
            line = scanner.nextLine();
        }

        // 3. Output printing
        System.out.println(bestNumber);
    }
}
