package T06NestedLoops.MoreExercises;

import java.util.Scanner;

public class P06WeddingSeats {
    private static int placesCounter;

    public static void main(String[] args) {
        // 1. Input reading
        Scanner scanner = new Scanner(System.in);
        char lastSector = scanner.nextLine().charAt(0);
        int currentSectorRows = Integer.parseInt(scanner.nextLine());
        int oddRowPlaces = Integer.parseInt(scanner.nextLine());

        // 2. Places printing and counting via 3 nested loops
        int evenRowsPlaces = oddRowPlaces + 2;

        for (int i = 65; i <= lastSector; i++) {
            char currentSector = (char) i;
            for (int j = 1; j <= currentSectorRows; j++) {
                if (j % 2 != 0) {
                    printPlaces(currentSector, j, oddRowPlaces);
                } else {
                    printPlaces(currentSector, j, evenRowsPlaces);
                }
            }
            currentSectorRows += 1;
        }

        // 3. Printing
        System.out.println(placesCounter);
    }

    private static void printPlaces(char currentSector, int currentRow, int placesNumber) {
        for (int k = 1; k <= placesNumber; k++) {
            placesCounter++;
            char currentPlace = (char) (k + 96);
            System.out.printf("%c%d%c\n", currentSector, currentRow, currentPlace);
        }
    }


}
