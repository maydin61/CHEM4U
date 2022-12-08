package day_21_ArraysUtilityForEachLoop_Extra;

import java.util.Arrays;

import static java.lang.System.out;

public class arrayUtalities_copyOf {
    public static void main(String[] args) {
        int[] scores = {20, 40, 56, 57, 75, 77, 45, 23, 90, 56};
        int[] result = Arrays.copyOfRange(scores, 4,scores.length);
        out.println(Arrays.toString(result));

        int [] numbers={1,2,3,4,5,6};
        for (int i = 0; i < numbers.length; i++) {
            int each = numbers[i];
            out.print(each+" - ");
        }
        out.println("");
        for ( int each : numbers ) {
            out.println(each + " + ");
        }
        out.println();
        for (int i = numbers.length - 1; i >= 0; i--) {
            int each1= numbers[i];
            out.print(each1+"   ");
        }
    }
}
