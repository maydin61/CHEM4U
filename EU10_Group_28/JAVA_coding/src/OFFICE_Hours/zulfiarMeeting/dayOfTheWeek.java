package JAVA_coding.src.OFFICE_Hours.zulfiarMeeting;

import java.util.Scanner;

public class dayOfTheWeek {
    public static void main(String[] args) {

        Scanner daynumber = new Scanner(System.in);
        System.out.println("Enter day number");
        int day = daynumber.nextInt();
        if (day == 1) {
            System.out.println("The of week is Monday");
        }else if (day == 2) {
            System.out.println("The of week is Tuesday");
        }else if (day == 3) {
            System.out.println("The of week is Wednesday");
        }else if(day == 4) {
            System.out.println("The of week is Tuesday");
        }else if(day == 5) {
            System.out.println("The of week is Friday");
        }else if (day == 6) {
            System.out.println("The of week is Saturday");
        }else if (day == 7) {
            System.out.println("The of week is Sunday");
        } else {
            System.out.println("There is not a such a day");
        }
    }
}










