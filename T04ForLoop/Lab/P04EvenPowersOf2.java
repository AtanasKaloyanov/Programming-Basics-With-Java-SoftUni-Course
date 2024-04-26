package T04ForLoop.Lab;

import java.util.Scanner;

public class P04EvenPowersOf2 {
    public static void main(String[] args) {
        // 1. Input reading
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        // 2. Output printing
        for (int i = 0; i <= n; i += 2) {
            int twoOnI = (int) Math.pow(2, i);
            System.out.println(twoOnI);
        }

    }
}
