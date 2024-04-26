package T04ForLoop.Lab;

import java.util.Scanner;

public class P06VowelsSum {
    public static void main(String[] args) {
        // 1. Input reading
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();

        // 2. Sum computation
        int sum = 0;
        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);
            sum = getSum(sum, currentChar);
        }

        // 3. Output printing
        System.out.println(sum);
    }

    private static int getSum(int sum, char currentChar) {
        switch (currentChar) {
            case 'a':
                sum += 1;
                break;

            case 'e':
                sum += 2;
                break;

            case 'i':
                sum += 3;
                break;

            case 'o':
                sum += 4;
                break;

            case 'u':
                sum += 5;
                break;

        }
        return sum;
    }
}
