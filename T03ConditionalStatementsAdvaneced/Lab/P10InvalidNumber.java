package T03ConditionalStatementsAdvaneced.Lab;

import java.util.Scanner;

public class P10InvalidNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        Дадено число е валидно, ако е в диапазона [100…200] или е 0.  Да се напише програма, която чете цяло число,
//                въведено от потребителя, и печата "invalid" ако въведеното число не е валидно.
//
//        Примерен вход и изход
//        вход	изход		вход	изход		вход	изход		вход	изход
//        75	invalid		150	 (няма изход)	220	   invalid		199	(няма изход)
//
//
//        вход	изход		вход	изход		вход	изход		вход	изход
//        -1	invalid		100	 (няма изход)	200	  (няма изход)	 0	(няма изход)

        int number = Integer.parseInt(scanner.nextLine());

        boolean isValid =  (number >= 100 && number <= 200) || number == 0;
        if (!isValid) {
            System.out.println("invalid");
        }


    }
}
