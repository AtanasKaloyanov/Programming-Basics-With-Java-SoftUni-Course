package ExamPreparation.Exam4July2019;

import java.util.Scanner;

public class P06TheMostPowerfullWord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        double max = Double.MIN_VALUE;
        String winner = "";


        while (!input.equals("End of words")) {
            String word = input;
            double sum = 0;

            for (int i = 0; i < word.length(); i++) {

                int number = word.charAt(i);
                sum = number + sum;



            }

            String firstSymbol = "" + word.charAt(0);
            if (firstSymbol.equals("a") || firstSymbol.equals("e") || firstSymbol.equals("i") || firstSymbol.equals("o") ||
                    firstSymbol.equals("u") || firstSymbol.equals("y") || firstSymbol.equals("A") || firstSymbol.equals("E") ||
                    firstSymbol.equals("I") || firstSymbol.equals("O") || firstSymbol.equals("U") || firstSymbol.equals("Y")) {
                sum = sum * word.length();
            } else {
                sum = Math.floor(sum / word.length());
            }
            if (sum > max) {
                max = sum;
                winner = word;
            }



            input = scanner.nextLine();
        }
        System.out.printf("The most powerful word is %s - %.0f", winner, max);
    }
}
