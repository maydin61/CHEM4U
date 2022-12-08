package UtilityClass;

import java.util.Arrays;

public class findMaxOrMinValueIn_Array {
    public static void main(String[] args) {



    }
    public static int findMaxValue(int [] numbers){
        Arrays.sort(numbers);
        System.out.println(numbers.length-1);
        return numbers[numbers.length-1];
    }
    public static double findMaxValue(double [] numbers){
        Arrays.sort(numbers);
        System.out.println(numbers.length-1);
        return numbers[numbers.length-1];
    }
    public static int findMinValue(int [] numbers){
        Arrays.sort(numbers);
        System.out.println(0);
        return numbers[0];
    }
    public static double findMinValue(double [] numbers){
        Arrays.sort(numbers);
        System.out.println(0);
        return numbers[0];
    }

}
