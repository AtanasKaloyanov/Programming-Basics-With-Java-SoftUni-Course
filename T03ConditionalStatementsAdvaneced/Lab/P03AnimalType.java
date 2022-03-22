package T03ConditionalStatementsAdvaneced.Lab;

import java.util.Scanner;

public class P03AnimalType {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//      Напишете програма, която отпечатва класа на животното според неговото име,
//      въведено от потребителя.
//•	dog -> mammal
//•	crocodile, tortoise, snake -> reptile
//•	others -> unknown
//        Примерен вход и изход
//        Вход	Изход
//        dog	mammal
//        snake	reptile
//        cat	unknown

        String animal = scanner.nextLine();

        switch (animal) {
            case "dog":
                System.out.println("mammal");
                break;
            case "crocodile":
            case "tortoise":
            case "snake":
                System.out.println("reptile");
                break;
            default:
                System.out.println("unknown");
                break;
        }

    }
}
