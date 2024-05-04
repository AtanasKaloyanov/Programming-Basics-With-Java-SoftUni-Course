package T07Exams.MyExam;

import java.util.Scanner;

public class P03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//Първи ред – дни за престой – цяло число в интервала [0...365]
// Втори ред – вид помещение – "room for one person", "apartment" или "president apartment"
// Трети ред – оценка - "positive" или "negative"

        int days = Integer.parseInt(scanner.nextLine());
        String typeRoom = scanner.nextLine();
        String grade = scanner.nextLine();

        double sum = 0;


        if (days < 10) {
            switch (typeRoom) {

                case "room for one person":
                    sum = (days - 1) * 18.00;
                    break;

                case "apartment":
                    sum = 0.7 * (days - 1) * 25.00;
                    break;

                case "president apartment":
                    sum = 0.90 * (days - 1) * 35.00;
                    break;

            }

        } else if (days <= 15) {
            switch (typeRoom) {

                case "room for one person":
                    sum = (days - 1) * 18.00;
                    break;

                case "apartment":
                    sum = 0.65 * (days - 1) * 25.00;
                    break;

                case "president apartment":
                    sum = 0.85 * (days - 1) * 35.00;
                    break;

            }

        } else if (days > 15) {
            switch (typeRoom) {

                case "room for one person":
                    sum = (days - 1) * 18.00;
                    break;

                case "apartment":
                    sum = 0.5 * (days - 1) * 25.00;
                    break;

                case "president apartment":
                    sum = 0.80 * (days - 1) * 35.00;
                    break;

            }

        }

        if (grade.equals("positive")) {
            sum = 1.25 * sum;
        }
        if (grade.equals("negative")) {
            sum = 0.90 * sum;

        }
        System.out.printf("%.2f", sum);
    }
}