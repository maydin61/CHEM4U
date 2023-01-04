package JAVA_coding.src.OFFICE_Hours.zulfiarMeeting;

import java.util.Scanner;

public class Seconds_Convertor_3_31 {
    public static void main(String[] args) {
        int inPutSeconds, hour, minutes, seconds;
        /* hour= second/3600
           min = second/60
           second=second/1
        */

        inPutSeconds = 3700;
        hour = inPutSeconds /3600;
        int remainderSecondAfterHour = 3700%3600;
        minutes = remainderSecondAfterHour /60;
        int remainderMinAfterMinutes = remainderSecondAfterHour%60;
        seconds =remainderMinAfterMinutes;
        System.out.println(inPutSeconds+" seconds has following hour, minutes, and seconds");
        System.out.println("Hour :"+hour+" Min. :"+minutes+ " Seconds :"+seconds);


        Scanner sc= new Scanner(System.in);
        String word= String.valueOf(new Scanner(System.in));

    }
}
