package T06NestedLoops.Exercise;

import java.util.Scanner;

public class P05SpecialNumbers {
    public static void main(String[] args) {
        // 1. Input reading
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        // 2. Finding all special number
        for (int i = 1111; i <= 9999; i++) {
            boolean isSpecial = isSpecial(n, i);
            if (isSpecial) {
                System.out.print(i + " ");
            }
        }
    }

    private static boolean isSpecial(int n, int i) {
        boolean isSpecial = true;
        for (int j = 0; j < 4; j++) {
            int currentCharNumber = getCurrentCharNumber(i, j);
            if (currentCharNumber == 0 || n % currentCharNumber != 0) {
                isSpecial = false;
                break;
            }
        }
        return isSpecial;
    }

    private static int getCurrentCharNumber(int i, int j) {
        String numberAsString = String.valueOf(i);
        char currentChar = numberAsString.charAt(j);
        int currentCharNumber = Integer.parseInt(String.valueOf(currentChar));
        return currentCharNumber;
    }
}


