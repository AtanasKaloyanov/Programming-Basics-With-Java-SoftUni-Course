package T05WhileLoop.Lab;

import java.util.Scanner;

public class P04Sequence2kPlus1 {
    public static void main(String[] args) {

        //Напишете програма, която чете число n, въведено от потребителя,
        // и отпечатва всички числа ≤ n от редицата: 1, 3, 7, 15, 31, ….
        //Всяко следващо число се изчислява като умножим предишното с 2 и добавим 1.

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int k = 1;

        while (k <= n) {
            System.out.println(k);
            k = 2 * k + 1;
        }

    }
}
