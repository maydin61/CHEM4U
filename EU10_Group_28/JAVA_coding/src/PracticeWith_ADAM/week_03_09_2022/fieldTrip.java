package JAVA_coding.src.PracticeWith_ADAM.week_03_09_2022;

import java.util.Scanner;

public class fieldTrip {
    public static void main(String[] args) {
        System.out.println("Please enter a grade number between 1 to 6 ");
        Scanner scan = new Scanner(System.in);
        Integer gradeNumber = scan.nextInt();
        if (gradeNumber == 1) {
            System.out.println("location -  Apple orchard\n" +
                    "number of groups - 3\n" +
                    "teacher in charge - Ms. Smith");
        } else if (gradeNumber == 2) {
            System.out.println("location - Zoo\n" +
                    "number of groups - 7\n" +
                    "teacher in charge - Mr. Lee");

        } else if (gradeNumber == 3) {
            System.out.println("location - Aquarium\n" +
                    "number of groups - 5\n" +
                    "teacher in charge - Ms. Wilson");

        } else if (gradeNumber == 4) {
            System.out.println("location - Movie theater\n" +
                    "number of groups - 2\n" +
                    "teacher in charge - Ms. Reyes");

        } else if (gradeNumber == 5) {
            System.out.println("location - Museum\n" +
                    "number of groups - 5\n" +
                    "teacher in charge - Ms. Lela");

        } else if (gradeNumber == 6) {
            System.out.println("location - Six Flags\n" +
                    "number of groups - 8\n" +
                    "teacher in charge - Mr. Watt");

        }
    }
}