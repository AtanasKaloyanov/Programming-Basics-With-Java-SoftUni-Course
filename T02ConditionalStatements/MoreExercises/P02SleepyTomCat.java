package T02ConditionalStatements.MoreExercises;

import java.util.Scanner;

public class P02SleepyTomCat {
    public static void main(String[] args) {
        // 1. Input reading
        Scanner scanner = new Scanner(System.in);
        int freeDays = Integer.parseInt(scanner.nextLine());

        // 2. Computing of the minutes
        int workDays = 365 - freeDays;
        int playingMinutes = 127 * freeDays + 63 * workDays;

        // 3. Output printing
        if (playingMinutes > 30000) {
            int additionalMinutes = playingMinutes - 30000;
            int hours = additionalMinutes / 60;
            int minutes = additionalMinutes % 60;
            System.out.println("Tom will run away");
            System.out.printf("%d hours and %d minutes more for play", hours, minutes);
        } else {
            int leftMinutes = 30000 - playingMinutes;
            int hours = leftMinutes / 60;
            int minutes = leftMinutes % 60;
            System.out.println("Tom sleeps well");
            System.out.printf("%d hours and %d minutes less for play", hours, minutes);
        }
    }
}
