package T01FirstStepsInCoding.Exercise;

import java.util.Scanner;

public class P08BasketballEquipment {
    public static void main(String[] args) {
        // 1. Input Reading
        Scanner scanner = new Scanner(System.in);
        int tax = Integer.parseInt(scanner.nextLine());

        // 2. Finding the 4 different costs
        double trainers = 0.60 * tax;
        double equipment = 0.80 * trainers;
        double ball = 0.25 * equipment;
        double accessories = 0.20 * ball;

        // 3. The sum is calculated with adding of the tax to other costs
        double sum = trainers + equipment + ball + accessories + tax;

        // 4. Result printing
        System.out.println(sum);
    }

    // trainers - 60 % of the tax
    // equipment - 80 % of the sum of the trainers
    // ball - 25 % of the equipment
    // accessories - 20 % of the ball
}
