package T06NestedLoops.Exercise;

import java.util.Scanner;

public class P02EqualSumEvenOddPositions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Напишете програма, която чете от конзолата две шестцифрени цели числа в диапазона от 100000 до 300000.
        // Винаги първото въведено число ще бъде по малко от второто.
        // На конзолата да се отпечатат на 1 ред разделени с интервал всички числа, които се намират между двете,
        // прочетени от конзолата числа и отговарят на следното условие:
        //•	сумата от цифрите на четни и нечетни позиции да са равни.
        // Ако няма числа, отговарящи на условието на конзолата не се извежда резултат.

        int firstNumber = Integer.parseInt(scanner.nextLine());
        int secondNumber = Integer.parseInt(scanner.nextLine());

        for (int i = firstNumber; i <= secondNumber ; i++) {

            String stringNumber = "" + i;

            int oddSum = 0;
            int evenSum = 0;

            for (int j = 0; j < stringNumber.length(); j++) {
                int currentNumber = Integer.parseInt("" + stringNumber.charAt(j));
                if (j % 2 == 0) {
                    oddSum = currentNumber + oddSum;
                } else {
                    evenSum = currentNumber + evenSum;
                }

            }
            if (evenSum == oddSum) {
                System.out.print(i + " ");
            }

        }
    }
}
