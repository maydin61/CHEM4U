package JAVA_coding.src.OFFICE_Hours.zulfiarMeeting;

import java.util.Scanner;

public class day08Practice_3_Tasks {
    public static void main(String[] args) {
        System.out.println("Enter two numbers to console");
        Scanner scan = new Scanner(System.in);
        int n1 = scan.nextInt();
        int n2 = scan.nextInt();
        int result;

        if (n1 == n2) {
            System.out.println("The numbers are equal");

        } else if (n2 > n1) {
            result = (n2 - n1);
            System.out.println("n1 ;" + n1 + "," + " n2 :" + n2 + " :\n"
                    + result + " is maximum number");


        } else if (n1 > n2) {
            result = (n1 - n2);
            System.out.println("n1 ;" + n1 + "," + " n2 :" + n2 + " :\n"
                    + result + " is maximum number");
        }
    }
}
