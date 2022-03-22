package T02ConditionalStatements.Lab;

import java.util.Scanner;

public class P07AreaOfFigures {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String figure = scanner.nextLine();
        double area = 0.00;

        if (figure.equals("square")) {
            double a = Double.parseDouble(scanner.nextLine());
            area = a * a * 1.00;

        } else if (figure.equals("rectangle")) {
            double a = Double.parseDouble(scanner.nextLine());
            double b = Double.parseDouble(scanner.nextLine());
            area = a * b * 1.00 ;

        } else if (figure.equals("circle")) {
            double r = Double.parseDouble(scanner.nextLine());
            area = r * r * Math.PI;

        } else if (figure.equals("triangle")) {
            double a = Double.parseDouble(scanner.nextLine());
            double h = Double.parseDouble(scanner.nextLine());
            area = a * h / 2 * 1.00;

        }
        System.out.printf("%.3f", area);
    }
}
