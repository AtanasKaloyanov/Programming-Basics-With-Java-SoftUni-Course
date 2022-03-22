package T02ConditionalStatements.Exercise;

import java.util.Scanner;

public class P03TimePlus15min {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hours = Integer.parseInt(scanner.nextLine());
        int minutes = Integer.parseInt(scanner.nextLine());

        int minutesPlus15 = minutes + 15;

        if (minutesPlus15 >= 60) {
            hours = hours + 1;
            minutesPlus15 = minutesPlus15 % 60;
        }

        if (hours == 24) {
            hours = 0;
        }

        if (minutesPlus15 < 10) {
            System.out.printf("%d:0%d", hours, minutesPlus15);
        } else {
            System.out.printf("%d:%d", hours, minutesPlus15);

        }
    }
}
