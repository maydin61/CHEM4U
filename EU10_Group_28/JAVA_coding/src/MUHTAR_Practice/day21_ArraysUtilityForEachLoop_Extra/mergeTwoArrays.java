package JAVA_coding.src.MUHTAR_Practice.day21_ArraysUtilityForEachLoop_Extra;

import java.util.Arrays;

public class mergeTwoArrays {
    public static void main(String[] args) {
        int [] x  = {3,5,7,89};
        int [] y  = {78,2,9,8,90};
        int k=0;
        int [] z;
        z = new int [x.length + y.length+1];
        for (int i = 0; i < x.length; i++) {
            z[i] = x [i];
        }
        for (int j = 0; j < y.length; j++) {
            z[x.length + j] = y[j];
        }
        System.out.println(Arrays.toString(z));

        for (int each : x) {
            z[k] = each;
            k++;
        }
        for (int each2 : y) {
            z[k] = each2;
            k++;
        }
        System.out.println(Arrays.toString(z));
    }
}
