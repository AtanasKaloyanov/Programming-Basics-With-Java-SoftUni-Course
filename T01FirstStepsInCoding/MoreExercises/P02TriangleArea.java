package T01FirstStepsInCoding.MoreExercises;

import java.util.Scanner;

public class P02TriangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = Double.parseDouble(scanner.nextLine());
        double hA = Double.parseDouble(scanner.nextLine());
        double area = (a * hA) / 2;

        System.out.printf("%.2f", area);
    }
}
