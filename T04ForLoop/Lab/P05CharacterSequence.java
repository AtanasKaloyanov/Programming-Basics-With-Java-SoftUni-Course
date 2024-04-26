package T04ForLoop.Lab;

import java.util.Scanner;

public class P05CharacterSequence {
    public static void main(String[] args) {
        // 1. Input reading
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();

        // 2. Output printing
        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);
            System.out.println(currentChar);
        }
    }
}
