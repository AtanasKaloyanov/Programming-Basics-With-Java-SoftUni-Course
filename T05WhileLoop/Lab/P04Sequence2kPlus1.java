package T05WhileLoop.Lab;

import java.util.Scanner;

public class P04Sequence2kPlus1 {
    public static void main(String[] args) {
        // 1. Input reading
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());

        // 2. Cycle with step i = i * 2 + 1 and printing
        for (int i = 1; i <= number; i = i * 2 + 1) {
            System.out.println(i);
        }
    }
}
