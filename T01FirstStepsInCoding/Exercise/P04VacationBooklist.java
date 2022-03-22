package T01FirstStepsInCoding.Exercise;

import java.util.Scanner;

public class P04VacationBooklist {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Часове, в които прочита книгата = Всички страници / страници за час четене
        // Часове четене на ден = Часове, в които прочита книгата / дните
        // hoursForReading = allPages / pagesFor1HourReading
        // hoursReadingForDay = hoursForReading / days

        Integer allPages = Integer.parseInt(scanner.nextLine());
        Integer pagesFor1HourReading = Integer.parseInt(scanner.nextLine());
        Integer daysForReading = Integer.parseInt(scanner.nextLine());
        Integer hoursForReading = allPages / pagesFor1HourReading;
        Integer hoursReadingForDay = hoursForReading / daysForReading;
        System.out.println(hoursReadingForDay);
    }
}
