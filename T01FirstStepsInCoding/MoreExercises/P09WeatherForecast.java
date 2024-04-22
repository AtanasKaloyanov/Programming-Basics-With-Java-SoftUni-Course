package T01FirstStepsInCoding.MoreExercises;

import java.util.Scanner;

public class P09WeatherForecast {
    public static void main(String[] args) {
        // 1. Input Reading
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        // 2. Printing - 2 options:
        if (input.equals("sunny")) {
            System.out.println("It's warm outside!");
        } else {
            System.out.println("It's cold outside!");
        }
    }
}
