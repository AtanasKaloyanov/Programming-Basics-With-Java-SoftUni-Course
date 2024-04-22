package T01FirstStepsInCoding.MoreExercises;

import java.util.Scanner;

public class P03CelsiusToFahrenheit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double celsiusGrades = Double.parseDouble(scanner.nextLine());
        double fahrenheitGrades = celsiusGrades * 1.8 + 32;
        System.out.printf("%.2f", fahrenheitGrades);
    }
}
