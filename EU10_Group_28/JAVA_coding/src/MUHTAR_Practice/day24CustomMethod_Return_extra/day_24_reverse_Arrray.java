package JAVA_coding.src.MUHTAR_Practice.day24CustomMethod_Return_extra;

import java.util.Arrays;

public class day_24_reverse_Arrray {

    public static void main(String[] args) {

        sortingArray(new int[]{6, 5, 77, 9});
        reverseArray(new int[]{3, 6, 8, 9,1});


    }


    public static void reverseArray(int[] number) {
        int length2 = number.length;
        int[] reverseArray = new int[length2];
        for (int i = length2 - 1, j = 0; i >= 0; i--, j++) {
            reverseArray[i] = number[j];
        }
        System.out.println(Arrays.toString(reverseArray));



    }
    public static void sortingArray(int [] numbers){
        int length=numbers.length;
        Arrays.sort(numbers);
        int [] reverse = numbers;
        System.out.println(Arrays.toString(reverse));
    }
}
