package T05WhileLoop.Lab;

import java.util.Scanner;

public class P03SumNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Напишете програма, която чете цяло число от конзолата и на всеки следващ ред цели числа,
        // докато тяхната сума стане по-голяма или равна на първоначалното число.
        // След приключване на четенето да се отпечата сумата на въведените числа.

        int firstNumber = Integer.parseInt(scanner.nextLine());
        int sum = 0;


        while (firstNumber > sum) {
           int numbers = Integer.parseInt(scanner.nextLine());
           sum = sum + numbers;
        }

        System.out.println(sum);
    }
}
