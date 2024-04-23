package T02ConditionalStatements.Exercise2;

import java.util.Scanner;

public class P03 {
    public static void main(String[] args) {
        // 1. Input Reading
        Scanner scanner = new Scanner(System.in);
        int hours = Integer.parseInt(scanner.nextLine());
        int minutes = Integer.parseInt(scanner.nextLine());

        // 2. Adding the hours and 15 minutes to the minutes and computing the new hours and minutes
        minutes += hours * 60 + 15;
        int hoursIn15Minutes = minutes / 60;
        int minutesIn15minutes = minutes % 60;

        // 3. Check if hours are 24
        if (hoursIn15Minutes == 24) {
            hoursIn15Minutes = 0;
        }

        // 4. Printing with a leading zero
        if (minutesIn15minutes <= 9) {
            System.out.printf("%d:0%d", hoursIn15Minutes, minutesIn15minutes);
        } else {
            System.out.printf("%d:%d", hoursIn15Minutes, minutesIn15minutes);

        }
    }
}
