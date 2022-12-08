package UtilityClass;

import java.util.Arrays;

public class ReverseArrayAndArrayList {
    public static void main(String[] args) {
        int [] numbers= {1,2,3,4,5,6,7};
        howToReverseArray(numbers);
    }
    public static int [] howToReverseArray(int[] num){
        int [] newNumbers=new int[num.length];
        for (int i = num.length-1, j=0; i >=0; i--,j++) {
            newNumbers [i]+= num [j];
        }
        System.out.println(Arrays.toString(newNumbers));
        return newNumbers;
    }
}
