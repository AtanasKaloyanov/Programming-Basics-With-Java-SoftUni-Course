package ExamPreparation.Exam4July2019;

import java.util.Scanner;

public class P06NameGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);





        int max = Integer.MIN_VALUE;

        String winner = "";

        String input = scanner.nextLine();

        while (!input.equals("Stop")) {
            String name = input;

            int points = 0;
            int result = 0;



            for (int i = 0; i < name.length(); i++) {

                int number = Integer.parseInt(scanner.nextLine());


                int number2 = name.charAt(i);

                if (number == number2) {
                    points = 10;
                } else {
                    points = 2;
                }

                result = points + result;

                if (result >= max) {
                    max = result;
                    winner = name;
                }
            }


            input = scanner.nextLine();
        }
        System.out.printf("The winner is %s with %d points!", winner, max);

        //The winner is {името на победителя} with {точките на победителя} points!
    }
}
