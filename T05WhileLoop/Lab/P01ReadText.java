package T05WhileLoop.Lab;

import java.util.Scanner;

public class P01ReadText {
    public static void main(String[] args) {
        // 1. Input reading
        Scanner scanner = new Scanner(System.in);
        String currentLine = scanner.nextLine();

        // 2. While cycle
        while (!currentLine.equals("Stop")) {
            System.out.println(currentLine);
            currentLine = scanner.nextLine();
        }
    }
}
