package T02ConditionalStatements.MoreExercises;

import java.util.Scanner;

public class P05Pets {
    public static void main(String[] args) {
        // 1. Input reading
        Scanner scanner = new Scanner(System.in);
        int days = Integer.parseInt(scanner.nextLine());
        int allFood = Integer.parseInt(scanner.nextLine());
        double dogFood = Double.parseDouble(scanner.nextLine());
        double catFood = Double.parseDouble(scanner.nextLine());
        double turtleFood = Double.parseDouble(scanner.nextLine());

        // 2. Converting the turtle food into kg
        turtleFood /= 1000;
        double sumFood = dogFood * days + catFood * days + turtleFood * days;

        // 3. Output printing - 2 cases
        if (allFood > sumFood) {
            double leftFood = Math.floor(allFood - sumFood);
            System.out.printf("%.0f kilos of food left.", leftFood);
        } else {
            double neededFood = Math.ceil(sumFood - allFood);
            System.out.printf("%.0f more kilos of food are needed.", neededFood);
        }
    }
}
