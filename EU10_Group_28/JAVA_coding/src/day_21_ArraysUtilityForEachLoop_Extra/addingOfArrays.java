package day_21_ArraysUtilityForEachLoop_Extra;

import day_20_Arrays.appearedTwice;
import day_20_Arrays.arraysIntro_day_20;

import java.util.Arrays;

public class addingOfArrays {
    public static void main(String[] args) {
      int []  arr1 = {30, 10, 20};
       int[] arr2 = {15, 40, 25, 35};
        int []arr3 = {8, 9, 17, 5, 4, 1};
        int merge [] =new int [arr1.length+arr2.length+arr3.length];
        for (int i = 0; i < arr1.length; i++) {
            merge[i]= arr1[i];
        }
        for (int i = 0; i < arr2.length; i++) {
            merge[arr1.length+i]=arr2[i];
        }
        for (int i = 0; i < arr3.length; i++) {
            merge[arr1.length+arr2.length+i]=arr3[i];

        }
        System.out.println(Arrays.toString(merge));

        arraysIntro_day_20.main(args);




    }
}
