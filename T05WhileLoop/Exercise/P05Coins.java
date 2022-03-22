package T05WhileLoop.Exercise;

import java.util.Scanner;

public class P05Coins {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);



        double change = Double.parseDouble(scanner.nextLine());
        double coins = change * 100;

        int count = 0;

        while (coins > 0) {
            if (coins >= 200) {
                count++;
                coins = coins - 200;
            } else if (coins >= 100) {
                count++;
                coins = coins - 100;
            }else if (coins >= 50) {
                count++;
                coins = coins - 50;
            }else if (coins >= 20) {
                count++;
                coins = coins - 20;
            }else if (coins >= 10) {
                count++;
                coins = coins - 10;
            }else if (coins >= 5) {
                count++;
                coins = coins - 5;
            }else if (coins >= 2) {
                count++;
                coins = coins - 2;
            }else if (coins >= 1) {
                count++;
                coins = coins - 1;
            }
            else {
                break;
            }
        }
        System.out.println(count);
    }
}
