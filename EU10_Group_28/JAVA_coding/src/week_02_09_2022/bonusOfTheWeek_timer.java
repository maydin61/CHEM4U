package week_02_09_2022;

import java.time.LocalTime;

public class bonusOfTheWeek_timer {
    public static void main(String[] args) {

        LocalTime today=LocalTime.now();

        System.out.println(("today= "+today));
        int hour=today.getHour();
        System.out.println("hour= "+hour);
        int minutes= today.getMinute();
        System.out.println("minutes= "+minutes);
        int second= today.getSecond();
        System.out.println("seconds= "+second);
        String amOrPm = null;
        System.out.println(hour+":"+minutes+":"+second +" "+ null);


    }




}
