package T01FirstStepsInCoding.MoreExercises;

import java.util.Scanner;

public class P08CircleAreaAndPerimeter {
    public static void main(String[] args) {
        // 1. Input Reading
        Scanner scanner = new Scanner(System.in);
        double r = Double.parseDouble(scanner.nextLine());

        // 2. Calculations
        double circleArea = Math.PI * r * r;
        double parameterArea = 2 * Math.PI * r;

        // 3. Printing
        System.out.printf("%.2f\n", circleArea);
        System.out.printf("%.2f", parameterArea);
    }
}
