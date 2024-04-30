package T05WhileLoop.Exercise;

import java.util.Scanner;

public class P07Moving {
    public static void main(String[] args) {
        // 1. Input reading
        Scanner scanner = new Scanner(System.in);
        int width = Integer.parseInt(scanner.nextLine());
        int length = Integer.parseInt(scanner.nextLine());
        int height = Integer.parseInt(scanner.nextLine());

        // 2. Volume computation
        int volume = width * length * height;

        // 3. Space computation
        String input = scanner.nextLine();
        while (!input.equals("Done")) {
            int currentVolume = Integer.parseInt(input);
            volume -= currentVolume;
            if (volume <= 0) {
                break;
            }

            input = scanner.nextLine();
        }

        // 4. Output printing - 2 cases:
        if (volume > 0) {
            System.out.printf("%d Cubic meters left.", volume);
        } else {
            int neededSpace = Math.abs(volume);
            System.out.printf("No more free space! You need %d Cubic meters more.", neededSpace);
        }
    }

}
