package T01FirstStepsInCoding.MoreExercises;

import java.util.Scanner;

public class P04VegetableMarket {
    public static void main(String[] args) {
        // 1. Reading the input
        Scanner scanner = new Scanner(System.in);
        double vegetablesPrice = Double.parseDouble(scanner.nextLine());
        double fruitPrice = Double.parseDouble(scanner.nextLine());
        double vegetablesKg = Double.parseDouble(scanner.nextLine());
        double fruitKg = Double.parseDouble(scanner.nextLine());

        // 2. Computing the sum in Lv, then converting it to EU
        double sumInLv = vegetablesPrice * vegetablesKg + fruitPrice * fruitKg;
        double sumInEU = sumInLv / 1.94;

        // 3. Printing the result
        System.out.printf("%.2f", sumInEU);
    }
}
