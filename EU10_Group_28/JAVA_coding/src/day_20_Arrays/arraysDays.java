package day_20_Arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class arraysDays {
    public static void main(String[] args) {
        String [] weekDays = new String[]{"Monday", "Tuesday", "Wednesday","Thursday", "Friday", "Saturday", "Sunday"};

        for (int i = weekDays.length-1; i >=0 ; i--) {
          //  System.out.println(Arrays.toString(weekDays[i].toCharArray()));
            System.out.println(Arrays.toString(new String[]{weekDays[i]}));
        }



        for (int i = 0; i < 7; i++) {

            System.out.println(weekDays[i]+", ");
        }
        int [] numbers = new int[]{10, 20, 30, 60};
        System.out.println(Arrays.toString(numbers));

        System.out.println("============");
        int [] scores = new int[5];
        scores[1]=85;   // second scores id 85
        scores[3]=70;   // the 4th one scores id 85
        scores[2]=50;   // the 4th one scores id 85
        scores[0]=80;   // the 4th one scores id 85
        scores[scores.length-1]=95;   // the last one scores id 85

        System.out.println(Arrays.toString(scores)); // before sort

        System.out.println("min value "+Arrays.stream(scores).min());
        System.out.println("max value "+Arrays.stream(scores).max());


        Arrays.stream(scores).sorted();
        System.out.println(Arrays.toString(scores)); // after sort
    }
}
