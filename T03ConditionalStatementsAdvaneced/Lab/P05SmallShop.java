package T03ConditionalStatementsAdvaneced.Lab;

import java.util.Scanner;

public class P05SmallShop {
    public static void main(String[] args) {
        // 1. Input reading
        Scanner scanner = new Scanner(System.in);
        String product = scanner.nextLine();
        String town = scanner.nextLine();
        double quantity = Double.parseDouble(scanner.nextLine());

        // 2. Price assignment
        double price = 0;
        switch (town) {
            case "Sofia":
                if (product.equals("coffee")) {
                    price = 0.50;
                } else if (product.equals("water")) {
                    price = 0.80;
                } else if (product.equals("beer")) {
                    price = 1.20;
                } else if (product.equals("sweets")) {
                    price = 1.45;
                } else if (product.equals("peanuts")) {
                    price = 1.60;
                }
                break;

            case "Plovdiv":
                if (product.equals("coffee")) {
                    price = 0.40;
                } else if (product.equals("water")) {
                    price = 0.70;
                } else if (product.equals("beer")) {
                    price = 1.15;
                } else if (product.equals("sweets")) {
                    price = 1.30;
                } else if (product.equals("peanuts")) {
                    price = 1.50;
                }
                break;

            case "Varna":
                if (product.equals("coffee")) {
                    price = 0.45;
                } else if (product.equals("water")) {
                    price = 0.70;
                } else if (product.equals("beer")) {
                    price = 1.10;
                } else if (product.equals("sweets")) {
                    price = 1.35;
                } else if (product.equals("peanuts")) {
                    price = 1.55;
                }
                break;
        }

        // 3. Computation of the sum and printing
        double sum = quantity * price;
        System.out.println(sum);
    }
}
