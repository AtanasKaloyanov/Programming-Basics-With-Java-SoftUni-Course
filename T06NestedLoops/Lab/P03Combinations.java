package T06NestedLoops.Lab;

import java.util.Scanner;

public class P03Combinations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Напишете програма, която изчислява колко решения в естествените числа (включително и нулата) има уравнението:
        //x1 + x2 + x3 = n
        //Числото n е цяло число и се въвежда от конзолата.

        int n = Integer.parseInt(scanner.nextLine());

        int counter = 0;

        for (int i = 0; i <= n ; i++) {
            for (int j = 0; j <= n; j++) {
                for (int k = 0; k <= n; k++) {

                    if (i + j + k == n) {
                        counter++;
                    }
                }

            }

        }
        System.out.println(counter);
    }
}
