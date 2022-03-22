package T05WhileLoop.Lab;

import java.util.Scanner;

public class P07MinNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        int smallest = Integer.MAX_VALUE;

        while (!input.equals("Stop")) {
            int number = Integer.parseInt(input);

            if (number < smallest) {
                smallest = number;
            }

            input = scanner.nextLine();
        }
        System.out.println(smallest);
    }
}
