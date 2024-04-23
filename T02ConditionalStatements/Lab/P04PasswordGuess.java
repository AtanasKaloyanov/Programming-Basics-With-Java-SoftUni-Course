package T02ConditionalStatements.Lab;

import java.util.Scanner;

public class P04PasswordGuess {
    public static void main(String[] args) {
        // 1. Reading the input
        Scanner scanner = new Scanner(System.in);
        String password = scanner.nextLine();

        // 2. Printing
        if (password.equals("s3cr3t!P@ssw0rd")) {
            System.out.println("Welcome");
        } else {
            System.out.println("Wrong password!");
        }
    }
}
