package T04ForLoop.Lab;

import java.util.Scanner;

public class P08NumberSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        Напишете програма, която чете n на брой цели числа.
//        Принтирайте най-голямото и най-малкото число сред въведените.

        int n = Integer.parseInt(scanner.nextLine());
        int smallest = Integer.MAX_VALUE;
        int biggest = Integer.MIN_VALUE;

        for (int i = 1; i <= n; i++) {

            int a = Integer.parseInt(scanner.nextLine());
            if (a < smallest)
                smallest = a;

            if (a > biggest)  biggest = a;

        }

        System.out.printf("Max number: %d%n", biggest);
        System.out.printf("Min number: %d", smallest);

    }
}