package T04ForLoop.MoreExercises;

import java.util.Scanner;

public class P07FootballLeague {
    public static void main(String[] args) {
        // 1. Input reading
        Scanner scanner = new Scanner(System.in);
        int capacity = Integer.parseInt(scanner.nextLine());
        int n = Integer.parseInt(scanner.nextLine());

        // 2. 4 counters computing
        int counter1 = 0;
        int counter2 = 0;
        int counter3 = 0;
        int counter4 = 0;

        for (int i = 0; i < n; i++) {
            String sector = scanner.nextLine();
            switch (sector) {
                case "A":
                    counter1++;
                    break;

                case "B":
                    counter2++;
                    break;

                case "V":
                    counter3++;
                    break;

                case "G":
                    counter4++;
                    break;
            }
        }

        // 3. Percentage computation
        double percentage1 = (counter1 * 1.00 / n) * 100;
        double percentage2 = (counter2 * 1.00 / n) * 100;
        double percentage3 = (counter3 * 1.00 / n) * 100;
        double percentage4 = (counter4 * 1.00 / n) * 100;
        double percentage5 = (n * 1.00 / capacity) * 100;

        // 4. Output printing
        System.out.printf("%.2f%%\n", percentage1);
        System.out.printf("%.2f%%\n", percentage2);
        System.out.printf("%.2f%%\n", percentage3);
        System.out.printf("%.2f%%\n", percentage4);
        System.out.printf("%.2f%%", percentage5);
    }
}
