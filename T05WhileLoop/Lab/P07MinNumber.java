package T05WhileLoop.Lab;

import java.util.Scanner;

public class P07MinNumber {
    public static void main(String[] args) {
        // 1. Input reading
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();

        // 2. Finding the best number via while cycle
        int smallestNumber = Integer.MAX_VALUE;
        while (!line.equals("Stop")) {
            int number = Integer.parseInt(line);
            if (number < smallestNumber) {
                smallestNumber = number;
            }
            line = scanner.nextLine();
        }

        // 3. Output printing
        System.out.println(smallestNumber);
    }
}
