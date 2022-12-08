package day24CustomMethod_Return_extra;

import java.util.Arrays;

public class day_24_adding_Arrays {

    public static void main(String[] args) {
     int [] number1 = new int[]{2, 4, 5,67,4,23};
     int []  number2 = new int[]{6, 7,85,10,20,30,45};
        addingArray(number1,number2);




    }
    public static int[] addingArray(int [] number1, int [] number2){
        int [] addedArray= new int[number1.length+number2.length];
        for (int i = 0; i < number1.length; i++) {
            addedArray[i] = number1 [i];
        }
        for (int j = 0; j < number2.length; j++) {
            addedArray[number1.length+j]= number2[j];
        }
        System.out.println(Arrays.toString(addedArray));
        return addedArray;
    }
}
