package T01FirstStepsInCoding.MoreExercises;

import java.util.Scanner;

public class P06Fishland {
    public static void main(String[] args) {
        // 1. Reading the input
        Scanner scanner = new Scanner(System.in);
        double mackerelPrice = Double.parseDouble(scanner.nextLine());
        double spratPrice = Double.parseDouble(scanner.nextLine());
        double bonitoKg = Double.parseDouble(scanner.nextLine());
        double scadKg = Double.parseDouble(scanner.nextLine());
        int musselKg = Integer.parseInt(scanner.nextLine());

        // 2. Computing of the price of the bonito and the scad
        double bonitoPrice = 1.6 * mackerelPrice;
        double scadPrice = 1.8 * spratPrice;

        // 3 Computing the sum
        double sum = bonitoKg * bonitoPrice + scadKg * scadPrice + musselKg * 7.50;

        // 4. Printing the sum
        System.out.printf("%.2f", sum);
    }
}

// mackerel
// sprat
// bonito
// scad
// mussel
