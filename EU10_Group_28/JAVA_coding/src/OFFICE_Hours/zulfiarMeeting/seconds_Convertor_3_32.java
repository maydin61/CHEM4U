package JAVA_coding.src.OFFICE_Hours.zulfiarMeeting;

public class seconds_Convertor_3_32 {
    public static void main(String[] args) {
        int inputSecond;
        int hour;
        int second;
        int minutes;
        inputSecond = 43780;
        hour = inputSecond/3600;
        minutes = (inputSecond%3600)/60;
        second = (inputSecond%3600)%60;

        System.out.println("Hour(s) :"+hour);
        System.out.println("Minutes(s) :"+minutes);
        System.out.println("Seconds(s) :"+second);
    }
}
