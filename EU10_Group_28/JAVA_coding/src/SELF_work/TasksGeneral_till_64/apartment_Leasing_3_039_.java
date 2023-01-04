package JAVA_coding.src.SELF_work.TasksGeneral_till_64;

import java.util.Scanner;

public class apartment_Leasing_3_039_ {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Cyber tech apartment" + "\n" +
                           "Number of apartment you interested");
        int numberOfApart = scanner.nextInt();
        int startingPrice = 0;
        if (numberOfApart == 1) {
            System.out.println("One room apartment was selected");
            startingPrice = 1100;
        } else if (numberOfApart == 2) {
            System.out.println("Two room apartment was selected");
            startingPrice = 1850;

        } else if (numberOfApart == 3) {
            System.out.println("Three room apartment was selected");
            startingPrice = 2550;
        } else {
            System.out.println("Not a such type of room available");
        }
        System.out.println("Starting Price : "+startingPrice);
    }
}