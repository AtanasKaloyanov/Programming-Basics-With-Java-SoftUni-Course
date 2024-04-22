package T01FirstStepsInCoding.Exercise;

import java.util.Scanner;

public class P06Repainting {
    public static void main(String[] args) {
        // 1. Reading the input
        Scanner scanner = new Scanner(System.in);
        int nylon = Integer.parseInt(scanner.nextLine());
        int paint = Integer.parseInt(scanner.nextLine());
        int thinner = Integer.parseInt(scanner.nextLine());
        int hours = Integer.parseInt(scanner.nextLine());

        // 2. Calculating allMaterialsCosts
        double nylenQuantity = nylon + 2;
        double painQuantity = 1.1 * paint;
        double bags = 0.40;

        double materialCosts = (nylenQuantity * 1.50) + (painQuantity * 14.50) + (thinner * 5.00) + bags;

        // 3. Finding workCosts and add it to the material costs
        double oneHourCost = materialCosts * 0.30;
        double workCosts = oneHourCost * hours;
        double allCosts = materialCosts + workCosts;

        // 4. Result Printing
        System.out.println(allCosts);
    }
}

// nylon - 1.50
// paint - 14.50
// thinner - 5.00

// + 10 % paint + 2 meters nylon + 0.40 bags

// 1 hour work force = 0.30 * materialCosts
