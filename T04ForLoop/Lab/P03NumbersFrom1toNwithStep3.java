package T04ForLoop.Lab;

import java.util.Scanner;

public class P03NumbersFrom1toNwithStep3 {
    public static void main(String[] args) {
        // 1. Input reading
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        // 2. Output printing
        for (int i = 1; i <= n; i += 3) {
            System.out.println(i);
        }
    }
}
