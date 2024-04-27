package T04ForLoop.Exercise;

import java.util.Scanner;

public class P08TennisRanklist {
    public static void main(String[] args) {
        // 1. Input reading
        Scanner scanner = new Scanner(System.in);
        int tournamentsNumber = Integer.parseInt(scanner.nextLine());
        int initialPoints = Integer.parseInt(scanner.nextLine());

        // 2. All points and winning points computation
        int allPoints = initialPoints;
        int firstPlaceCounter = 0;

        for (int i = 0; i < tournamentsNumber; i++) {
            String currentPlace = scanner.nextLine();
            switch (currentPlace) {
                case "W":
                    allPoints += 2000;
                    firstPlaceCounter++;
                    break;
                case "F":
                    allPoints += 1200;
                    break;
                case "SF":
                    allPoints += 720;
                    break;
            }
        }

        // 3. Average points and percentage of the winning championship computation
        int winningPoints = allPoints - initialPoints;
        int averagePoints = (int) Math.floor(winningPoints / tournamentsNumber);
        double winningPercentage = ( (firstPlaceCounter * 1.00) / tournamentsNumber) * 100;

        // 4. Output printing
        System.out.printf("Final points: %d\n", allPoints);
        System.out.printf("Average points: %d\n", averagePoints);
        System.out.printf("%.2f%%", winningPercentage);
    }
}
