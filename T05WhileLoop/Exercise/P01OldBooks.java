package T05WhileLoop.Exercise;

import java.util.Scanner;

public class P01OldBooks {
    public static void main(String[] args) {
        // 1. Input reading
        Scanner scanner = new Scanner(System.in);
        String searchedString = scanner.nextLine();
        String input = scanner.nextLine();
        int counter = 0;

        // 2. While loop
        while (!input.equals("No More Books")) {
            if (input.equals(searchedString)) {
                System.out.printf("You checked %d books and found it.", counter);
                return;
            }
            counter++;
            input = scanner.nextLine();
        }

        // 3. Output printing
        System.out.println("The book you search is not here!");
        System.out.printf("You checked %d books.", counter);
    }
}

