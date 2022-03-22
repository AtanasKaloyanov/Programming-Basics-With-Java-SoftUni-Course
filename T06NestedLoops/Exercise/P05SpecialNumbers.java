package T06NestedLoops.Exercise;

import java.util.Scanner;

public class P05SpecialNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 1111; i <= 9999; i++) {
            int counter = 0;

            for (int j = 0; j < 4; j++) {
                String stringNumber = "" + i;
                int a = Integer.parseInt("" + stringNumber.charAt(j));
                if (a == 0) {
                    continue;
                }
                if (n % a == 0) {
                    counter++;
                }
                if (counter == 4) {
                    System.out.print(i + " ");
                }
            }


        }


    }
}


