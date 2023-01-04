package JAVA_coding.src.OFFICE_Hours.zulfiarMeeting;

import java.util.Scanner;

public class Timer {
    public static void main(String[] args) throws InterruptedException {

        Scanner scan = new Scanner(System.in);
        System.out.println("please enter the number of min");
        int min = scan.nextInt();

        scan.close();

        for (int i = min; i > 0; i--) {
            for (int sec = 59; sec >= 0; sec--) {
                System.out.print("\r" + (i - 1) + " min and "
                        + sec + " seconds left");
                Thread.sleep(1000);
                System.out.println("\n\n");

                System.err.println("\t* * * * * * * * * * * * * * * * * * * * * * * * * *");
                System.err.println("\t\t\t\t\t\t\t*                                                 *");
                System.err.println("\t\t\t\t\t\t\t*       Times is Up, Please take your seats!      *");
                System.err.println("\t\t\t\t\t\t\t*                                                 *");
                System.err.println("\t\t\t\t\t\t\t* * * * * * * * * * * * * * * * * * * * * * * * * *");

            }

        }
    }
}