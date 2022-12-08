package day_21_ArraysUtilityForEachLoop_Extra;

import java.util.Arrays;

public class arrayUtalities {
    public static void main(String[] args) {
        int [] numbers = {1,2,3,5,6,67,78,9,0};
        System.out.println(numbers);
        System.out.println(Arrays.toString(numbers));
        String srt ="Java";
        System.out.println(srt);
        System.out.println("srt = " + srt);
        System.out.printf("", srt);
        System.out.println(Arrays.toString(new String[]{srt}));
        System.out.println(Arrays.toString(new int[]{numbers[6]}));
        int lastIndex= numbers.length;
        System.out.println(Arrays.toString(new int[]{numbers[lastIndex-1]}));
        System.out.println(numbers[lastIndex-1]);
        System.out.println(numbers[2]);
        System.out.println(Arrays.toString(new int[]{numbers[2]}));
    }
}
