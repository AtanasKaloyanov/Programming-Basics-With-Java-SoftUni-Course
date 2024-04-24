package T03ConditionalStatementsAdvaneced.Lab;

import java.util.Scanner;

public class P10InvalidNumber {
    public static void main(String[] args) {
        // 1. Input reading
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());

        // 2. Output printing
        if ( (number < 100 || number > 200) && number != 0) {
            System.out.println("invalid");
        }
    }
}
