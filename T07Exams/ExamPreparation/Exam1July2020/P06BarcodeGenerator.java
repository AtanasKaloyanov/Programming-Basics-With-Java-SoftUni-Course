package T07Exams.ExamPreparation.Exam1July2020;

import java.util.Scanner;

public class P06BarcodeGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Техниката в магазин за коледни украси се разваля.
        // Артикулите, които съдържат четни числа в своя баркод не могат да бъдат маркирани от касиерите.
        // Вашата задача е, да напишете програма, която генерира всички баркодове, които НЕ съдържат четни цифри в себе си.
        //Вход:
        // Две четирицифрени числа, които показват обхвата на баркодовете, които трябва да промените.
        // Първи ред – четирицифрено число – началото на обхвата. Цяло число в интервала [1000…9999]
        // Втори ред – четирицифрено число – края на обхвата. Цяло число в интервала [1000…9999]
        //Изход:
        //На конзолата трябва да се отпечатат всички "баркодове", които НЕ съдържат четна цифра в себе си, разделени с интервал

        int firstNumber = Integer.parseInt(scanner.nextLine());
        int secondNumber = Integer.parseInt(scanner.nextLine());

        String firstNumberS = "" + firstNumber;
        String secondNumberS = "" + secondNumber;

        for (int i = Integer.parseInt ("" + firstNumberS.charAt(0)); i <= Integer.parseInt("" + secondNumberS.charAt(0)); i++) {
            for (int j = Integer.parseInt ("" + firstNumberS.charAt(1)); j <= Integer.parseInt ("" + secondNumberS.charAt(1)); j++) {
                for (int k = Integer.parseInt ("" + firstNumberS.charAt(2)); k <= Integer.parseInt ("" + secondNumberS.charAt(2)); k++) {
                    for (int l = Integer.parseInt ("" + firstNumberS.charAt(3)); l <= Integer.parseInt ("" + secondNumberS.charAt(3)); l++) {

                        if (i % 2 == 0) {
                            continue;
                        }
                        if (j % 2 == 0) {
                            continue;
                        } if (k % 2 == 0) {
                            continue;
                        } if (l % 2 == 0) {
                            continue;
                        }
                        System.out.printf("%d%d%d%d ", i, j, k, l);
                    }
                }
            }

        }

    }
}

