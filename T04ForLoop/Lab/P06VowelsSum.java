package T04ForLoop.Lab;

import java.util.Scanner;

public class P06VowelsSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String a = scanner.nextLine();
        int sum = 0;

        for (int i = 0; i < a.length(); i++) {

            switch (a.charAt(i)) {
                case 'a':
                    sum += 1;
                    break;

                case 'e':
                    sum += 2;
                    break;

                case 'i':
                    sum += 3;
                    break;

                case 'o':
                    sum += 4;
                    break;

                case 'u':
                    sum += 5;
                    break;
            }
        }
        System.out.println(sum);
    }
}
