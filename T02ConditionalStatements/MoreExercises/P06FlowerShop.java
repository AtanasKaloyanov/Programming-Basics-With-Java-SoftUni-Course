package T02ConditionalStatements.MoreExercises;

import java.util.Scanner;

public class P06FlowerShop {
    public static void main(String[] args) {
        // 1. Input reading
        Scanner scanner = new Scanner(System.in);
        int magnoliasNumber = Integer.parseInt(scanner.nextLine());
        int hyacinthNumber = Integer.parseInt(scanner.nextLine());
        int rosesNumber = Integer.parseInt(scanner.nextLine());
        int cactiNumber = Integer.parseInt(scanner.nextLine());
        double presentPrice = Double.parseDouble(scanner.nextLine());

        // 2. Computing of the sum
        double sum = magnoliasNumber * 3.25 + hyacinthNumber * 4 + rosesNumber * 3.50 + cactiNumber * 8;
        sum *= 0.95;

        // 3. Output printing - 2 cases
        if (sum >= presentPrice) {
            double change = Math.floor(sum - presentPrice);
            System.out.printf("She is left with %.0f leva.", change);
        } else {
            double neededMoney = Math.ceil(presentPrice - sum);
            System.out.printf("She will have to borrow %.0f leva.", neededMoney);
        }
    }
}
