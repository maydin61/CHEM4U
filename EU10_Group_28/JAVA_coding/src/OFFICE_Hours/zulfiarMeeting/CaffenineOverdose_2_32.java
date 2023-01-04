package JAVA_coding.src.OFFICE_Hours.zulfiarMeeting;

import java.util.Scanner;

public class CaffenineOverdose_2_32 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number of milligrams in drink");
        int numberOfMilligram = scan.nextInt();
        int lethalDrink = (10 * 1000) / numberOfMilligram;
        System.out.println("It would take you about "+lethalDrink+
                " drink for lethal overdose");
    }
}
