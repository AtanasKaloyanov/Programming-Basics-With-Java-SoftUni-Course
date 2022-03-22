package T04ForLoop.Lab;

import java.util.Scanner;

public class P09LeftAndRightSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        Да се напише програма, която чете 2 * n-на брой цели числа, подадени от потребителя,
//        и проверява дали сумата на първите n числа (лява сума) е равна на сумата на вторите n числа (дясна сума).
//        При равенство печата " Yes, sum = " + сумата; иначе печата " No, diff = " + разликата.
//                Разликата се изчислява като положително число (по абсолютна стойност).

        int n = Integer.parseInt(scanner.nextLine());
        int firstSum = 0;
        int secondSum = 0;

        for (int i = 1; i <= n; i++) {
            int a = Integer.parseInt(scanner.nextLine());
            firstSum += a;
        }
        for (int i = 1; i <= n; i++) {
            int b = Integer.parseInt(scanner.nextLine());
            secondSum += b;
        }

        if (firstSum == secondSum) {
            System.out.printf("Yes, sum = %d", firstSum);
        } else {
            int difference = firstSum - secondSum;
            System.out.printf("No, diff = %d", Math.abs(difference));
        }

    }
}

