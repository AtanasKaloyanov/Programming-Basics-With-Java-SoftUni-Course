package T04ForLoop.MoreExercises;

import java.util.Scanner;

public class P02Hospital {
    public static void main(String[] args) {
        // 1. Input reading
        Scanner scanner = new Scanner(System.in);
        int days = Integer.parseInt(scanner.nextLine());

        // 2. Computation of the treated and untreated patients
        int doctorsNumber = 7;
        int treatedPatients = 0;
        int untreatedPatients = 0;
        for (int i = 1; i <= days; i++) {
            if (i % 3 == 0) {
                if (untreatedPatients > treatedPatients) {
                    doctorsNumber++;
                }
            }

            int patientsNumber = Integer.parseInt(scanner.nextLine());
            if (patientsNumber > doctorsNumber) {
                treatedPatients += doctorsNumber;
                int currentUntreatedPatients = patientsNumber - doctorsNumber;
                untreatedPatients += currentUntreatedPatients;
            } else {
                treatedPatients += patientsNumber;
            }
        }

        // 3. Output printing
        System.out.printf("Treated patients: %d.\n", treatedPatients);
        System.out.printf("Untreated patients: %d.", untreatedPatients);
    }

}
