package JAVA_coding.src.MUHTAR_Practice.day24CustomMethod_Return_extra;

import java.util.Arrays;

public class day_24_reverse_Array2 {
    private static int reverseArray;

    public static void main(String[] args) {

        int []  number;
        number = new int[]{6,7,85,10,20,30,45};
        reverseArray(number);


    }

    public static int reverseArray(int [] number){
        int reverseArr [] =new int[number.length];
        for (int i = 0, j=number.length-1; i < number.length; j--,i++) {
            reverseArr[i]=number[j];
        }

        System.out.println(Arrays.toString(reverseArr));
        return reverseArray;
    }
}
