package T03ConditionalStatementsAdvaneced.MoreExercises;

import java.util.Scanner;

public class P08PointOnRectangleBorder {
    public static void main(String[] args) {
        // 1. Input reading
        Scanner scanner = new Scanner(System.in);
        double x1 = Double.parseDouble(scanner.nextLine());
        double y1 = Double.parseDouble(scanner.nextLine());
        double x2 = Double.parseDouble(scanner.nextLine());
        double y2 = Double.parseDouble(scanner.nextLine());
        double x = Double.parseDouble(scanner.nextLine());
        double y = Double.parseDouble(scanner.nextLine());

        // 2. Initialisation of  4 conditions:
        boolean first = ( (x == x1) || (x == x2) ) && ( (y >= y1) && (y <= y2) );
        boolean second = ( (y == y1) || (y == y2) ) && ( (x >= x1) && (x <= x2) );

        // 3 Output printing - 2 cases:
        if (first || second) {
            System.out.println("Border");
        } else {
            System.out.println("Inside / Outside");
        }
    }
}
