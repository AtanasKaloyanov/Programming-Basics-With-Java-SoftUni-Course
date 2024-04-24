package T03ConditionalStatementsAdvaneced.Lab;

import java.util.Scanner;

public class P09FruitOrVegetable {
    public static void main(String[] args) {
            // 1. Input reading
            Scanner scanner = new Scanner(System.in);
            String input = scanner.nextLine();

            // 2. Output assignment
            String output;
            switch (input) {
                case "banana":
                case "apple":
                case "kiwi":
                case "cherry":
                case "lemon":
                case "grapes":
                    output = "fruit";
                    break;
                case "tomato":
                case "cucumber":
                case "pepper":
                case "carrot":
                    output = "vegetable";
                    break;
                default:
                    output = "unknown";
                    break;
            }

            // 3. Output printing
            System.out.println(output);
        }
    }

