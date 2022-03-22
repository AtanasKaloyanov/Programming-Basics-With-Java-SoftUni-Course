package ExamPreparation.Exam6June2019;

import java.util.Scanner;

public class P04Cinema {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int capacity = Integer.parseInt(scanner.nextLine());
        int allSeats = 0;
        int sum = 0;
        double totalSum = 0;

        String input = scanner.nextLine();

        while (!input.equals("Movie time!")) {
            int people = Integer.parseInt(input);
if (people % 3 == 0) {
    sum = people * 5 - 5;
} else {
    sum = people * 5;
}

            allSeats = people + allSeats;
            if (allSeats > capacity) {
                break;
            }

            totalSum = sum + totalSum;

            input = scanner.nextLine();
        }

        if (input.equals("Movie time!")) {
            int leftedSeats = capacity - allSeats;
            System.out.printf("There are %d seats left in the cinema.%n", leftedSeats);
        }
        if (allSeats > capacity) {
            System.out.println("The cinema is full.");
        }
        System.out.printf("Cinema income - %.0f lv.", totalSum);
    }
}
