package day_20_Arrays;

import java.util.Arrays;

public class practice2_mergingData {
    public static void main(String[] args) {
        int arr1[] = {1, 2, 3, 4, 5};
        int arr2[] = {4, 5, 6, 7, 8,9};
        int merge [] = new int[arr1.length+arr2.length];

        for (int i = arr1.length - 1; i >= 0; i--) {
            merge[i] = arr1[i];
        }

        for (int j = 0; j < arr2.length; j++) {

            merge[arr1.length+j] = arr2[j];
        }
        System.out.println(Arrays.toString(merge));

        }
}
