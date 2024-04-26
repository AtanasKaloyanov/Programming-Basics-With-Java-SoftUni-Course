package T04ForLoop.Lab;

import java.util.Scanner;

public class P02NumberFromNto1 {
    public static void main(String[] args) {
        // 1. Input reading
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        // 2. Output printing
        for (int i = n; i >= 1; i--) {
            System.out.println(i);
        }
    }
}
