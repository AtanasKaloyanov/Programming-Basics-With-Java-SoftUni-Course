package T03ConditionalStatementsAdvaneced.Lab;

import java.util.Scanner;

public class P09FruitOrVegetable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        Да се напише програма, която чете име на продукт, въведено от потребителя, и проверява дали е плод или зеленчук.
//•	Плодовете "fruit" са banana, apple, kiwi, cherry, lemon и grapes
//•	Зеленчуците "vegetable" са tomato, cucumber, pepper и carrot
//•	Всички останали са "unknown"
//        Да се изведе "fruit", "vegetable" или "unknown" според въведения продукт.
//                Примерен вход и изход
//        вход	    изход		вход	изход		вход	изход		вход	изход
//        banana	fruit		apple	fruit		tomato	vegetable	water	unknown

        String product = scanner.nextLine();
        if (product.equals("banana") || product.equals("apple") || product.equals("kiwi")
                || product.equals("cherry") || product.equals("lemon") || product.equals("grapes")) {
            System.out.println("fruit");
        } else if (product.equals("tomato") || product.equals("cucumber") || product.equals("pepper") || product.equals("carrot")) {
            System.out.println("vegetable");
        } else System.out.println("unknown");
    }
}
