package day_20_Arrays;

import java.util.Arrays;

public class weekDaysArrays {
    public static void main(String[] args) {
        String [] weekDays = new String[]{"Monday", "Tuesday", "Wednesday","Thursday", "Friday", "Saturday", "Sunday"};

        for (int i = weekDays.length-1; i >=0 ; i--) {
            //  System.out.println(Arrays.toString(weekDays[i].toCharArray()));
            System.out.println(Arrays.toString(new String[]{weekDays[i]}));
        }
        System.out.println("===========");
        for (int i = 0; i < weekDays.length-1; i++) {
            System.out.println(Arrays.toString(new String[]{weekDays[i+1]}));

        }
        System.out.println(Arrays.toString(new String[]{weekDays[0]}));
    }
}
