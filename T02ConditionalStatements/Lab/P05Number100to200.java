package T02ConditionalStatements.Lab;

import java.util.Scanner;

public class P05Number100to200 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = Integer.parseInt(scanner.nextLine());

        if (a < 100) {
            System.out.println("Less than 100");
        } else if (a <= 200) {
            System.out.println("Between 100 and 200");
        } else if (a > 200) {
            System.out.println("Greater than 200");
        }
    }
}
