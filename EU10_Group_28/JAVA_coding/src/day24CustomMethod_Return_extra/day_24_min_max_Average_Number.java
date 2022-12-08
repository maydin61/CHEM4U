package day24CustomMethod_Return_extra;

import java.util.Arrays;
import java.util.OptionalInt;

public class day_24_min_max_Average_Number {

    public static void main(String[] args) {
        int [] numbers={10,20,120,40,0,90,2,38,-90,8,100};
        int sum=0;
        Arrays.sort(numbers); // based on sorting we are determine min and max value

        int length=numbers.length;
        int minNumber=numbers[0];
        int maxNumber=numbers[length-1];
        OptionalInt min = Arrays.stream(numbers).min();
        OptionalInt max = Arrays.stream(numbers).max();
        int sum1= Arrays.stream(numbers).sum();
        int[] clone= numbers.clone();

        System.out.println("max #:"+ maxNumber);
        System.out.println("min #:"+ minNumber);
        for (int i = 0; i < length; i++) {
            sum+=numbers[i];

        }
        System.out.println("sum of #:"+sum);
        System.out.println("average of #:"+sum/length);
        System.out.println("min value without sort:"+min);
        System.out.println("max value without sort:"+max);
        System.out.println("sum value without cal.:"+sum1);
        System.out.println("clone value without :"+Arrays.toString(clone));

    }



}
/*
3. create a method that can return the minimum number from an array of integers
 */