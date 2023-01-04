package JAVA_coding.src.MUHTAR_Practice.day24CustomMethod_Return_extra;

import java.util.Arrays;

public class day24_addingNewArrayData {
    public static void main(String[] args) {

        addDataToArray(10);
        int [] number={4};


    }

    public static int addDataToArray(int number) {
        int[] arr = {1, 2, 3};
        int[] newArray = new int[arr.length + 1];
        int value = number;
        for (int i = 0; i < newArray.length; i++) {
            newArray[i] = arr[i];
        }
        newArray[arr.length] = value;
        System.out.println(Arrays.toString(newArray));


        return value;
    }

}
