package T02ConditionalStatements.Exercise2;

import java.util.Scanner;

public class P01 {
    public static void main(String[] args) {
        // 1 Input reading
        Scanner scanner = new Scanner(System.in);
        int seconds1 = Integer.parseInt(scanner.nextLine());
        int seconds2 = Integer.parseInt(scanner.nextLine());
        int seconds3 = Integer.parseInt(scanner.nextLine());

        // 2. Finding the sum of the seconds then the minutes and the seconds
        int sum = seconds1 + seconds2 + seconds3;
        int minutes = sum / 60;
        int seconds = sum % 60;

        // 3. Printing with a leading zero
        if (seconds <= 9) {
            System.out.printf("%d:0%d", minutes, seconds);
        } else {
            System.out.printf("%d:%d", minutes, seconds);
        }
    }
}
