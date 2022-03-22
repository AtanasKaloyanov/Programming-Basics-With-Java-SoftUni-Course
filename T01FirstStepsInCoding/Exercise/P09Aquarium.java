package T01FirstStepsInCoding.Exercise;

import java.util.Scanner;

public class P09Aquarium {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int length = Integer.parseInt(scanner.nextLine());
        int width = Integer.parseInt(scanner.nextLine());
        int depth = Integer.parseInt(scanner.nextLine());
        double procent = Double.parseDouble(scanner.nextLine());

        double volume = length * width * depth * 0.001;
        double volume2 = volume - (procent / 100) * volume;
        System.out.println(volume2);
    }
}
