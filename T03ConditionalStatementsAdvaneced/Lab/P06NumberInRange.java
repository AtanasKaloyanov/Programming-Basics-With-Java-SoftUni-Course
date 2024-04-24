package T03ConditionalStatementsAdvaneced.Lab;

import java.util.Scanner;

public class P06NumberInRange {
    public static void main(String[] args) {
        // 1. Input reading
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());

        // 2. Conditions
        String output = number >= -100 && number <= 100 && number != 0 ? "Yes" : "No";

        // 3. Output printing
        System.out.println(output);
    }
}
