package T07Exams.MyExam;

import java.util.Scanner;

public class P06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = Integer.parseInt(scanner.nextLine());
        String b = "" + a;

        for (int i = 1; i <= Integer.parseInt("" + b.charAt(2)); i++) {
            for (int j = 1; j <= Integer.parseInt("" + b.charAt(1)); j++) {
                for (int k = 0; k <= Integer.parseInt("" + b.charAt(0)); k++) {

                    if (i == 0) {
                        continue;
                    }
                    if (j == 0) {
                        continue;
                    }
                    if (k == 0) {
                        continue;
                    }
                    if (i < 0 || j < 0 || k < 0) {
                        continue;
                    }

                    int result = i * j * k;

                    System.out.printf("%d * %d * %d = %d;%n", i, j, k, result);
                }
            }

        }


    }
}
