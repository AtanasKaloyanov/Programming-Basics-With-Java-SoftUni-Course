package T05WhileLoop.Lab;

import java.util.Scanner;

public class P06MaxNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//Напишете програма, която до получаване на командата "Stop", чете цели числа,
// въведени от потребителя и намира най-голямото измежду тях.
// Въвежда се по едно число на ред.

        String input = scanner.nextLine();
        int biggest = Integer.MIN_VALUE;

        while (!input.equals("Stop")) {
            int number = Integer.parseInt(input);

            if (number > biggest) {
                biggest = number;
            }

            input = scanner.nextLine();
        }
        System.out.println(biggest);
    }
}
