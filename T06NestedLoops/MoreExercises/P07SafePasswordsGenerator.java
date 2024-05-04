package T06NestedLoops.MoreExercises;

import java.util.Scanner;

public class P07SafePasswordsGenerator {
    public static void main(String[] args) {
        // 1. Input reading
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        int maxPasswords = Integer.parseInt(scanner.nextLine());

        // 2. Nested Loops

        int A = 35;
        int B = 64;
        int passwordsCounter = 0;

        for (int i = 1; i <= a ; i++) {
            for (int j = 1; j <= b; j++) {
                char AChar = (char) A;
                char BChar = (char) B;
                System.out.printf("%c%c%d%d%c%c|", AChar, BChar, i, j, BChar, AChar);

                passwordsCounter++;
                if (passwordsCounter == maxPasswords) {
                    return;
                }

                A++;
                if (A == 56) {
                    A = 35;
                }

                B++;
                if (B == 97) {
                    B = 64;
                }

            }
        }
    }
}
