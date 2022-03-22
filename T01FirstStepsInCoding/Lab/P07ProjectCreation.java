package T01FirstStepsInCoding.Lab;

import java.util.Scanner;

public class P07ProjectCreation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nameArchitect = scanner.nextLine();
        int numberProjects = Integer.parseInt(scanner.nextLine());
        int hours = numberProjects * 3;
        //"The architect {името на архитекта} will need {необходими часове} hours to complete {брой на проектите} project/s."
        System.out.println("The architect " + nameArchitect + " will need " + hours + " hours to complete " + numberProjects + " project/s.");
    }
}
