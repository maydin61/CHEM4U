package day24CustomMethod_Return_extra;

import java.util.Arrays;

public class day_24_mergeTwoArray {
    private static int[] mergeArray;

    public static void main(String[] args) {

       int [] arr1;
       arr1 = new int[]{2,4,6,8,10};
       int [] arr2;
       arr2 = new int [] {3,6,9,12,15};
       mergeArray(arr1,arr2);

       String str = day_24_return_methodPractice4.removeDublicate("aassdee122234555");

       str = day_24_return_methodPractice4.removeDublicate(str);
       System.out.println(str);

       int numbers;
        numbers = day_24_reverse_Array2.reverseArray(mergeArray);
        System.out.println(numbers);



    }
    public static int[] mergeArray(int [] arr1, int [] arr2) {

        int[] mergedArray = new int[arr1.length + arr2.length];
        for (int i = 0; i < arr1.length; i++) {
            mergedArray[i] = arr1[i];

        }
        for (int i = 0; i < arr2.length; i++) {
            mergedArray[arr1.length + i] = arr2[i];
        }
        System.out.println(Arrays.toString(mergedArray));
        return mergeArray;
    }
   
}
