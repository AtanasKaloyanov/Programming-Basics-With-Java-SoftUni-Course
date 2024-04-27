package T04ForLoop.Exercise;

import java.util.Scanner;

public class P05Salary {
    public static void main(String[] args) {
        // 1. Input reading
        Scanner scanner = new Scanner(System.in);
        int tagsNumber = Integer.parseInt(scanner.nextLine());
        int salary = Integer.parseInt(scanner.nextLine());

        // 2. Cycle
        for (int i = 0; i < tagsNumber; i++) {
            String currentTag = scanner.nextLine();
            salary = getSalaryAfterfine(salary, currentTag);
            if (lostSalaryCondition(salary)) return;
        }

        // 3. Output printing
        System.out.println(salary);
    }

    private static boolean lostSalaryCondition(double salary) {
        if (salary <= 0) {
            System.out.println("You have lost your salary.");
            return true;
        }
        return false;
    }

    private static int getSalaryAfterfine(int salary, String currentTag) {
        switch (currentTag) {
            case "Facebook":
                salary -= 150;
                break;

            case "Instagram":
                salary -= 100;
                break;

            case "Reddit":
                salary -= 50;
                break;

        }
        return salary;
    }
}
