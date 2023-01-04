package JAVA_coding.src.MUHTAR_Practice.day_20_Arrays;

import java.util.Arrays;

public class arrayInillazisation {
    public static void main(String[] args) {
        String [] weekDays = new String[]{"Monday", "Tuesday", "Wednesday","Thursday", "Friday", "Saturday", "Sunday"};
                      //index number         0          1            2          3        .......
        System.out.println(Arrays.toString(weekDays));
        System.out.println(Arrays.toString(new String[]{weekDays[0]}));
        System.out.println(Arrays.toString(new String[]{weekDays[1]}));
        System.out.println(Arrays.toString(new String[]{weekDays[2]}));
        System.out.println(Arrays.toString(new String[]{weekDays[4]}));

        int number=5;
        if (number<1 || number>7){
            System.err.println("Invalid number");
            System.exit(0);
        }
        System.out.println(weekDays[number-1]);    // index number of 5 th element is getting with number-1==== > 4,
    }
}
