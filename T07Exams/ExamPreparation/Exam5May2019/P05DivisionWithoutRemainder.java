package T07Exams.ExamPreparation.Exam5May2019;

import java.util.Scanner;

public class P05DivisionWithoutRemainder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int allCounter = 0;
        int counter2 = 0;
        int counter3 = 0;
        int counter4 = 0;


        for (int i = 1; i <= n; i++) {
            int number = Integer.parseInt(scanner.nextLine());
            allCounter++;

            if (number % 2 == 0) {
                counter2++;

            }
            if (number % 3 == 0) {
                counter3++;

            }
            if (number % 4 == 0) {
                counter4++;

            }
        }
        System.out.printf("%.2f%%%n", counter2 * 1.00 / allCounter * 100);
        System.out.printf("%.2f%%%n", counter3 * 1.00 / allCounter * 100);
        System.out.printf("%.2f%%%n", counter4 * 1.00 / allCounter * 100);
    }
}
