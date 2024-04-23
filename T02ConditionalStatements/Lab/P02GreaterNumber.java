package T02ConditionalStatements.Lab;

import java.util.Scanner;

public class P02GreaterNumber {
    public static void main(String[] args) {
        // 1. Reading the input
        Scanner scanner = new Scanner(System.in);
        int first = Integer.parseInt(scanner.nextLine());
        int second = Integer.parseInt(scanner.nextLine());

        // 2. Printing the greater number
        System.out.println(Math.max(first, second));
    }
}
