package day24CustomMethod_Return_extra;

import java.util.Arrays;

public class day_24_addingOfArray {


    public static void main(String[] args) {

        int [] arr1 = {1,2,3};
        int [] arr2 = {4,5};

        int addOfArray [] = new int[arr1.length+arr2.length];
       // addOfArray= {arr1+arr2};
        for (int i = 0; i < arr1.length; i++) {
            addOfArray[i]=arr1[i];
        }
        for (int i = 0; i < arr2.length; i++) {
            addOfArray[arr1.length+i] = arr2[i];
        }
        System.out.println(Arrays.toString(addOfArray));



    }






    public static void addingArray(int [] arr1, int [] arr2){
        int addOfArray [] = new int[arr1.length+arr2.length];
        // addOfArray= {arr1+arr2};
        for (int i = 0; i < arr1.length; i++) {
            addOfArray[i]=arr1[i];
        }
        for (int i = 0; i < arr2.length; i++) {
            addOfArray[arr1.length+i] = arr2[i];
        }
        System.out.println(Arrays.toString(addOfArray));
    }
}
