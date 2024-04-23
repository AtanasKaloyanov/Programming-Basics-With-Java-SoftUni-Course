package T02ConditionalStatements.Lab;

import java.util.Scanner;

public class P01ExcellentResult {
    public static void main(String[] args) {
        // 1. Reading input
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());

        // 2. printing "Excellent!" if the number is equals or greater than 5
        if (number >= 5) {
            System.out.println("Excellent!");
        }
    }
}
