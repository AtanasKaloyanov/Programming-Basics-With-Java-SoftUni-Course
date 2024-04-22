package T01FirstStepsInCoding.Exercise;

import java.util.Scanner;

public class P03DepositCalcilator {
    public static void main(String[] args) {
        // 1. Input Reading
        Scanner scanner = new Scanner(System.in);
        double depositSum = Double.parseDouble(scanner.nextLine());
        int timeDeposit = Integer.parseInt(scanner.nextLine());
        double annualInterestRate = Double.parseDouble(scanner.nextLine());

        // 2. sum calculating
        // sum = depositSum + timeDeposit * ((depositSum * annualInterestRate) / 12) ;
        double annualInterestRate2 = annualInterestRate / 100;
        double sum = depositSum + (timeDeposit  * (depositSum * annualInterestRate2) / 12);

        // 3. Result printing
        System.out.println(sum);
    }
}
