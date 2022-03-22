package T04ForLoop.Lab;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class P10OddEvenSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        Да се напише програма, която чете n-на брой цели числа,
//                подадени от потребителя и проверява дали сумата от числата на четни позиции е
//        равна на сумата на числата на нечетни позиции.
//•	Ако сумите са равни да се отпечатат два реда: "Yes" и на нов ред "Sum = " + сумата;
//•	Ако сумите не са равни да се отпечат два реда: "No" и на нов ред "Diff = " + разликата.
//                Разликата се изчислява по абсолютна стойност.

        int n = Integer.parseInt(scanner.nextLine());
        int sumEven = 0;
        int sumOdd = 0;

        for (int i = 1; i <= n; i++) {
            int a = Integer.parseInt(scanner.nextLine());
            if (i % 2 == 0) {
                sumEven += a;
            } else {
                sumOdd += a;

            }

        } if (sumEven == sumOdd) {
            System.out.printf("Yes%n");
            System.out.printf("Sum = %d", sumEven);
        } else {
            int difference = sumEven - sumOdd;
            System.out.printf("No%n");
            System.out.printf("Diff = %d", Math.abs(difference));
        }

    }
}

