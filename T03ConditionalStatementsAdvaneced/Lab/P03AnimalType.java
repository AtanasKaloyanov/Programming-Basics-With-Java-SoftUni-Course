package T03ConditionalStatementsAdvaneced.Lab;

import java.util.Scanner;

public class P03AnimalType {
    public static void main(String[] args) {
        // 1. Input reading
        Scanner scanner = new Scanner(System.in);
        String animal = scanner.nextLine();

        // 2. Output assignment
        String output;
        switch (animal) {
            case "dog":
                output = "mammal";
                break;
            case "crocodile":
            case "tortoise":
            case "snake":
                output = "reptile";
                break;
            default:
                output = "unknown";
                break;
        }

        // 3. Input printing
        System.out.println(output);
    }
}
