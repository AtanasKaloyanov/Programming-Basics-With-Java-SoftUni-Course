package T05WhileLoop.Lab;

import java.util.Scanner;

public class P08Graduation {
    public static void main(String[] args) {
        // 1. Input reading
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();

        // 2. Counting class and computing teh grades sum via while cycle
        boolean flag = false;
        int currentClass = 1;
        double gradesSum = 0;

        while (currentClass <= 12) {
            double grade = Double.parseDouble(scanner.nextLine());
            if (grade < 4.00) {
                if (flag) {
                    System.out.printf("%s has been excluded at %d grade", name, currentClass);
                    return;
                }
                flag = true;
            } else {
                currentClass++;
                gradesSum += grade;
            }

        }

        // 3. Output printing
        double averageGrade = gradesSum / 12;
        System.out.printf("%s graduated. Average grade: %.2f", name, averageGrade);
    }
}
