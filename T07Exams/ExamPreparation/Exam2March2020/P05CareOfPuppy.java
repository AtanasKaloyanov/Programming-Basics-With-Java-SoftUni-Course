package T07Exams.ExamPreparation.Exam2March2020;

import java.util.Scanner;

public class P05CareOfPuppy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int allFood = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();

        int allEatenFood = 0;

        while(!input.equals("Adopted")) {
            int eatenFoodForDay = Integer.parseInt(input);

            allEatenFood = eatenFoodForDay + allEatenFood;

            input = scanner.nextLine();
        }

        if (allFood * 1000 >= allEatenFood) {
            int leftedFood = allFood * 1000 - allEatenFood;
            System.out.printf("Food is enough! Leftovers: %d grams.", leftedFood);
        } else {
            int neededFood = allEatenFood - allFood * 1000;
            System.out.printf("Food is not enough. You need %d grams more.", neededFood);
        }

    }
}
