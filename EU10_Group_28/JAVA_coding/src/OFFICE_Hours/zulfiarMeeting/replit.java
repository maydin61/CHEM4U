package JAVA_coding.src.OFFICE_Hours.zulfiarMeeting;

import java.util.Scanner;

public class replit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name, answerToYesNo;

        do {
            System.out.println("Name and Surname:");
            name = input.nextLine();
            System.out.println("Would you like to enter another name yes/no");
            answerToYesNo = input.nextLine();   // yes no answer

        } while (answerToYesNo.equals("yes"));        // because of 'y' will continue, any letter including 'n ' exit
        System.out.println("Guests' list: "+name);
    }
}











