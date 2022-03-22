package T02ConditionalStatements.Exercise;

import java.util.Scanner;

public class P01SumSeconds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int speed1 = Integer.parseInt(scanner.nextLine());
        int speed2 = Integer.parseInt(scanner.nextLine());
        int speed3 = Integer.parseInt(scanner.nextLine());

        int totalSpeed = speed1 + speed2 + speed3;
        int minutes = totalSpeed / 60;
        int seconds = totalSpeed % 60;

        if (seconds < 10) {
            System.out.printf("%d:0%d", minutes, seconds);
        } else {
            System.out.printf("%d:%d", minutes, seconds);
        }
    }
}
