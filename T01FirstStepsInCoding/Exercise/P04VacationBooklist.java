package T01FirstStepsInCoding.Exercise;

import java.util.Scanner;

public class P04VacationBooklist {
    public static void main(String[] args) {

        // 1. Input reading
        Scanner scanner = new Scanner(System.in);
        Integer allPages = Integer.parseInt(scanner.nextLine());
        Integer pagesFor1HourReading = Integer.parseInt(scanner.nextLine());
        Integer daysForReading = Integer.parseInt(scanner.nextLine());

        // 2.  hoursForReading = allPages / pagesFor1HourReading
        Integer hoursForReading = allPages / pagesFor1HourReading;

        //3. // hoursReadingForDay = hoursForReading / days
        Integer hoursReadingForDay = hoursForReading / daysForReading;

        // 4. Result printing
        System.out.println(hoursReadingForDay);
    }
}
