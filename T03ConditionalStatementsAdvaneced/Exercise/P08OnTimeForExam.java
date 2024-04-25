package T03ConditionalStatementsAdvaneced.Exercise;

import java.util.Scanner;

public class P08OnTimeForExam {
    public static void main(String[] args) {
        // 1. Input reading
        Scanner scanner = new Scanner(System.in);
        int examHour = Integer.parseInt(scanner.nextLine());
        int examMinutes = Integer.parseInt(scanner.nextLine());
        int arrivalHour = Integer.parseInt(scanner.nextLine());
        int arrivalMinutes = Integer.parseInt(scanner.nextLine());

        // 2. Computing of the minutes of the exam and of the minutes of the student's arrival
        int examAllMinutes = examMinutes + examHour * 60;
        int arrivalAllMinutes = arrivalMinutes + arrivalHour * 60;

        // 3. Printing - multiple cases:
        String time;
        int difference = arrivalAllMinutes - examAllMinutes;
        if (difference > 0) {
            printTheFirstLineLate();
            time = "after";
            printSecondLine(difference, time);
        } else {
            difference = Math.abs(difference);
            printTheFirstLineOnTimeOrEarly(difference);
            time = "before";
            printSecondLine(difference, time);
        }

    }

    private static void printTheFirstLineLate() {
        System.out.println("Late");
    }

    private static void printTheFirstLineOnTimeOrEarly(int difference) {
        if (difference <= 30) {
            System.out.println("On time");
        } else {
            System.out.println("Early");
        }
    }

    private static void printSecondLine(int difference, String time) {
        if (difference == 0) {
        } else if (difference < 60) {
            System.out.printf("%d minutes %s the start", difference, time);
        } else {
            int differenceHours = difference / 60;
            int differenceMinutes = difference % 60;

            if (differenceMinutes < 10) {
                System.out.printf("%d:0%d hours %s the start", differenceHours, differenceMinutes, time);
            } else {
                System.out.printf("%d:%d hours %s the start", differenceHours, differenceMinutes, time);
            }
        }
    }
}


