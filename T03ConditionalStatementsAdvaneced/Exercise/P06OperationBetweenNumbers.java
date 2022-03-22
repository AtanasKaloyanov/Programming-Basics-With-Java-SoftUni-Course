package T03ConditionalStatementsAdvaneced.Exercise;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class P06OperationBetweenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//
//  Напишете програма, която чете две цели числа (N1 и N2) и оператор, с който да се извърши дадена математическа операция с тях.
//   Възможните операции са: Събиране(+), Изваждане(-), Умножение(*), Деление(/) и Модулно деление(%).
//   При събиране, изваждане и умножение на конзолата трябва да се отпечатат резултата и дали той е четен или нечетен.
//   При обикновеното деление – резултата. При модулното деление – остатъка.
//    Трябва да се има предвид, че делителят може да е равен на 0(нула), а на нула не се дели.
//     В този случай трябва да се отпечата специално съобщениe.
//                Вход
//        От конзолата се прочитат 3 реда, въведени от потребителя:
//•	N1 – цяло число в интервала [0...40 000]
//•	N2 – цяло число в интервала [0...40 000]
//•	Оператор – един символ измеду: „+“, „-“, „*“, „/“, „%“
//        Изход
//        Да се отпечата на конзолата един ред:
//•	Ако операцията е събиране, изваждене или умножение:
//        o	 „{N1} {оператор} {N2} = {резултат} – {even/odd}“
//•	Ако операцията е деление:
//        o	„{N1} / {N2} = {резултат}“ – резултатът е фораматиран до вторият знак след дес.запетая
//•	Ако операцията е модулно деление:
//        o	„{N1} % {N2} = {остатък}“
//•	В случай на деление с 0(нула):
//        o	„Cannot divide {N1} by zero“

        int number1 = Integer.parseInt(scanner.nextLine());
        int number2 = Integer.parseInt(scanner.nextLine());
        String operator = scanner.nextLine();
        double result = 0.00;
        String evenOrOdd = "";


        switch (operator) {
            case "+":
                result = number1 + number2;
                if (result % 2 == 0) {
                    evenOrOdd = "even";
                } else {
                    evenOrOdd = "odd";
                }
                break;
            case "-":
                result = number1 - number2;
                if (result % 2 == 0) {
                    evenOrOdd = "even";
                } else {
                    evenOrOdd = "odd";
                }
                break;
            case "*":
                result = number1 * number2;
                if (result % 2 == 0) {
                    evenOrOdd = "even";
                } else {
                    evenOrOdd = "odd";
                }
                break;
            case "/":
                result = number1 * 1.00 / number2;
                break;
            case "%":
                result = number1 * 1.00 % number2;
                break;
        }
        if (operator.equals("+") || operator.equals("-") || operator.equals("*")) {
            System.out.printf("%d %s %d = %.0f - %s", number1, operator, number2, result, evenOrOdd);
        } else if (operator.equals("/")  && number2 != 0) {
            System.out.printf("%d %s %d = %.2f", number1, operator, number2, result);
        } else if (operator.equals("/") && number2 == 0) {
            System.out.printf("Cannot divide %d by zero", number2);
        } else if (operator.equals("%")  && number2 != 0) {
            System.out.printf("%d %s %d = %.0f", number1, operator, number2, result);
        } else if (operator.equals("%") && number2 == 0) {
            System.out.printf("Cannot divide %d by zero", number2);

        }



    }
}
