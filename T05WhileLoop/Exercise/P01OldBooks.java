package T05WhileLoop.Exercise;

import java.util.Scanner;

public class P01OldBooks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Ани отива до родния си град след много дълъг период извън страната.
        // Прибирайки се вкъщи, тя вижда старата библиотека на баба си и си спомня за любимата си книга.
        // Помогнете на Ани, като напишете програма, в която тя въвежда търсената от нея книга (текст).
        // Докато Ани не намери любимата си книга или не провери всички книги в библиотеката,
        // програмата трябва да чете всеки път на нов ред името на всяка следваща книга (текст), която тя проверява.
        // Книгите в библиотеката са свършили щом получите текст "No More Books".
        //•	Ако не открие търсената книгата да се отпечата на два реда:
        //o	"The book you search is not here!"
        //o	"You checked {брой} books."
        //•	Ако открие книгата си се отпечатва един ред:
        //o	"You checked {брой} books and found it."
        String book = scanner.nextLine();
        String command = scanner.nextLine();
        int counter = 0;

        while (!command.equals("No More Books")) {
            String books = command;
            if (command.equals(book)) {
                break;
            }
            counter++;


            command = scanner.nextLine();
        }
        if (command.equals("No More Books")) {
            System.out.println("The book you search is not here!");
            System.out.printf("You checked %d books.%n", counter);

        }
        if (command.equals(book)) {
            System.out.printf("You checked %d books and found it.", counter);
        }

    }

}

