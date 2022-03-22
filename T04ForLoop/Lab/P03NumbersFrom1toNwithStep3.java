package T04ForLoop.Lab;

import java.util.Scanner;

public class P03NumbersFrom1toNwithStep3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        Напишете програма, която чете число n,
//                въведено от потребителя и отпечатва числата от 1 до n през 3.

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 1 ; i <= n ; i+=3) {
            System.out.println(i);
        }
    }
}
