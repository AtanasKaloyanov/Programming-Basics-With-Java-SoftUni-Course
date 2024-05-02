package T05WhileLoop.MoreExercises;

import java.util.Scanner;

public class P03StreamOfLetters {
    public static void main(String[] args) {
        // 1. Input reading
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        StringBuilder password = new StringBuilder();
        StringBuilder word = new StringBuilder();

        // 2. While cycle
        while (!input.equals("End")) {
            char currentChar = input.charAt(0);
            if (!Character.isLetter(currentChar)) {
                continue;
            }

            if ( (currentChar == 'c' && !password.toString().contains("c"))
                    || (currentChar == 'o' && !password.toString().contains("o"))
                    || (currentChar == 'n' && !password.toString().contains("n"))) {
                password.append(currentChar);
                if (password.toString().contains("c") && password.toString().contains("o")
                        && password.toString().contains("n")) {
                    System.out.print(word + " ");
                    word.setLength(0);
                    password.setLength(0);
                }
                continue;
            }

            word.append(currentChar);
            input = scanner.nextLine();
        }
    }
}
