package JAVA_coding.src.MUHTAR_Practice.Array_List_Utilities;

import java.util.ArrayList;

public class convertArrayToArrayList {
    public static void main(String[] args) {
        int [] arr={2,4,6,8,10};
        System.out.println("convertArrayToArrayList(arr) = " + convertArrayToArrayList(arr));

        String [] str= {"Ali","Veli"};
        System.out.println("convertArrayToArrayList(str) = " + convertArrayToArrayList(str));

        ArrayList<Integer> list3= new ArrayList<>(convertArrayToArrayList(arr));
        System.out.println("list3 = " + list3);

    }
    public static ArrayList<Integer> convertArrayToArrayList(int [] array){

        ArrayList<Integer> list =new ArrayList<>();
        for (Integer element : array) {
            list.add(element);
        }
        return list;
    }
    public static ArrayList<String> convertArrayToArrayList(String [] array){

        ArrayList<String> list1 =new ArrayList<>();
        for (String element : array) {
            list1.add((element));
        }
        return list1;
    }
}
