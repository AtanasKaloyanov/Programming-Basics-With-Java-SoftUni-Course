package T05WhileLoop.Lab;

import java.util.Scanner;

public class P02Password {
    public static void main(String[] args) {
        // 1. Input reading
        Scanner scanner = new Scanner(System.in);
        String account = scanner.nextLine();
        String password = scanner.nextLine();

        String input = scanner.nextLine();

        // 2. While cycle
        while (!input.equals(password)) {
            input = scanner.nextLine();
        }

        // 3. Output printing
        System.out.printf("Welcome %s!", account);
    }
}
