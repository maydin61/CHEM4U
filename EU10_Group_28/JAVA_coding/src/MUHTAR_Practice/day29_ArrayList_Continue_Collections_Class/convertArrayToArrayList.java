package JAVA_coding.src.MUHTAR_Practice.day29_ArrayList_Continue_Collections_Class;

import java.util.ArrayList;

public class convertArrayToArrayList {
    public convertArrayToArrayList(String[] countries) {
    }

    public static void main(String[] args) {
        int [] arr={2,4,6,8,10};
        System.out.println("convertArrayToArrayList(arr) = " + convertArrayToArrayList(arr));


    }
    public static ArrayList<Integer> convertArrayToArrayList(int [] array){

        ArrayList<Integer> list =new ArrayList<>();
        for (Integer element : array) {
            list.add(element);
        }
        return list;
    }

}
