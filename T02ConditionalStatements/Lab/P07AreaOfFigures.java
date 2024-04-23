package T02ConditionalStatements.Lab;
import java.util.Scanner;

public class P07AreaOfFigures {
    public static void main(String[] args) {
        // 1. Reading the input
        Scanner scanner = new Scanner(System.in);
        String figureName = scanner.nextLine();

        // 2. Assigning of the output - 4 options
        double area = 0;
        if (figureName.equals("square")) {
            double a = Double.parseDouble(scanner.nextLine());
            area = a * a;
        } else if (figureName.equals("rectangle")) {
            double a = Double.parseDouble(scanner.nextLine());
            double b = Double.parseDouble(scanner.nextLine());
            area = a * b;
        } else if (figureName.equals("circle")) {
            double r = Double.parseDouble(scanner.nextLine());
            area = Math.PI * r * r;
        } else if (figureName.equals("triangle")) {
            double a = Double.parseDouble(scanner.nextLine());
            double ha = Double.parseDouble(scanner.nextLine());
            area = (a * ha) / 2;
        }

        // 3. Printing
        System.out.printf("%.3f", area);
    }
}
