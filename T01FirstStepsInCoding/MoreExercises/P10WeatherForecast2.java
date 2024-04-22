package T01FirstStepsInCoding.MoreExercises;

import java.util.Scanner;

public class P10WeatherForecast2 {
    public static void main(String[] args) {

        // 1. Input reading
        Scanner scanner = new Scanner(System.in);
        double grades = Double.parseDouble(scanner.nextLine());

        // 3. Finding message  - 5 options
        String message = "";
        if (grades >= 26 && grades <= 35) {
            message = "Hot";
        } else if (grades >= 20.1 && grades <= 25.9) {
            message = "Warm";
        } else if (grades >= 15 && grades <= 20) {
            message = "Mild";
        } else if (grades >= 12 && grades <= 14.9) {
            message = "Cool";
        } else if (grades >= 5 && grades <= 11.9) {
             message = "Cold";
        } else {
            message = "unknown";
        }

        // 3. Printing the message
        System.out.println(message);
    }
}
