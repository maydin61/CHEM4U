package zulfiarMeeting;

import java.util.Scanner;

public class day08PracticePTasks {
    public static void main(String[] args) {
        System.out.println("Age of kid :");
        Scanner scan = new Scanner(System.in);
        int age = scan.nextByte();

        if (age >= 1 && age <= 5) {
            System.out.println("Elementary school");

        } else if (age >= 6 && age <= 8) {
            System.out.println("Middle school");

        } else if (age >= 9 && age <= 12) {
            System.out.println("High school");

        } else if (age >= 13 && age <= 16) {
            System.out.println("College");

        } else {
            System.out.println("Grad School");
        }
    }
}
