package T01FirstStepsInCoding.Exercise;

import java.util.Scanner;

public class P09Aquarium {
    public static void main(String[] args) {
        // 1. Reading the input
        Scanner scanner = new Scanner(System.in);
        int lengthInCm = Integer.parseInt(scanner.nextLine());
        int widthInCm = Integer.parseInt(scanner.nextLine());
        int heightInCm = Integer.parseInt(scanner.nextLine());
        double percent = Double.parseDouble(scanner.nextLine());

        // 2. Turning centimeter into decimeters
        double length = lengthInCm * 1.00 / 10;
        double width = widthInCm * 1.00 / 10;
        double height = heightInCm * 1.00 / 10;

        // 3. Calculating the volume and subtraction of the percent of it
        double volume = length * width * height;
        double aquariumWater = volume - volume * percent / 100;

        // 4. Result printing
        System.out.println(aquariumWater);
    }
}

