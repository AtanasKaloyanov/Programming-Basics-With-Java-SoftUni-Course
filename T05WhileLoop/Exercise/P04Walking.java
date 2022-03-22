package T05WhileLoop.Exercise;

import java.util.Scanner;

public class P04Walking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Габи иска да започне здравословен начин на живот и си е поставила за цел да върви 10 000 стъпки всеки ден.
        // Някои дни обаче е много уморена от работа и ще иска да се прибере преди да постигне целта си. Напишете програма,
        // която чете от конзолата по колко стъпки изминава тя всеки път като излиза през деня и когато постигне целта си да се изписва
        // "Goal reached! Good job!"  и колко стъпки повече е извървяла "{разликата между стъпките} steps over the goal!".
        //Ако иска да се прибере преди това, тя ще въведе командата "Going home" и ще въведе стъпките,
        // които е извървяла докато се прибира. След което, ако не е успяла да постигне целта си, на конзолата трябва да се изпише:
        // "{разликата между стъпките} more steps to reach goal."

        String command = scanner.nextLine();
        int sum = 0;

        while (!command.equals("Going home") ){
            int steps = Integer.parseInt(command);

            sum = steps + sum;
            if (sum >= 10000) {
                break;
            }
            command = scanner.nextLine();

        }

        if (command.equals("Going home")) {
            int finalSteps = Integer.parseInt(scanner.nextLine());
            int difference = 10000 - sum - finalSteps;
            if (difference > 0) {
                System.out.printf("%d more steps to reach goal.", difference);

            } else {
                int moreSteps2 = sum + finalSteps - 10000;
                System.out.println("Goal reached! Good job!");
                System.out.printf("%d steps over the goal!", moreSteps2);
            }

        }

        if (sum >= 10000) {
            int moreSteps = sum - 10000;
            System.out.println("Goal reached! Good job!");
            System.out.printf("%d steps over the goal!", moreSteps);
        }
    }
}
