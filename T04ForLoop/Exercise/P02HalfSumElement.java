package T04ForLoop.Exercise;

import java.util.Scanner;

public class P02HalfSumElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        Да се напише програма, която чете n-на брой цели числа, въведени от потребителя,
//        и проверява дали сред тях съществува число, което е равно на сумата на всички останали.
//	Ако има такъв елемент печата "Yes" и на нов ред "Sum = "  + неговата стойност
//	Ако няма такъв елемент печата "No" и на нов ред "Diff = " + разликата между най-големия елемент и сумата на останалите
//                (по абсолютна стойност)

        int n = Integer.parseInt(scanner.nextLine());
        int sum = 0;

        int biggest = Integer.MIN_VALUE;

        for (int i = 1 ; i <= n ; i++) {
            int a = Integer.parseInt(scanner.nextLine());
            if (a > biggest) {
                biggest = a;
            }
            sum += a;

        }
        if (biggest == sum - biggest) {
            System.out.printf("Yes%n");
            System.out.printf("Sum = %d", biggest);
        } else {
            int difference = biggest - (sum - biggest);
            System.out.printf("No%n");
            System.out.printf("Diff = %d", Math.abs(difference));
        }

    }
}
